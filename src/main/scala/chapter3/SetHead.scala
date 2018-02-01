package chapter3

//ex. 3.3

object SetHead extends App {
  def setHead[A](list: List[A], head: A): List[A] = list match {
    case Nil => throw new UnsupportedOperationException
    case Cons(y, ys) => Cons(head, ys)
  }

  val l = List(3, 2)
  assert(setHead(l, 1) == Cons(1, Cons(2, Nil)))

}
