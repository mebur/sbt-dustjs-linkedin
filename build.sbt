name := "sbt-dustjs-linkedin"
organization := "se.sogeti.sbt"
ThisBuild / description := "An SBT plugin to compile Dustjs templates."
ThisBuild / licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

sbtPlugin := true

addSbtJsEngine("1.3.7")

ThisBuild / dynverVTagPrefix := false
