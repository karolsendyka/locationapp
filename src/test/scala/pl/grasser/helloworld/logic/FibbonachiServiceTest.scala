package pl.grasser.helloworld.logic

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 15.12.13
 * Time: 17:07
 */

class FibbonachiServiceTest extends FunSuite with ShouldMatchers {

  var expectedFibbonachis : List[Int] = List(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181,6765)

  private val service: FibbonachiService = new FibbonachiService



  test("should return x fibbonacchi number using loop 1 "){
    testMethod(service.getFibNumberLoop)
  }


  test("should return x fibbonacchi number using recurency 1 "){
    testMethod(service.getFibNumberRec)
  }


  test("should return x fibbonacchi number using loop"){
    testMethod(service.getFibNumberLoop)
  }


  test("should return x fibbonacchi number using recurency"){
    testMethod(service.getFibNumberRec)
  }





  def testMethod (fibFunction: (Integer) => Integer){
    for (i <- 0 until expectedFibbonachis.length) {
      fibFunction(i) should equal(expectedFibbonachis(i))
    }
  }
}
