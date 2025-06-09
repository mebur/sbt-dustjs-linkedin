name := "sbt-dustjs-linkedin"
organization := "se.sogeti.sbt"
ThisBuild / description := "An SBT plugin to compile Dustjs templates."
ThisBuild / licenses += ("MIT", url("https://opensource.org/licenses/MIT"))

sbtPlugin := true

addSbtJsEngine("1.3.7")

ThisBuild / dynverVTagPrefix := false

// Sanity-check: assert that version comes from a tag (e.g. not a too-shallow clone)
// https://github.com/dwijnand/sbt-dynver/#sanity-checking-the-version
Global / onLoad := (Global / onLoad).value.andThen { s =>
  dynverAssertTagVersion.value
  s
}
