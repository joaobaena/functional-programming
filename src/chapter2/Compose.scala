package chapter2

object Compose {
  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    (a: A) => f(g(a))
  }
  val intToChar: Int => Char = (i: Int) => 'a'
  val charToString: Char => String = (c: Char) => "A string"
  val composed: Int => String = compose(charToString, intToChar)
}
