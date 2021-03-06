import sbt._

object Dependencies {
  lazy val dataDeps = Seq(
    "com.monsanto.labs" %% "mwundo-core" % "0.5.0",
    "com.monsanto.labs" %% "mwundo-spray" % "0.5.0",
    "com.github.pureconfig" %% "pureconfig" % "0.9.1"
  )
  lazy val catsDeps = Seq(
    "org.typelevel" %% "cats-core" % "1.4.0",
    "org.typelevel" %% "cats-effect" % "1.0.0"
  )
  lazy val akkaDeps = Seq(
    "com.typesafe.akka" %% "akka-http" % "10.1.5",
    "com.typesafe.akka" %% "akka-stream" % "2.5.12"
  )
  lazy val httpDeps = Seq(
    "io.circe" %% "circe-generic" % "0.9.0",
    "io.circe" %% "circe-parser" % "0.9.0",
    "io.circe" %% "circe-generic-extras" % "0.9.0",
    "org.scalaj" %% "scalaj-http" % "2.4.0",
    "de.heikoseeberger" %% "akka-http-circe" % "1.22.0"
  )
  lazy val logDeps = Seq(
    "ch.qos.logback" % "logback-classic" % "1.2.3",
    "com.typesafe.scala-logging" %% "scala-logging" % "3.9.0"
  )
  lazy val testDeps = Seq(
    "org.scalactic" %% "scalactic" % "3.0.5",
    "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )
  lazy val dbDeps = Seq(
    "org.tpolecat" %% "doobie-core" % "0.6.0",
    "org.tpolecat" %% "doobie-postgres" % "0.6.0", // Postgres driver 42.2.5 + type mappings.
    "com.zaxxer" % "HikariCP" % "2.6.3",
    "org.flywaydb" % "flyway-core" % "4.2.0"
  )

  lazy val all = dataDeps ++ httpDeps ++ akkaDeps ++ catsDeps ++ dbDeps ++ logDeps ++ testDeps
}