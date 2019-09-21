package com.nat.talkapp.engine

import akka.actor.{Actor, Props}
import com.nat.talkapp.engine.model.Member
import com.nat.talkapp.engine.repository.RoomRepository

class EngineActor(
  roomRepository: RoomRepository
) extends Actor {
  import com.nat.talkapp.engine.EngineActor._
  override def receive: Receive = {
    case CreateRoom(members: List[Member]) => sender() ! createRoom(members)
    case CloseRoom => sender() ! closeRoom
  }

  def createRoom(members: List[Member]) = CreatedRoomSuccess("1234")
  def closeRoom = CloseRoomSuccess()
}

object EngineActor {
  trait EngineCmd
  case class CreateRoom(members: List[Member]) extends EngineCmd
  case class CloseRoom() extends EngineCmd

  trait EngineResult
  trait CreateRoomResult extends EngineResult
  case class CreatedRoomSuccess(roomId: String) extends CreateRoomResult
  case class CreateRoomFailed(reason: String) extends CreateRoomResult

  trait CloseRoomResult extends EngineResult
  case class CloseRoomSuccess() extends CloseRoomResult
  case class CloseRoomFailed(reason: String) extends CloseRoomResult

  def engineProps(roomRepository: RoomRepository): Props = Props(new EngineActor(roomRepository))
}
