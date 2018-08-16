package collection.maps

import scala.collection.mutable

object HashMapOperation {
  def main(args: Array[String]): Unit = {
    val treasureMap = mutable.HashMap[Int, String]()
    // add elements to map
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")

    if (treasureMap.contains(3)) println(treasureMap(3))
    if (treasureMap.contains(4)) println(treasureMap(4))


  }
}
