name := """herokuplayslick"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

resolvers += "Scalaz Bintray Repo" at "https://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(
  "com.typesafe.play" %% "play-slick" % "1.0.1",
  "com.typesafe.play" %% "play-slick-evolutions" % "1.0.1",
  "org.postgresql" % "postgresql" % "9.4-1201-jdbc41",
  "com.typesafe.slick" %% "slick" % "3.0.3",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  specs2 % Test
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
