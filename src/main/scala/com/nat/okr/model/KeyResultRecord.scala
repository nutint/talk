package com.nat.okr.model

import java.util.Date

case class KeyResultRecord[A](
  title: String,
  description: Option[String],
  date: Date,
  amount: A
)
