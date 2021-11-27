import java.io._
import scala.io._

object Result {
  def sockMerchant(n: Int, ar: Array[Int]): Int =
    ar.take(n).groupBy(identity).map(_._2.length / 2).sum
}

object Solution {
  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val ar = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = Result.sockMerchant(n, ar)

    printWriter.println(result)

    printWriter.close()
  }
}
