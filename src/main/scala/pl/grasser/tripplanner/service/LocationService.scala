package pl.grasser.tripplanner.service

import akka.actor.{ActorLogging, Actor}

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 16.03.13
 * Time: 23:01
 */

class LocationService extends Actor with ActorLogging{

  def receive = {
    case "test" ⇒ log.info("received test")
    case _      ⇒ log.info("received unknown message")
  }


}
