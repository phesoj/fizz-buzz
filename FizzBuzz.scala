object Interview extends App {

  val numbers = 1 to 100

  sealed trait Number {
    def print: String
    override def toString = print
  }

  case class FizzBuzz(print: String = "fizzbuzz") extends Number
  case class Buzz(print: String = "Buzz") extends Number
  case class Fizz(print: String = "Fizz") extends Number
  case class normal(print: String) extends Number

  def isFizzBuzz(number: Int): Number = number match {
    case fb if (fb % 15 == 0) => FizzBuzz()
    case b if (b % 5 == 0) => Buzz()
    case f if (f % 3 == 0) => Fizz()
    case n => normal(n.toString)
  }

  numbers.foreach(number => println(isFizzBuzz(number)) )

}


