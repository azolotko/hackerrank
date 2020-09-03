package ipk.warmup.sockmerchant

import java.io.PrintWriter

import scala.io.StdIn.readLine

object Solution {
  def sockMerchant(n: Int, ar: Array[Int]): Int =
    ar.take(n)
      .sortInPlace()
      .foldLeft((0, None: Option[Int])) {
        case ((n, Some(spare)), next) if next == spare =>
          (n + 1, None)

        case ((n, _), next) =>
          (n, Some(next))
      }
      ._1

  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n  = readLine.trim.toInt
    val ar = readLine.split(" ").map(_.trim.toInt)

    val result = sockMerchant(n, ar)

    printWriter.println(result)

    printWriter.close()
  }
}
