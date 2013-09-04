package pl.grasser.tripplanner.domain

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers


/**
 * User: Karol Sendyka (SG0212129)
 * Date: 16.03.13
 * Time: 23:16
 */

class LocationTest extends FunSuite with ShouldMatchers{

  test("construct object") {
    //given
    val latitude: Float = 1312.3f
    val longitude: Float = 1231f

    //when
    val newObject = new Location(latitude,longitude)

    //then
    newObject.latitude should equal(latitude)
    newObject.longitude should equal(longitude)
  }

}
