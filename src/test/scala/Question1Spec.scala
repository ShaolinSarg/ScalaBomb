package questions.question1

import org.scalatest.{ FlatSpec, Matchers }

class Question1Spec extends FlatSpec with Matchers {
  "disemvowel" should "return the same input if there are no vowels" in {
    Question1.disemvowel("xxx YYy TDD") shouldBe "xxx YYy TDD"
  }

  it should "return an empty string if it is given and empty string" in {
    Question1.disemvowel("") shouldBe ""
  }

  it should "return a string with the vowels removed" in {
    Question1.disemvowel("This website is for losers LOL!") shouldBe "Ths wbst s fr lsrs LL!"
  }

}