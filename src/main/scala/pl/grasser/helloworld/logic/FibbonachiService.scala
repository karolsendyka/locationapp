package pl.grasser.helloworld.logic

/**
 * User: Karol Sendyka (SG0212129)
 * Date: 15.12.13
 * Time: 17:07
 */

class FibbonachiService {

  def getFibNumberRec(x: Integer): Integer = {
    if(x==0 || x==1) return x
    getFibNumberRec(x-2) + getFibNumberRec(x-1)
  }

  def getFibNumberLoop(x: Integer): Integer = {
    var a = 0
    var b = 1
    var tmp = 0
    if (x == 0 || x == 1) return x
    for(i <- 2 to x){
      tmp = a+b;
      a = b
      b = tmp
    }
    b
  }

}
