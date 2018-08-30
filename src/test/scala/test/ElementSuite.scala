package test

import imperative.Element.elem
import org.scalatest.FunSuite

class ElementSuite extends FunSuite{

  val ele = elem('x', 2, 3)

  test("elem result should have passed width") {
    assert(ele.width == 1)
  }

  test("small test") {
    assert(List(1, 2, 3).contains(4))
  }

  test("test1") {
    assertResult(3) {
      ele.width
    }
  }

  test("test exception") {
    assertThrows[IllegalArgumentException] {
      elem('x', -2, 3)
    }
  }

  test("test intercept") {
    val caught = intercept[ArithmeticException] {
      1 / 0
    }
    assertThrows(caught.getMessage == "/ by zero")
  }

}
