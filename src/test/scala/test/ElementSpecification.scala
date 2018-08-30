package test

import imperative.Element.elem
import org.specs2._
import org.specs2.specification.core.SpecStructure


/**
  * @author Matthew Wu
  * specs2 testing framework
  */
class ElementSpecification extends Specification{

  override def is: SpecStructure = s2"""
    have a width equal to the passed value $e1
    have a height equal to the passed value $e2
    throw an IAE if passed a negative value $e3
    """

  val ele = elem('x', 2, 3)

  def e1 =  ele.width must be_== (2)

  def e2 = ele.height must be_== (3)

  def e3 = elem('x', -2, 3) must throwA[IllegalArgumentException]

}
