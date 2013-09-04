package pl.grasser.tripplanner.service

import akka.actor.{ActorSystem, Props}
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 9/4/13
 * Time: 9:06 PM
 */

class LocationServiceTest extends FunSuite with ShouldMatchers{

  test("Test consuming message"){
    val system = ActorSystem("TestSystem")
    val locationService = system.actorOf(Props[LocationService])
    locationService ! " sialalal"
  }

}
