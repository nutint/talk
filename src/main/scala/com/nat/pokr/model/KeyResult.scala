package com.nat.pokr.model

/**
  * Key Result has different measure approaches eg
  *  - Accumulation
  *  - Final Capability
  */
trait KeyResult
case class AccumulationKeyResult[A](
  name: String,
  target: A,
  records: KeyResultRecord[A]
) extends KeyResult

case class FinalCapabilityKeyResult[A](
  name: String,
  target: A,
  records: KeyResultRecord[A]
) extends KeyResult
