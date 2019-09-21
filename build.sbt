name := "talk"

version := "0.1"

scalaVersion := "2.12.9"


lazy val akkaVersion = "2.5.25"
lazy val akkaHttpVersion = "10.1.10"
lazy val akkaStreamVersion = "2.5.25"

lazy val catsVersion =  "2.0.0-RC1"

lazy val mockitoVersion = "1.8.4"
lazy val scalaTestVersion = "3.0.8"

libraryDependencies ++= Seq(
  akka, akkaHttp, akkaStream,
  cats,
  scalaTest, mockito
).flatten

val akka = Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
)

val akkaHttp = Seq(
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion,
)

val akkaStream = Seq(
  "com.typesafe.akka" %% "akka-stream" % akkaStreamVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaStreamVersion,
)

val cats = Seq(
  "org.typelevel" %% "cats-core" % catsVersion
)

val scalaTest = Seq(
  "org.scalactic" %% "scalactic" % scalaTestVersion,
  "org.scalatest" %% "scalatest" % scalaTestVersion % "test",
)

val mockito = Seq(
  "org.mockito" % "mockito-all" % mockitoVersion % "test",
)

scalacOptions += "-Ypartial-unification"
