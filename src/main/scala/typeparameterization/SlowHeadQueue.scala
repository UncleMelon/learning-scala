package typeparameterization

class SlowAppendQueue[T](elems: List[T]) {
  def head= elems.head
  def tail = new SlowAppendQueue(elems.tail)
  def enqueue(x: T) = new SlowAppendQueue(elems ::: List(x))
}

object SlowHeadQueue {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4 ,5)
    val slowList = new SlowAppendQueue[Int](list)
    val slowList1 = slowList.enqueue(6)
    println("ttttt")

  }


//  def showSlowList(slowHeadQueue: SlowAppendQueue[Int]): Unit = slowHeadQueue match {
//    case List() =>
//  }
}