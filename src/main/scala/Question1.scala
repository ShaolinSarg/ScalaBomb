package questions.question1

object Question1 {

  def disemvowel(input: String): String = {

    def isVowel(input: Char): Boolean = {
      val vowels = List('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
      vowels contains input
    }

    input.filterNot(isVowel)

  }

}
