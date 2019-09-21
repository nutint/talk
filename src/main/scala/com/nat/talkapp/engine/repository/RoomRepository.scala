package com.nat.talkapp.engine.repository
import Repository._
import com.nat.talkapp.engine.model.Room

trait RoomRepository {
  def createRoom(roomInfo: Room): RepositoryResultF[String]
  def updateRoom(id: String, roomInfo: Room): RepositoryResultF[Unit]
  def deleteRoom(id: String): RepositoryResultF[Unit]
}
