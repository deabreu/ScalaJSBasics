enablePlugins(ScalaJSPlugin)

name := "ScalaJSBasicTutorial"

version := "0.1"

scalaVersion := "2.12.6"

scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.6"
libraryDependencies += "com.lihaoyi" %%% "scalatags" % "0.6.7"
libraryDependencies += "org.querki" %%% "jquery-facade" % "1.2"
