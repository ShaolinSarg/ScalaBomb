object Question4 {

  //Create a stream that starts from the first wierd prime number 2
  //Generate an infinite stream of odd numbers from 3
  //Filter the infinite stream by taking out numbers divisable by the primes we have already found
  lazy val primes: Stream[Int] = 2 #::
    Stream.from(3, 2).filter(nextNumber =>
      primes.takeWhile(primeNumber => primeNumber * primeNumber <= nextNumber)
        .forall(primeNo => nextNumber % primeNo != 0))

  def findPrime(n: Int): Int = {

    primes
      .take(n)
      .last

  }
}
