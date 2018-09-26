package mikemcgowan

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

  @GetMapping(Array("/"))
  def index(model: Model): String = {
    val n = 100
    model addAttribute ("hello", "Hello from Spring Boot! Primes up to %d are:" format n)
    model addAttribute ("primes", Sieve primes n mkString ", ")
    "index"
  }

}
