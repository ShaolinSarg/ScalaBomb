import org.scalatest.{FlatSpec, Matchers}

class Question4Spec extends FlatSpec with Matchers {

  "findPrime" should "return the 1st prime number from a sequence of the first prime 40 prime numbers" in {
    Question4.findPrime(1) should be (2)
  }

  it should "return the 40th prime number from a sequence of the first prime 40 prime numbers" in {
    Question4.findPrime(40) should be (173)
  }
}
