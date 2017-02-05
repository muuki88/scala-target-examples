package de.mukis.jvm

import de.mukis.shared.GreetingService

object MainApp extends App {
  val greeter = new GreetingService("jvm")
  greeter.sayHello("en")
  greeter.sayHello("de")
}
