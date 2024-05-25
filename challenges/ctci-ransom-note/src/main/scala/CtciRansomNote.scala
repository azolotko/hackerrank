import scala.io._
import scala.collection.mutable

object Solution {
  def checkMagazine(magazine: Array[String], note: Array[String]): Unit = {
    println(
      if (checkMagazine0(magazine, note))
        "Yes"
      else
        "No"
    )
  }

  def checkMagazine0(magazine: Array[String], note: Array[String]): Boolean = {
    val wordsCount = mutable.HashMap.empty[String, Int]

    magazine.foreach(
      wordsCount.updateWith(_)(count => Some(count.fold(1)(_ + 1)))
    )

    note.forall(
      wordsCount
        .updateWith(_)(_.map(_ - 1))
        .exists(_ >= 0)
    )
  }

  def main(args: Array[String]): Unit = {
    val _ = StdIn.readLine

    val magazine = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val note = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    checkMagazine(magazine, note)
  }
}
