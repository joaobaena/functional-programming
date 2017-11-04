package chapter2

import scala.annotation.tailrec

object Fibonacci extends App{
  def fib(n: Int): Int = {
    @tailrec
    def fibRec(i: Int, i1: Int, pos: Int): Int =
      if (pos < 1) i1
      else fibRec(i1, i + i1, pos -1)
    if (n < 2) 0
    else fibRec(0, 1, n - 2)
  }

  val res = List(fib(-1),
    fib(-1),
    fib(0),
    fib(1),
    fib(2),
    fib(3),
    fib(4),
    fib(5),
    fib(6),
    fib(7))

  println(res)

  assert(res == List(0, 0, 0, 0, 1, 1, 2, 3, 5, 8))
}
