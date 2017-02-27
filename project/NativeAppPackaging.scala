import sbt._
import sbt.Keys._
import com.typesafe.sbt.SbtNativePackager.Universal
import com.typesafe.sbt.packager.Keys.executableScriptName
import com.typesafe.sbt.packager.universal.UniversalPlugin

import scala.scalanative.sbtplugin.ScalaNativePlugin
import scala.scalanative.sbtplugin.ScalaNativePlugin.AutoImport._

/**
 * == Native App Archetype ==
 *
 * Bundles the native binary into a distributable package
 */
object NativeAppPackaging extends AutoPlugin {

  override lazy val requires = ScalaNativePlugin && UniversalPlugin

  override lazy val projectSettings: Seq[Setting[_]] = Seq(
    mappings in Universal += {
      val binary = nativeLink.value
      val name = executableScriptName.value
      binary -> name
    }
  )
}
