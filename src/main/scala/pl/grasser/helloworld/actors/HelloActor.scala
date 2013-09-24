package pl.grasser.tripplanner.service

import akka.actor.{ActorLogging, Actor}

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 16.03.13
 * Time: 23:01
 */

class HelloActor extends Actor with ActorLogging {

  def receive = {
    case "test" ⇒ log.info("received test")
    case "hello" ⇒ {
      log.info("received hello")
      sender ! "Hello!"
    }
    case _ ⇒ log.info("received unknown message")
  }


}
