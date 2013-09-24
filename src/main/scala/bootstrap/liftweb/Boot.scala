package bootstrap.liftweb

import net.liftweb.http.LiftRules
import net.liftweb.sitemap.{Loc, Menu, SiteMap}
import pl.grasser.helloworld.HelloService

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 17.09.13
 * Time: 21:15
 */

class Boot {

  def boot {
    LiftRules.statelessDispatch.append(pl.grasser.helloworld.HelloService)
  }
}
