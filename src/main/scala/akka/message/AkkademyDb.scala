package akka.message

import akka.actor.Actor
import akka.event.Logging

import scala.collection.mutable.HashMap

class AkkademyDb extends Actor{
  val map = new HashMap[String, Object]
  val log = Logging(context.system, this)

  override def receive: Receive = {
    case SetRequest(key, value) => {
      log.info("received SetRequest - key: {} value: {}", key, value)
      map.put(key, value)
    }
    case o => log.info("received unknown message: {}", o)
  }
}