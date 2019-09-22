package com.nat.okr.model

/**
  * Key Result has different measure approaches eg
  *  - Accumulation
  *  - Final Capability
  */
trait KeyResult[A]
case class AccumulationKeyResult[A](
  name: String,
  target: A,
  records: KeyResultRecord[A]
) extends KeyResult[A]

case class FinalCapabilityKeyResult[A](
  name: String,
  target: A,
  records: KeyResultRecord[A]
) extends KeyResult[A]
