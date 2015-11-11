val scalaTest = "org.scalatest" %% "scalatest" % "2.2.4" % "test"

lazy val commonSettings = Seq(
  organization := "sarg",
  version := "0.1.0",
  scalaVersion := "2.11.7"
)

lazy val root = (project in file(".")).
  settings(commonSettings: _*).
  settings(scalariformSettings: _*).
  settings(
    name := "Scala Bomb",
    libraryDependencies ++= Seq(scalaTest)
)