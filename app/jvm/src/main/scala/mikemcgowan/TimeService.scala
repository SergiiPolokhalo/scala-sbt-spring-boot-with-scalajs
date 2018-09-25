package mikemcgowan

import java.time.format.DateTimeFormatter
import java.time.{Clock, LocalDateTime}

import org.springframework.stereotype.Service

@Service
class TimeService {

  def localDateTime(): String = {
    val t = LocalDateTime now Clock.systemUTC()
    t format DateTimeFormatter.ISO_LOCAL_DATE_TIME
  }

}
