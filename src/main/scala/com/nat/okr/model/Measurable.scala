package com.nat.okr.model

trait Measurable[A] {
  def add(a: A): A
  def minus(a: A): A
}
