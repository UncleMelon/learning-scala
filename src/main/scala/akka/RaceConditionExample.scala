package akka

import concurrent.Future
import concurrent.ExecutionContext.Implicits.global

object RaceConditionExample {
  def main(args: Array[String]): Unit = {
    var i, j = 0
    (1 to 100000).foreach(_ => Future {i = i + 1})
    (1 to 100000).foreach(_ => j = j + 1)
    Thread.sleep(1000)
    println(s"${i} ${j}")
  }
}
