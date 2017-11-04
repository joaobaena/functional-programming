package chapter2

object Curry {

  def curry[A,B,C](f: (A, B) => C): A => (B => C) =
    (a: A) => (b: B) => f(a, b)

  val toCurry: (Int, Char) => String = (a: Int, b: Char) => String

  val checkType: Int => Char => String = curry(toCurry)
}
