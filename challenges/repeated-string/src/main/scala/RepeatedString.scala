import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'repeatedString' function below.
   *
   * The function is expected to return a LONG_INTEGER.
   * The function accepts following parameters:
   *  1. STRING s
   *  2. LONG_INTEGER n
   */

  def repeatedString(s: String, n: Long): Long = {
    // Write your code here
    val appearances = s.zipWithIndex.collect { case ('a', pos) => pos }

    val quotient = n / s.length
    val remainder = n % s.length

    quotient * appearances.length + appearances.count(_ < remainder)
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = StdIn.readLine

    val n = StdIn.readLine.trim.toLong

    val result = Result.repeatedString(s, n)

    printWriter.println(result)

    printWriter.close()
  }
}
