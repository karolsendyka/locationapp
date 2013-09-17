package pl.grasser.tripplanner

import net.liftweb.http.rest.RestHelper
import net.liftweb.http.{GetRequest, Req}

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 17.09.13
 * Time: 23:13
 */

object Service extends RestHelper {

  serve {
    case Get("testrest" :: _, _) => <b>Static</b>
  }

}
