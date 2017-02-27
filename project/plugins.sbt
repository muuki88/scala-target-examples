resolvers += Resolver.sonatypeRepo("snapshots")

// Packaging
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.2.0-M8")

// cross building
// https://github.com/scala-native/sbt-cross
addSbtPlugin("org.scala-native" % "sbt-crossproject" % "0.1.0")
addSbtPlugin("org.scala-native" % "sbt-scalajs-crossproject" % "0.1.0")

// Node Application
// ~~~~~~~~~~~~~~~~
// scalajs-bundler is not yet compatible with 0.6.14
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.13")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.4.0")

// Native Application
// ~~~~~~~~~~~~~~~~~~
addSbtPlugin("org.scala-native" % "sbt-scala-native" % "0.1.0")
