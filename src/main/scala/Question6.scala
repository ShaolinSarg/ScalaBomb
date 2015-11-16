package questions.question6

case class Score(total: Int)

case class Player(name: String, scores: Seq[Score])

object Question6 {

  def maxScore(allScores: Seq[Score]) = allScores.reduceRight((score, acc) =>
    if (score.total >= acc.total) score else acc)

  def winning(players: Seq[Player]): Set[Player] = {

    val highScore = maxScore(players.flatMap(playerScores => playerScores.scores))

    players.filter(_.scores.contains(highScore)).toSet
  }

}