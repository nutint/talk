package com.nat.talkapp.engine

import akka.actor.ActorSystem
import akka.testkit.{ImplicitSender, TestKit}
import com.nat.talkapp.engine.EngineActor._
import com.nat.talkapp.engine.repository.RoomRepository
import org.scalatest._
import org.scalatest.mockito.MockitoSugar

class EngineActorSpec
  extends TestKit(ActorSystem("EngineSpecSystem"))
    with ImplicitSender
    with WordSpecLike
    with Matchers
    with BeforeAndAfterAll
    with MockitoSugar {

  override def afterAll: Unit = {
    TestKit.shutdownActorSystem(system)
  }

  "An Engine actor" must {

    "be fail when connect with the invalid credential" in pending
    "be success when connect with valid credential" in pending

    "be able to create room" in {
      val mockedRepo = mock[RoomRepository]
      val engineActor = system.actorOf(EngineActor.engineProps(mockedRepo))
      engineActor ! CreateRoom
      expectMsg(CreatedRoomSuccess("1234"))
    }

    "be able to close the room" in {
      val mockedRepo = mock[RoomRepository]
      val engineActor = system.actorOf(EngineActor.engineProps(mockedRepo))
      engineActor ! CloseRoom
      expectMsg(CloseRoomSuccess())
    }

    "be able to add new participant" in pending

    "be able to remove participant" in pending

    "be able to send message to the room to a participant from a participant" in pending

    "be able to send message to all participants from a participant" ignore  {

    }

    "be able to connect to an existing room by room id, and valid credential" in pending
    "be able to join multiple room and receive update from all room" in pending
    "be able to disable notification from specific room" in pending
    "be able to enable notification from disabled specific room" in pending
  }


}
