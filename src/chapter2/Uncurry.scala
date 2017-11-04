package chapter2

object Uncurry {
  def uncurry[A,B,C](f: A => B => C): (A, B) => C =
    (a: A, b: B) => f(a)(b)

  val toUncurry: Int => Char => String = (a: Int) => (b: Char) => "A string"

  val checkType: (Int, Char) => String = uncurry(toUncurry)
}
