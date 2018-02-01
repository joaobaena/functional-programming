package chapter3

//ex. 3.4

object Drop extends App {
  def drop[A](l: List[A], n: Int): List[A] //= List match {
    case Nil => throw new UnsupportedOperationException
    case Cons(y, ys) => if (n > 0) ys else l
  }

  val l = List(1, 2, 3)
  assert(drop(l, 1) == Cons(2,Cons(3,Nil)))
  assert(drop(l, 2) == Cons(3,Nil))

}