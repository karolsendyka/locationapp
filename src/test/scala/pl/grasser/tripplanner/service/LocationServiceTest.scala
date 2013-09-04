package pl.grasser.tripplanner.service

import akka.actor.Props
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 9/4/13
 * Time: 9:06 PM
 */

class LocationServiceTest extends FunSuite with ShouldMatchers{

  test("Test actor initialization"){
    val locationService = Props[LocationService]
    locationService should not be null
  }

}
