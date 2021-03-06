package questions.question6

import org.scalatest.{ Matchers, FlatSpec }

class Question6Spec extends FlatSpec with Matchers {

  val paul = Player("Paul", Seq(Score(23), Score(53)))
  val james = Player("James", Seq(Score(5), Score(10)))
  val joan = Player("Joan", Seq(Score(60), Score(54), Score(21)))

  val players = List(paul, james, joan)

  val playerScores = Seq((paul, Score(53)), (james, Score(10)))

  "findMax" should "return the highest score for a given player" in {
    Question6.maxScore(paul.scores) shouldBe Score(53)
  }

  "winning" should "return the highest scoring player in the game" in {
    Question6.winning(players) shouldBe Set(joan)
  }

  it should "return joint winners if there are more than one player with the highest score" in {
    val julie: Player = Player("Julie", Seq(Score(60), Score(59)))
    val morePlayers = julie :: players

    Question6.winning(morePlayers) should contain theSameElementsAs List(joan, julie)
  }
}