name := "akka-http-webgoat"
version := "1.0"

scalaVersion := "2.13.8"
scalacOptions ++= Seq("-deprecation", "-feature")

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.1.15",
  "com.typesafe.akka" %% "akka-stream" % "2.6.19",
)

//Compile / unmanagedSourceDirectories += baseDirectory.value / "extra-src"
