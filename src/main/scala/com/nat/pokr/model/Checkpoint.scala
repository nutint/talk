package com.nat.pokr.model

case class Checkpoint(
  name: String,
  period: Period,
  okrs: List[OKR]
)
