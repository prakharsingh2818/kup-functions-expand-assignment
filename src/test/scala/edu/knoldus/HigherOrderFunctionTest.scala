package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec

class HigherOrderFunctionTest extends AnyFlatSpec {

  val higherOrderFunction = new HigherOrderFunction

  "HoF to increment" should "increase the value by 1" in {
    val value = 2
    val result = higherOrderFunction.performFunction(higherOrderFunction.increment, value)
    assertResult(value + 1)(result)
  }

  "HoF to decrement" should "decrease the value by 1" in {
    val value = 10
    val result = higherOrderFunction.performFunction(higherOrderFunction.decrement, value)
    assertResult(value - 1)(result)
  }
}
