package com.nat.talkapp.engine.repository

import scala.concurrent.Future

object Repository {
  type RepositoryResult[A] = Either[String, A]
  type RepositoryResultF[A] = Future[RepositoryResult[A]]
}
