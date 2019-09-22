package com.nat.pokr.model

case class Project[A<:Measurable[A]](vision: Vision, checkpoint: Checkpoint[A])
