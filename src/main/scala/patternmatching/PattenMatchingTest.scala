package patternmatching

abstract class Expr

case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

object PattenMatchingTest {
  def main(args: Array[String]): Unit = {
    val v = Var("x")
    val op = BinOp("+", Number(1), v)
    println(v.name)
    println(op.left)
    println(op)
    println(op.right == Var("x"))
    println(op.copy(operator = "-"))
    println(simplifyTop(UnOp("-", UnOp("-", Var("x")))))
    println("===========================")
    println(describe(5))
    println(describe(true))
    println(describe("hello"))
    println(describe(Nil))
    println(describe(List(1, 2, 3)))
    println("===========================")
    println(variablePattern(11))
    println("===========================")
    constructorPattern(BinOp("+", Var("x"), Number(0)))
    constructorPattern(BinOp("+", Var("x"), Number(1)))
    println("===========================")
    sequencePattern(List(0, 1, 1))
    sequencePattern(List(1, 1))
    sequencePattern1(List(0, 1, 1, 1))
    println("===========================")
    tuplePattern((1, 2, 3))
    tuplePattern(("a ", 3, "-tuple"))
    tuplePattern((1, 2))
    println("===========================")
    println(generalSize("abc"))
    println(generalSize(Map(1 -> 'a', 2 -> 'b')))
    println(generalSize(math.Pi))
  }

  /**
    * Typed patterns
    * @param x
    * @return
    */
  def generalSize(x: Any) = x match {
    case s: String => s.length
    case m: Map[_, _] => m.size
    case _ => -1
  }

  def tuplePattern(expr: Any): Unit = expr match {
    case (a, b, c) => println("matched " + a + b + c)
    case _ =>
  }

  def sequencePattern(expr: List[Int]): Unit = expr match {
    case List(0, _, _) => println("found it")
    case _ =>
  }

  def sequencePattern1(expr: List[Int]): Unit = expr match {
    case List(0, _*) => println("found it")
    case _ =>
  }

  def constructorPattern(expr: Expr): Unit = expr match {
    case BinOp("+", e, Number(0)) => println("a deep match")
    case _ => println("nothing")
  }

  def simplifyTop(expr: Expr): Expr =  expr match {
    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case _ => expr
  }

  def variablePattern(expr: Any) = expr match {
    case 0 => "zero"
    case somethingElse => "not zero: " + somethingElse
  }


  /**
    * wildcard patterns
    * 因为下面模式匹配不关心二元操作符的具体细节，所以可以用_代理二元操作符的内容
    * @param expr
    */
  def wildcardPattern(expr: Expr): Unit = expr match {
    case BinOp(_, _, _) => println(expr + "is a binary operation")
    case _ =>       // handle the default case
  }

  /**
    * constant patterns
    * @param x
    * @return
    */
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi!"
    case Nil => "the empty list"
    case _ => "something else"
  }

}
