package com.nat.pokr.model

case class Checkpoint[A<:Measurable[A]](
  name: String,
  period: Period,
  okrs: List[OKR[A]]
)
