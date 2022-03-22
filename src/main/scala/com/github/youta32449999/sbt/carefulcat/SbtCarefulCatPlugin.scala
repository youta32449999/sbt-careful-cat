package com.github.youta32449999.sbt.carefulcat

import sbt._
object SbtCarefulCatPlugin extends AutoPlugin {
  override def trigger = allRequirements

  override lazy val projectSettings = Seq(
    (Test / Keys.test) := {
      (Test / Keys.test).value
      println(CarefulCat.AsciiArt)
    },
    (Test / Keys.testOnly) := {
      (Test / Keys.testOnly).evaluated
      println(CarefulCat.AsciiArt)
    },
    (Test / Keys.testQuick) := {
      (Test / Keys.testQuick).evaluated
      println(CarefulCat.AsciiArt)
    }
  )
}

