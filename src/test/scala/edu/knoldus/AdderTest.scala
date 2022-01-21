package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class AdderTest extends AnyFlatSpec {
  val adder = new Adder()

  "Addition of 2 and 3" should "be" in {
    val valueOne = 2
    val valueTwo = 3
    val actualResult = adder.addExpanded(valueOne, valueTwo)
    val expectedResult = valueOne + valueTwo
    assertResult(expectedResult)(actualResult)
  }

  "Addition of -20 and 10" should "be" in {
    val valueOne = -20
    val valueTwo = 10
    val actualResult = adder.addExpanded(valueOne, valueTwo)
    val expectedResult = valueOne + valueTwo
    assertResult(expectedResult)(actualResult)
  }
}
