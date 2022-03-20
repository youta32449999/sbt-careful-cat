lazy val plugin = (project in file("."))
  .settings(
    name := "sbt-careful-cat",
    organization := "com.github.youta32449999",
    version := "0.1.0-SNAPSHOT",
    sbtPlugin := true
  )
