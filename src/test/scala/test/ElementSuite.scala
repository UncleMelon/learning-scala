package test

import imperative.Element.elem
import org.scalatest.FunSuite

class ElementSuite extends FunSuite{
  test("elem result should have passed width") {
    val ele = elem('x', 2, 3)
    assert(ele.width == 1)
  }
}
