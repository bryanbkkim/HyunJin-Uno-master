lazy val root = (project in file("."))
  .settings(
    name                := "UNO",
    scalaVersion        := "2.12.3",
    version             := "0.0.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
  )