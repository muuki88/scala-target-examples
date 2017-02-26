package net.gutefrage.native

import sbt._
import sbt.Keys._
import com.typesafe.sbt.SbtNativePackager.Universal
import com.typesafe.sbt.packager.Keys.executableScriptName
import com.typesafe.sbt.packager.universal.UniversalPlugin

import scala.scalanative.sbtplugin.ScalaNativePlugin
import scala.scalanative.sbtplugin.ScalaNativePlugin.AutoImport._

object NativeAppPackaging extends AutoPlugin {

  override lazy val requires = UniversalPlugin && ScalaNativePlugin

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    mappings in Universal += {
      val binary = nativeLink.value
      val name = executableScriptName.value
      binary -> name
    }
  )
}
