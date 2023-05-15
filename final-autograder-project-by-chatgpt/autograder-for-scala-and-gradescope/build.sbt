import Dependencies._

// ThisBuild / scalaVersion     := "2.13.10"
// ThisBuild / version          := "0.1.0-SNAPSHOT"
// ThisBuild / organization     := "com.example"
// ThisBuild / organizationName := "example"

// lazy val root = (project in file("."))
//   .settings(
//     name := "autograder for scala and gradescope",
//     libraryDependencies += munit % Test
//   )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.


libraryDependencies += "junit" % "junit" % "4.13.2"

lazy val jh61b = ("com.gradescope" % "jh61b" % "1.0" from s"""https://github.com/ucsb-gradescope-tools/jh61b/raw/master/jh61b-1.0.jar""")

libraryDependencies += jh61b

lazy val root = (project in file("."))
  .settings(
    name := "autograder for scala and gradescope",
    organization := "edu.njit.ds",
    version := "0.1",
    scalaVersion := "2.13.6",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test,
    libraryDependencies += munit % Test,
    // libraryDependencies += "com.gradescope" %% "autograder-interface" % "1.0",
    testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oD"),
    Test / fork := true
  )
