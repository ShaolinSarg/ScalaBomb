package questions.question5

case class Score(total: Int)

case class Player(name: String, scores: Seq[Score])

object Question5 {

  def winning(players: Seq[Player]): Set[Player] = ???

}