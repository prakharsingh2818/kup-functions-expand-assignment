package edu.knoldus

class Adder {
  val addExpanded: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(valueOne: Int, valueTwo: Int): Int = valueOne + valueTwo
  }
}
