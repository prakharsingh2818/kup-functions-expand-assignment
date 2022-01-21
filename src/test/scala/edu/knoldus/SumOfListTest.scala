package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class SumOfListTest extends AnyFlatSpec {
  val sumOfList = new SumOfList
  val list = List(1, 2, -5, 3)

  "sumOfListExpanded" should "return the sum of list" in {
    val actualResult = sumOfList.sumOfListExpanded(list)
    assertResult(list.sum)(actualResult)
  }
}
