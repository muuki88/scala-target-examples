// shadow sbt-scalajs' crossProject and CrossType until Scala.js 1.0.0 is released
import sbtcross.{crossProject, CrossType}

val commonSettings = Seq(
  scalaVersion := "2.11.8",
  // to resolve scala-native snapshot
  resolvers += Resolver.sonatypeRepo("snapshots")
)

lazy val root = project
  .in(file("."))
  .aggregate(jvmApp, nodeApp, nativeApp)

lazy val shared =
  crossProject(JSPlatform, JVMPlatform, NativePlatform)
    .crossType(CrossType.Pure) // [Pure, Full, Dummy], default: CrossType.Full
    .settings(commonSettings)
    .jsSettings( /* ... */ ) // defined in sbt-scalajs-cross
    .jvmSettings( /* ... */ )
    // (7) configure Scala-Native settings
    .nativeSettings( /* ... */ ) // defined in sbt-scala-native

lazy val sharedJS = shared.js
lazy val sharedJVM = shared.jvm
lazy val sharedNative = shared.native

lazy val jvmApp = project
  .in(file("jvm-app"))
  .enablePlugins(JavaAppPackaging)
  .settings(commonSettings)
  .settings(
    name := "jvm-app"
  )
  .dependsOn(sharedJVM)

lazy val nodeApp = project
  .in(file("node-app"))
  .enablePlugins(ScalaJSPlugin, NodePackagingPlugin)
  .settings(commonSettings)
  .settings(
    name := "node-app",
    npmDependencies in Compile ++= Seq(
      "node-uuid" -> "1.4.7"
    )
  )
  .dependsOn(sharedJS)

lazy val nativeApp = project
  .in(file("native-app"))
  .enablePlugins(ScalaNativePlugin, NativePackagingPlugin)
  .settings(commonSettings)
  .settings(
    name := "native-app"
  )
  .dependsOn(sharedNative)
