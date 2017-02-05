package de.mukis.shared

//import scala.scalajs.js.annotation.JSExport

//@JSExport
class GreetingService(who: String) {

  def sayHello(lang: String): Unit = lang match {
    case "en" => println(s"$who: Hello world")
    case "de" => println(s"$who Hallo Welt")
    case _ => println(s"$who Hi")
  }
}
