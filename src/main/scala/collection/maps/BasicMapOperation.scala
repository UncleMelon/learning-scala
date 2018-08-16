package collection.maps


import scala.collection.mutable

/**
  * @author Matthew Wu
  */
object BasicMapOperation {

  def main(args: Array[String]): Unit = {
    // create mutable map by using apply method
    val treasureMap = mutable.Map[Int, String]()
    // add elements to map
    treasureMap += (1 -> "Go to island.")
    treasureMap += (2 -> "Find big X on ground.")
    treasureMap += (3 -> "Dig.")
    println(treasureMap(2))

    // This -> method, returns a two-element tuple containing the key and value
    (1 -> "ttt")

    // create immutable map
    val romanNumeral = Map(1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V")
    println(romanNumeral(4))

    println(romanNumeral.getOrElse(1, "false"))

    val tMap = Map(4 -> "not found", 5 -> "reDig.")
    println(treasureMap ++ tMap)
  }

}
