package questions.question5

case class Score(total: Int)

case class Player(name: String, scores: Seq[Score])

object Question5 {

  def winning(players: Seq[Player]): Set[Player] = {

    def winningScore(playerScores: Seq[(Player, Score)]) = Scores.maxScore(playerScores.map(_._2))

    val playerHighestScore = for {
      player <- players
    } yield (player, Scores.maxScore(player.scores))

    val highScore = winningScore(playerHighestScore)

    players.filter(p => p.scores contains highScore).toSet
  }
}

object Scores {
  def maxScore(scores: Seq[Score]) = scores.reduceLeft((highest, score) => if (highest.total < score.total) score else highest) // could pull this out into another function that takes scores
}