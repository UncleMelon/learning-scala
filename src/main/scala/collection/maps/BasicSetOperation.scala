package collection.maps


import scala.collection.mutable

/**
  * @author Matthew Wu
  * this is the example in Programming in scala
  */
object BasicSetOperation {
  def main(args: Array[String]): Unit = {
   //create immutable set
    var jetSet = Set("Boeing", "Airbus")

    // in this case, += is essentially a shorthand for: jetSet = jetSet + "Lear"
    // you reassign the jetSet var with a new set containing "Boeing", "Airbus", "Lear"
    jetSet += "Lear"
    println(jetSet.contains("Cessna"))

    // create mutable set
    val movieSet = mutable.Set("Hitch", "Poltergeist")
    movieSet += "Shrek"
    println(movieSet)


  }
}
