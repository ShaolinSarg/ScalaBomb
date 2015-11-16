package questions.question7

def winner(votes: List[String]): Option[String] = {
  votes.groupBy(x => x).toList.sortBy(_._2.size).reverse match {
    case x :: Nil => None
    case x :: y :: xs => if (x._2.size == y._2.size || x._2.size.toDouble/votes.size.toDouble<=0.5) None else Some(x._1)
    case _ => None
  }
}
