package com.nat.okr.model

case class OKR[A<:Measurable[A]](
  objective: Objective,
  keyResults: List[KeyResult[A]]
)
