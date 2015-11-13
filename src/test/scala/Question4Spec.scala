import org.scalatest.{ FlatSpec, Matchers }

class Question4Spec extends FlatSpec with Matchers {
  val testData = List("Twas", "brillig", "and", "the", "slithy", "toves", "Did", "gyre", "and", "gimble", "in", "the", "wabe")

  "evenDuplicateMe" should "return the same input if the given number of duplications is 1" in {
    Question3.evenDuplicateMe(1, testData) shouldBe List("Twas", "brillig", "and", "the", "slithy", "toves", "Did", "gyre", "and", "gimble", "in", "the", "wabe")
  }

  it should "return a list with alternate elements duplicated by the integer" in {
    Question3.evenDuplicateMe(2, testData) shouldBe List("Twas", "brillig", "brillig", "and", "the", "the", "slithy", "toves", "toves", "Did", "gyre", "gyre", "and", "gimble", "gimble", "in", "the", "the", "wabe")
  }
}
