package functional


class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g: Int = gcd(n.abs, d.abs)
  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString: String = numer + "/" + denom

  def + (that: Rational): Rational = {
    new Rational(numer * that.denom + denom * that.numer,
     denom * that.denom)
  }

  def + (i: Int): Rational = {
    new Rational(numer + i * denom ,
      denom)
  }

  def - (that: Rational): Rational = {
    new Rational(numer * that.denom - denom * that.numer,
      denom * that.denom)
  }

  def - (i: Int): Rational = {
    new Rational(numer - i * denom,
      denom)
  }

  def * (that: Rational): Rational = {
    new Rational(numer * that.numer,
      denom * that.denom)
  }

  def * (i: Int): Rational = {
    new Rational(numer * i ,
      denom)
  }

  def / (that: Rational): Rational = {
    new Rational(numer * that.denom,
      denom * that.numer)
  }

  def / (i: Int): Rational = {
    new Rational(numer,
      denom * i)
  }

  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }
}

object Rational {
  def main(args: Array[String]): Unit = {
    val x = new Rational(1, 5)
    val y = new Rational(1, 2)
    val z = new Rational(66, 42)
    println(z)
    println(x + y)
    println(x * y)
  }
}
