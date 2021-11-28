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
   * Complete the 'flippingBits' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts LONG_INTEGER n as parameter.
   */

  val mask: Long = (1L << 32) - 1

  def flippingBits(n: Long): Long =
    (n ^ mask) & mask
}

object Solution {
  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val q = StdIn.readLine.trim.toInt

    for (_ <- 1 to q) {
      val n = StdIn.readLine.trim.toLong

      val result = Result.flippingBits(n)

      printWriter.println(result)
    }

    printWriter.close()
  }
}
