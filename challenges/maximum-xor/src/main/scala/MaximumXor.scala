import java.io._
import scala.util.chaining.scalaUtilChainingOps

object Solution {
  @inline private val maxBitPos = 30

  class Node(var zero: Option[Node] = None, var one: Option[Node] = None) {
    def add(x: Int, bitPos: Int = maxBitPos): Unit =
      if (bitPos >= 0) {
        val child =
          if (((x >> bitPos) & 1) == 1) {
            one.getOrElse(new Node()).tap(child => one = Some(child))
          } else {
            zero.getOrElse(new Node()).tap(child => zero = Some(child))
          }
        child.add(x, bitPos - 1)
      }

    def get(q: Int, bitPos: Int = maxBitPos): Int =
      if (bitPos >= 0) {
        val qBit = (q >> bitPos) & 1
        if ((qBit == 1 && zero.nonEmpty) || one.isEmpty)
          (qBit << bitPos) | zero.get.get(q, bitPos - 1)
        else
          ((qBit ^ 1) << bitPos) | one.get.get(q, bitPos - 1)
      } else
        0
  }

  def maxXor(arr: Array[Int], queries: Array[Int]): Array[Int] = {
    val tree = new Node()
    arr.foreach(tree.add(_))
    queries.map(tree.get(_))
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val _ = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val m   = stdin.readLine.trim.toInt

    val queries = Array.ofDim[Int](m)

    for (i <- 0 until m) {
      val queriesItem = stdin.readLine.trim.toInt
      queries(i) = queriesItem
    }

    val result = maxXor(arr, queries)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}
