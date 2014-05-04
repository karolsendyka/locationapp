package pl.grasser.helloworld

import net.liftweb.http.rest.RestHelper
import akka.actor.{ActorRef, Props, ActorSystem}
import pl.grasser.tripplanner.service.HelloActor
import scala.concurrent.Await
import akka.pattern.ask
import scala.concurrent.duration._
import akka.util.Timeout
import net.liftweb.json.JsonAST.JString
import net.liftweb.common.Logger

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 17.09.13
 * Time: 23:13
 */

object HelloService extends RestHelper with Logger {

  serve {
    case Get(context :: param, _) => {
      info("Received parameter: " + param + " for context: " + context)
      implicit val timeout = Timeout(10 seconds)
      val system: ActorSystem = ActorSystem("TestSystem")
      val service: ActorRef = system.actorOf(Props[HelloActor])
      val future = service ? param(0)
      val response:String = Await.result(future.mapTo[String], 10 seconds)
     JString(response)
    }
  }

}
