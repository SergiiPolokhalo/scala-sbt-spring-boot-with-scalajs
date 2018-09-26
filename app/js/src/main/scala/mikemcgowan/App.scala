package mikemcgowan

import org.scalajs.dom.document
import org.scalajs.dom.Element
import org.scalajs.dom.window.setInterval

object App {

  private var upTo = 10

  def main(args: Array[String]): Unit = {
    val container = (document getElementsByClassName "container")(0)
    append("p", "hello", container)
    append("code", "primes", container)
    setInterval(() => run(), 2000)
    run()
  }

  def run(): Unit = {
    val hello = document getElementById "hello"
    hello.textContent = "Hello from Scala.js! Primes up to %d are:" format upTo
    val primes = document getElementById "primes"
    primes.textContent = Sieve primes upTo mkString ", "
    upTo = if (upTo >= 100) 10 else upTo + 10
  }

  def append(tag: String, id: String, target: Element): Unit = {
    val child = document createElement tag
    child setAttribute ("id", id)
    target appendChild child
  }

}
