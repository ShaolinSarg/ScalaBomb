package questions.question7

import org.scalatest.{ FunSpec, Matchers }

class Question7Spec extends FunSpec with Matchers {

  describe("getWinner") {
    describe("when given a list of votes that shouldn't produce a winner") {
      it("should return no winner when the candidates have the same number of votes") {
        Question7.winner(List("A", "B", "C", "D")) shouldBe None
        Question7.winner(List("A", "A", "B", "B")) shouldBe None
      }
      it("should return no winner when a candidate does not have more than half the votes") {
        Question7.winner(List("A", "A", "A", "B", "B", "C")) shouldBe None
      }
    }
    describe("when given a list of votes what should produce a winner") {
      it("should return the name of the winning candidate") {
        Question7.winner(List("A", "A", "A", "B", "B")) shouldBe Some("A")
      }
    }
  }
}