package de.mukis.shared

class GreetingService(who: String) {
  def sayHello(): Unit = println(s"$who says 'hello scalasphere'")
}
