package traits

class Rational(n: Int, d: Int) extends Ordered[Rational]{

  require(d != 0)

  private val g: Int = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  override def toString: String = numer + "/" + denom

  override def compare(that: Rational): Int = {
    numer * that.denom - that.numer * denom
  }

  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a  else gcd(b, a % b)
  }
}

object Rational {
  def main(args: Array[String]): Unit = {
    val rational1 = new Rational(2, 4)
    val rational2 = new Rational(1, 3)
    val rational3 = new Rational(1, 2)
    println(rational1 > rational2)
    println(rational1 >= rational3)
    println(rational1 <= rational3)
    println(rational2 > rational3)
  }
}