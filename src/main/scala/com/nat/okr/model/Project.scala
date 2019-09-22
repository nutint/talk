package com.nat.okr.model

case class Project[A<:Measurable[A]](vision: Vision, checkpoint: Checkpoint[A])
