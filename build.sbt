ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.19"

lazy val lib = project
  .in(file("modules/lib"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    ),
  )

lazy val app = project
  .in(file("modules/app"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.18" % Test
    ),
    Test / javaOptions ++= Seq(
      "-Dfoo=123"
    ),
    Test / fork := false,
    Test / parallelExecution := false,
    //Test / testOptions += Tests.Argument(TestFrameworks.ScalaTest, "-oDF"),
  )
  .dependsOn(lib % "compile->compile;test->test")

lazy val root = project
  .in(file("."))
  .aggregate(lib, app)
