import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._
import scala.collection.immutable._
import scala.collection.mutable._
import scala.collection.concurrent._
import scala.concurrent._
import scala.io._
import scala.math._
import scala.sys._
import scala.util.matching._
import scala.reflect._

object Result {

  /*
   * Complete the 'dynamicArray' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. INTEGER n
   *  2. 2D_INTEGER_ARRAY queries
   */

  def dynamicArray(n: Int, queries: Array[Array[Int]]): Array[Int] = {
    var lastAnswer = 0
    var arr: Array[Array[Int]] = Array.fill(n)(Array.empty)

    var answers: Array[Int] = Array.empty

    queries.foreach {
      case Array(1, x, y) =>
        val idx = (x ^ lastAnswer) % n
        arr(idx) =  arr(idx) :+ y
      case Array(2, x, y) =>
        val idx = (x ^ lastAnswer) % n
        lastAnswer = arr(idx)(y % arr(idx).length)
        answers = answers :+ lastAnswer
    }

    answers
  }

}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val firstMultipleInput = StdIn.readLine.replaceAll("\\s+$", "").split(" ")

    val n = firstMultipleInput(0).toInt

    val q = firstMultipleInput(1).toInt

    val queries = Array.ofDim[Int](q, 3)

    for (i <- 0 until q) {
      queries(i) = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    val result = Result.dynamicArray(n, queries)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}