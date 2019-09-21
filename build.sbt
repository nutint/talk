name := "talk"

version := "0.1"

scalaVersion := "2.12.9"

lazy val scalaTestVersion = "3.0.8"
lazy val akkaVersion = "2.5.25"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % "test",
  "org.mockito" % "mockito-all" % "1.8.4" % "test",
  "org.typelevel" %% "cats-core" % "2.0.0-RC1",
)

scalacOptions += "-Ypartial-unification"
