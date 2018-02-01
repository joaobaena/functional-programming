package chapter3

//ex. 3.2

object Tail extends App {
  def tail[A](List: List[A]): List[A] = List match {
    case Nil => throw new UnsupportedOperationException
    case Cons(y, ys) => ys
  }

  val l = List(1, 2, 3)
  val t = tail(l)
  assert(tail(l) == Cons(2,Cons(3,Nil)))
  assert(tail(t) == Cons(3,Nil))

}