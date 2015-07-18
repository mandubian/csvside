name := "csvside"

organization := "io.underscore"

version := "0.1"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-feature",
  "-unchecked",
  "-deprecation"
)

// Cats:

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(
  "org.spire-math" %% "cats-core" % "0.1.0-SNAPSHOT",
  "org.spire-math" %% "cats-std"  % "0.1.0-SNAPSHOT"
)

// OpenCSV:

libraryDependencies ++= Seq(
  "com.opencsv" % "opencsv" % "3.4"
)

// Scalatest:

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)