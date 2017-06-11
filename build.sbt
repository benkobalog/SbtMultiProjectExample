name := "MultiProjectTest"

lazy val commonSettings = Seq(
  organization := "com.example",
  version := "0.1.0",
  scalaVersion := "2.12.2"
)

lazy val schema = (project in file("schema"))
  .settings(commonSettings)

lazy val server =
  (project in file(".")).settings(commonSettings).dependsOn(schema)
