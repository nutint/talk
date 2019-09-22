package com.nat.pokr.model

case class OKR[A<:Measurable[A]](
  objective: Objective,
  keyResults: List[KeyResult[A]]
)
