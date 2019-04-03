name := """pro_play_java"""
organization := "com.heigvd-pro-b-08"

version := "1.0-SNAPSHOT"

lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava)

scalaVersion := "2.12.8"

libraryDependencies += guice
libraryDependencies += "junit" % "junit" % "4.12" % "test"
libraryDependencies += javaJdbc
libraryDependencies += jdbc
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.5.jre6"

// "org.postgresql" % "postgresql" % "42.1.5"