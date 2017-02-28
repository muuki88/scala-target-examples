package de.mukis.js

import de.mukis.shared.GreetingService

import scala.scalajs.js

object MainApp extends js.JSApp {
  def main(): Unit = {
    val greeter = new GreetingService("node")
    greeter.sayHello()

    // demonstrate node module integration
    println(s"uuid.v4(): ${uuid.v4()}")
    println(s"uuid.v1(): ${uuid.v1()}")
  }

}
