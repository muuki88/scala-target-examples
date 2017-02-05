package net.gutefrage

import de.mukis.shared.GreetingService

import scala.scalajs.js

object MainApp extends js.JSApp {
  def main(): Unit = {
    val greeter = new GreetingService("node")
    greeter.sayHello("en")
    greeter.sayHello("de")

    // demonstrate node module integration
    println(s"hello world v4 ${uuid.v4()}")
    println(s"hello world v1 ${uuid.v1()}")
  }

}
