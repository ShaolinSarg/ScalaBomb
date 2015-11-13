package questions.question3

object Question3 {
  def evenDuplicateMe[T](n: Int, me: List[T]): List[T] = {
    (me.zipWithIndex.map(x => if (x._2 % 2 == 0) List(x._1) else List.fill(n)(x._1))).flatten
  }
}
