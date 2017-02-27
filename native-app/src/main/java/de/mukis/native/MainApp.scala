package de.mukis.native

import de.mukis.shared.GreetingService

object MainApp {

  def main(args: Array[String]): Unit = {
    val greeter = new GreetingService("native")
    greeter.sayHello()

    println("Arguments")
    println(args.mkString(" "))
    println()
  }
}
