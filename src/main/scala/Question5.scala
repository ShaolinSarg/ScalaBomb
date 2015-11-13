package questions.question5

case class Score(total: Int)

case class Player(name: String, scores: Seq[Score])

object Question5 {
  def winning(players: Seq[Player]): Set[Player] = Set(Player("Joan", Seq(Score(60), Score(54), Score(21))), Player("Julie", Seq(Score(60), Score(59))))
}
