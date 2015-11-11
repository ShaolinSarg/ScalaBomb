package questions.question2

import org.scalatest.{ FlatSpec, Matchers }

class Question2Spec extends FlatSpec with Matchers {
  "duplicateMe" should "return the same input if the given number of duplications is 1" in {
    Question2.duplicateMe(1, List("Hello", "I", "live", "in", "a", "cave")) shouldBe List("Hello", "I", "live", "in", "a", "cave")
  }

  it should "return a list with each element duplicated by the integer" in {
    Question2.duplicateMe(2, List("Hello", "I", "live", "in", "a", "cave")) shouldBe List("Hello", "Hello", "I", "I", "live", "live", "in", "in", "a", "a", "cave", "cave")
  }

}
