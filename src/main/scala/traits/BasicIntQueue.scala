package traits

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]()

  def get(): Int = buf.remove(0)

  def put(x: Int) = buf += x
}


object BasicIntQueue {
  def main(args: Array[String]): Unit = {
    //test1
    val queue = new BasicIntQueue with Doubling
    queue.put(10)
    println(queue.get())
    //test2
    val queue1 = (new BasicIntQueue with Incrementing with Filtering)
    queue1.put(-1)
    queue1.put(0)
    queue1.put(1)
    println(queue1.get())
    println(queue1.get())
    //test3
    val queue2 = (new BasicIntQueue with Filtering with Incrementing)
    queue2.put(-1)
    queue2.put(0)
    queue2.put(1)
    println(queue2.get())
    println(queue2.get())
    println(queue2.get())
    //test4

  }
}