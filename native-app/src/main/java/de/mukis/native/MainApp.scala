package de.mukis.native

import de.mukis.shared.GreetingService

object MainApp {

  def main(args: Array[String]): Unit = {
    val greeter = new GreetingService("native")
    greeter.sayHello("en")
    greeter.sayHello("de")
    args.foreach(println)
  }
}
