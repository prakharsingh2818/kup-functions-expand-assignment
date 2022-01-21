package edu.knoldus

class SumOfList {
  val sumOfListExpanded: Function1[List[Int], Int] = new Function1[List[Int], Int] {
    override def apply(list: List[Int]): Int = list.sum
  }
}
