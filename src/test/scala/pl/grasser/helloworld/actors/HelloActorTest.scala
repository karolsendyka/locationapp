package pl.grasser.tripplanner.service

import akka.actor.{ActorSystem, Props}
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import scala.concurrent.Await
import akka.pattern.ask
import scala.concurrent.duration._
import akka.util.Timeout

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 9/4/13
 * Time: 9:06 PM
 */

class HelloActorTest extends FunSuite with ShouldMatchers{
  implicit val timeout = Timeout(10 seconds)

  test("Test consuming message"){
    val system = ActorSystem("TestSystem")
    val locationService = system.actorOf(Props[HelloActor])
    locationService ! "test"
  }
  test("Test getting response from actor"){
    val system = ActorSystem("TestSystem")
    val locationService  = system.actorOf(Props[HelloActor])
    val future = locationService ? "hello"
    val response:String = Await.result(future.mapTo[String], 10 seconds)
    response should equal("Hello!")
  }

}
