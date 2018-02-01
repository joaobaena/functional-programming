package chapter2

object Ordered extends App {
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    def sortRec(h: A, t: Array[A]): Boolean =
      if (t.isEmpty) true
      else if (!ordered(h, t.head)) false
      else sortRec(t.head, t.tail)
    if (as.isEmpty) true
    else sortRec(as.head, as.tail)
  }

  val intOrd = Array(1, 2, 100, 101)
  val intNotOrd = Array(2, 3, 1)
  val charOrd = Array('a', 'b', 'c')
  val charNotOrd = Array('z', 'g', 'h')
  val empty: Array[Int] = Array()
  val one = Array(1)

  val orderedInt = (a1: Int, a2: Int) =>  a2 > a1
  val orderedChar = (a1: Char, a2: Char) =>  a2 > a1
  assert(isSorted(intOrd, orderedInt))
  assert(!isSorted(intNotOrd, orderedInt))
  assert(isSorted(charOrd, orderedChar))
  assert(!isSorted(charNotOrd, orderedChar))
  assert(isSorted(empty, orderedInt))
  assert(isSorted(one, orderedInt))

}
