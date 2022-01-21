package edu.knoldus

class HigherOrderFunction {
  val increment: Int => Int = (value: Int) => value + 1

  def decrement(value: Int): Int = value - 1

  val performFunction: Function2[Int => Int, Int, Int] = new Function2[Int => Int, Int, Int] {
    override def apply(function: Int => Int, value: Int): Int = function(value)
  }
}
