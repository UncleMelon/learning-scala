package traits

class Animal

trait HasLegs

class Frog1 extends Animal with Philosophical with HasLegs

class Frog2 extends Animal with Philosophical {
  override def philosophize() = println("It ain't easy being " + toString + "!")

  override def toString: String = "green"
}

object Frog2 {
  def main(args: Array[String]): Unit = {
    val phrog: Philosophical = new Frog2
    phrog.philosophize()
  }
}
