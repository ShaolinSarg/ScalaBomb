object Question8 {

  class CountTracker(val currentLeader: Option[String] = None,
      val leadingCount: Int = 0,
      val voteCount: Map[String, Int] = Map(),
      val totalVotes: Int = 0) {

    private def withNewVoteCount(voteCount: Map[String, Int]) = {
      new CountTracker(currentLeader, leadingCount, voteCount, totalVotes)
    }

    def apply(vote: String) = {
      val newVoteCount = this.voteCount.get(vote).getOrElse(0) + 1
      val newTotalVotes = totalVotes + 1
      var newLeadingCount = leadingCount
      var newLeader: Option[String] = if (leadingCount * 2 > newTotalVotes) currentLeader else None
      if (newVoteCount > leadingCount && newVoteCount * 2 > newTotalVotes) {
        newLeader = Some(vote)
        newLeadingCount = newVoteCount
      }

      val x = new CountTracker(newLeader,
        newLeadingCount,
        this.voteCount + (vote -> newVoteCount),
        newTotalVotes)

      println(x.voteCount, x.currentLeader, x.leadingCount, x.totalVotes)
      x
    }
  }

  def countVotes(votes: Seq[String], tracker: CountTracker = new CountTracker()): CountTracker = {
    votes match {
      case Nil => tracker
      case (x :: tail) => countVotes(tail, tracker(x))
    }
  }

  def winner(votes: List[String]): Option[String] = {
    val vount = countVotes(votes)
    println(vount)
    vount.currentLeader
  }
}
