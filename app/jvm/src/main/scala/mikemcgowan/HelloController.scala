package mikemcgowan

import org.springframework.stereotype.Controller
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloController {

  @Autowired
  var timeService: TimeService = _

  @GetMapping(Array("/"))
  def index(model: Model): String = {
    model.addAttribute("greeting",
      String format (
        "Greetings from Spring Boot @ %s",
        timeService.localDateTime()
      )
    )
    "index"
  }

}
