package com.nat.pokr.model

trait Measurable[A] {
  def add(a: A): A
  def minus(a: A): A
}
