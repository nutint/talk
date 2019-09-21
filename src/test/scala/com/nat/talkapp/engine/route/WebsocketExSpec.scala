package com.nat.talkapp.engine.route

import akka.http.scaladsl.model.ws._
import akka.http.scaladsl.testkit.{ScalatestRouteTest, WSProbe}
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.stream.scaladsl._
import org.scalatest.{Matchers, WordSpec}

class WebsocketExSpec
  extends WordSpec
    with Matchers
    with ScalatestRouteTest
{

  def greeter: Flow[Message, Message, Any] =
    Flow[Message].mapConcat {
      case tm: TextMessage =>
        TextMessage(Source.single("Hello ") ++ tm.textStream ++ Source.single("!")) :: Nil
      case bm: BinaryMessage =>
        // ignore binary message but need to drain content
        bm.dataStream.runWith(Sink.ignore)
        Nil
    }

  val websocketRoute: Route = path("greeter") {
    handleWebSocketMessages(greeter)
  }
  /**
    * Using this need to have akka stream as dependencies
    */
  val wsClient = WSProbe()

  "Websocket greeter" should {
    "response message when say greet" in {
      WS("/greeter", wsClient.flow) ~> websocketRoute ~> check {
        isWebSocketUpgrade shouldEqual true
      }
    }
  }
}
