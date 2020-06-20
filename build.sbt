name := "cassandra-launcher"

organization := "com.evolutiongaming"

homepage := Some(new URL("http://github.com/evolution-gaming/cassandra-launcher"))

startYear := Some(2018)

organizationName := "Evolution Gaming"

organizationHomepage := Some(url("http://evolutiongaming.com"))

bintrayOrganization := Some("evolutiongaming")

scalaVersion := crossScalaVersions.value.head

crossScalaVersions := Seq("2.13.0", "2.12.9")

Test / fork := true

scalacOptions in(Compile, doc) ++= Seq("-groups", "-implicits", "-no-link-warnings")

resolvers += Resolver.bintrayRepo("evolutiongaming", "maven")

libraryDependencies ++= Seq(
  "com.evolutiongaming"  %% "tmp-dir"       % "0.0.4",
  "org.apache.cassandra"  % "cassandra-all" % "3.11.6" exclude("commons-logging", "commons-logging"),
  "org.scalatest"        %% "scalatest"     % "3.2.0" % Test)

licenses := Seq(("MIT", url("https://opensource.org/licenses/MIT")))

releaseCrossBuild := true

scalacOptsFailOnWarn := Some(false)