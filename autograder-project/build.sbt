name := "AutograderProject"

version := "1.0"

scalaVersion := "2.13.6"

libraryDependencies += "junit" % "junit" % "4.13.2"

lazy val jh61b = ("com.gradescope" % "jh61b" % "1.0" from s"""https://github.com/ucsb-gradescope-tools/jh61b/raw/master/jh61b-1.0.jar""")

libraryDependencies += jh61b
