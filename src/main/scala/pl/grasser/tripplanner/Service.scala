package pl.grasser.tripplanner

import net.liftweb.http.rest.RestHelper
import akka.actor.{ActorRef, Props, ActorSystem}
import pl.grasser.tripplanner.service.LocationService
import scala.concurrent.Await
import akka.pattern.ask
import scala.concurrent.duration._
import akka.util.Timeout

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 17.09.13
 * Time: 23:13
 */

object Service extends RestHelper {

  serve {
    case Get("testrest" :: param, _) => {
      implicit val timeout = Timeout(10 seconds)
      val system: ActorSystem = ActorSystem("TestSystem")
      val service: ActorRef = system.actorOf(Props[LocationService])
      val future = service ? "hello"
      val response:String = Await.result(future.mapTo[String], 10 seconds)
      response
     <b>{response} {param}</b>
    }
  }

}
