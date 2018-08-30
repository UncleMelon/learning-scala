package collection.lists

object ListLiterals {
  def main(args: Array[String]): Unit = {
//    listPatterns()
//    println(insertSortPattern(List(5,7,3,9,2,8)))
    firstOrderMethodsTest()
  }

  def listPatterns(): Unit = {
    val fruit: List[String] = List("apples", "oranges", "pears")
    val List(a, b, c) = fruit
    println("a: " + a)
    println("b: " + b)
    println("c: " + c)

    val a1 :: b1 :: rest = fruit
    println("a1: " + a1)
    println("b1: " + b1)
    println("rest: " + rest)
  }

  def firstOrderMethodsTest(): Unit = {
    println(List(1, 2, 3).last)
    val abcde = List('a', 'b', 'c', 'd', 'e')
    //最后一个元素
    println(abcde.last)
    //除最后一个元素的其他元素
    println(abcde.init)
    //逆序
    println(abcde.reverse)

    println(abcde.reverse.reverse equals abcde)
    //前两个元素
    println(abcde take 2)
    //除前两个元素的其他元素
    println(abcde drop 2)
    //indices
    println(abcde.indices)
    //flatten
    println(List(List(1, 2), List(3), List(), List(4, 5)).flatten)
    //zip
    println(abcde.indices zip abcde)
    println(abcde zipWithIndex)
  }

  /**
    * insert Sort
    */
  def insertSort(): Unit = {
    def issort(xs: List[Int]): List[Int] = {
      if (xs.isEmpty) Nil
      else insert(xs.head, issort(xs.tail))
    }

    def insert(x: Int, xs: List[Int]): List[Int] = {
      if (xs.isEmpty || x <= xs.head) x :: xs
      else xs.head :: insert(x, xs.tail)
    }
  }

  /**
    * insert Sort(List Patterns)
    * @param xs
    */
  def insertSortPattern(xs: List[Int])= {

    def isort(xs: List[Int]): List[Int] = xs match {
      case List() => List()
      case x :: xs1 => insert(x, isort(xs1))
    }

    def insert(x: Int, xs: List[Int]): List[Int] = xs match {
      case List() => List(x)
      case y :: ys => if (x <= y) x :: xs
                      else y :: insert(x, ys)
    }

    isort(xs)
  }

  /**
    * Constructing Lists
    */
  def createListbyConstructingStyle: Unit = {
    val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = 1 :: (2 :: (3 :: (4 :: Nil)))
    val diag3 = (1 :: (0 :: (0 :: Nil))) ::
                (0 :: (1 :: (0 :: Nil))) ::
                (0 :: (0 :: (1 :: Nil))) :: Nil
    val empty = Nil
  }

  /**
    * List Style
    */
  def createListbyListStyle: Unit = {
    val fruit: List[String] = List("apples", "oranges", "pears")
    val nums: List[Int] = List(1, 2, 3, 4)
    val diag3: List[List[Int]] =
      List(
        List(1, 0, 0),
        List(0, 1, 0),
        List(0, 0, 1)
      )
    // 空字符串
    val empty: List[Nothing] = List()
  }
}
