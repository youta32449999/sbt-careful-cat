package com.github.youta32449999.sbt.carefulcat

import sbt._
object SbtCarefulCatPlugin extends AutoPlugin {
  override def trigger = allRequirements

  override lazy val projectSettings = Seq(
    (Test / Keys.test) := {
      (Test / Keys.test).value
      println(carefulCat)
    },
    (Test / Keys.testOnly) := {
      (Test / Keys.testOnly).evaluated
      println(carefulCat)
    },
    (Test / Keys.testQuick) := {
      (Test / Keys.testQuick).evaluated
      println(carefulCat)
    }
  )

  private val carefulCat =
    """
      |･･･ヨシ！
      |　　　 ∧　　/ヽ
      |　　　/／￣￣＼|
      |　　 ∠＿╋＿＿〉
      |　　/　①八①　ヽ ＿
      |　 工ﾆf(_人_)ｴ二|′)ヽ
      |　　＼ヽヽノノ ノ ヘ |
      |⊂⌒)_＞―――′イ (＿)
      |　`ー､_ノ/￣ヽ　｜
      |　　 ＿|｜　 |　｜
      |　　(　 人＿ノ　Λ
      |　　 ＼ス￣￣ﾚ-Λ ＼
      |　　(￣　)　/ /　＼ﾉ＼
      |　　 ￣￣　(　ヽ　 ＼_)
      |　　　　　　＼ノ
      |
      |""".stripMargin
}

