package typeparameterization

trait Queue[T] {
  def head: T
  def tail: Queue[T]
  def enqueue(x: T): Queue[T]
}

object Queue {
  def apply[T](xs: T*): Queue[T] = new QueueImpl[T](xs.toList, Nil)

  def main(args: Array[String]): Unit = {
    val queue = Queue(1, 2, 3, 4)
    val queue1 = queue.enqueue(9)
    println("xxxx")
  }
}

class QueueImpl[T](private val leading: List[T], private val trailing: List[T]) extends Queue[T] {
  private def mirror = if (leading.isEmpty) new QueueImpl(trailing.reverse, Nil) else this

  def head = mirror.leading.head

  def tail = {
    val q = mirror
    new QueueImpl(q.leading.tail, q.trailing)
  }

  def enqueue(x: T) = new QueueImpl(leading, x :: trailing)
}
