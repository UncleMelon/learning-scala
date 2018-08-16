package traits

class Frog extends Philosophical with Test {

  override def toString: String = "green"

  override def test(): Unit = println("frog test")
}


object Frog {
  def main(args: Array[String]): Unit = {
    val frog = new Frog
    frog.philosophize()
    frog.test()
    println(frog.toString)
    println("====================")
    // 父类引用指向子类对象，只能调用对应父类中有的方法
    val frog1:Test = new Frog
    frog1.test()
    println("====================")
    val frog2: Philosophical = new Frog
    frog2.philosophize()
  }
}
