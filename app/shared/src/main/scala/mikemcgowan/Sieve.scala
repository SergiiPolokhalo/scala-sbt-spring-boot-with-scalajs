package mikemcgowan

// https://exercism.io/tracks/scala/exercises/sieve/solutions/41f2f93a967547d1b0533bc7caa106a2

object Sieve {

  def primes(n: Int): List[Int] =
    if (n < 2)
      Nil
    else {
      val xs = f(2, ((2 to n) zip List.fill(n)(false)).toList) // all unmarked to begin with
      (xs filterNot (_._2)) map (_._1)
    }

  @annotation.tailrec
  private def f(n: Int, xs: List[(Int, Boolean)]): List[(Int, Boolean)] = {
    xs dropWhile (t => t._2 || t._1 < n) match {
      case (next, _) :: _ => f( // there is a next value - mark all unmarked multiples
        n + 1,
        xs map {
          case (a, false) if (a > next) && (a % next == 0) => (a, true)
          case t => t
        }
      )
      case _ => xs // there is no next value - terminate
    }
  }

}

