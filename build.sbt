ThisBuild / scalaVersion := "3.3.6"

lazy val root = Project
  .in(file("."))
  .settings(
    name := "simulator",
    libraryDependencies ++= Seq(
      ("org.apache.spark" %% "spark-sql" % "4.0.1").cross(CrossVersion.for3Use2_13),
      "org.scala-lang.modules" %% "scala-swing" % "3.0.0",
      ("org.apache.spark" %% "spark-mllib" % "4.0.1").cross(CrossVersion.for3Use2_13),
      "org.apache.spark" %% "spark-graphx" % "4.2.1"
    ),

    Compile / run / fork := true,
    Compile / run / javaHome := Some(file("C:/Program Files/Java/jdk-17"))
  )
