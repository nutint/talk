package com.nat.pokr.model

case class OKR(
  objective: Objective,
  keyResults: List[KeyResult[_]]
)
