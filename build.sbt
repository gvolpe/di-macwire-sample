name := """di-macwire-sample"""

version := "1.0"

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  "com.softwaremill.macwire" %% "macros" % "0.7.3",
  "com.softwaremill.macwire" %% "runtime" % "0.7.3",
  "org.scalatest" %% "scalatest" % "2.1.6" % "test"
)
