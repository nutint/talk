package com.nat.okr.model

case class Checkpoint[A<:Measurable[A]](
  name: String,
  period: Period,
  okrs: List[OKR[A]]
)
