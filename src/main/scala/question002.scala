package questions.question2

object Question2 {
  def duplicateMe[T](n: Int, me: List[T]): List[T] = {
    me.flatMap(x => List.fill(n)(x))
  }
}
