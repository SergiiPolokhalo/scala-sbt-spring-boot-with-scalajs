import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType}

val sharedSettings = Seq(scalaVersion := "2.12.6")

lazy val app =
  crossProject(JSPlatform, JVMPlatform)
    .crossType(CrossType.Full)
    .settings(sharedSettings)
    .jsSettings(
      libraryDependencies ++= Seq(
        "org.scala-js" %%% "scalajs-dom" % "0.9.6"
      ),
      Seq(scalaJSUseMainModuleInitializer := true)
    )
    .jvmSettings(
      libraryDependencies ++= Seq(
        "org.springframework.boot" % "spring-boot-starter-web"       % "2.0.5.RELEASE",
        "org.springframework.boot" % "spring-boot-starter-thymeleaf" % "2.0.5.RELEASE"
      )
    )
