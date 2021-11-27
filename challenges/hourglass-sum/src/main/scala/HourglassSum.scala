import java.io._
import java.lang.Math._
import scala.collection.immutable._
import scala.collection.mutable.ArrayBuffer
import scala.io._

object Result {

  def hourglassSum(arr: Array[Array[Int]]): Int = {
    def inHourglass(j: Int, i: Int, y: Int, x: Int) =
      j != y + 1 || i == x + 1

    def neighborhood(k: Int) =
      max(k - 2, 0).to(min(k, 3))

    def matchingHourglasses(j: Int, i: Int): Seq[Int] = for {
      y <- neighborhood(j)
      x <- neighborhood(i) if inHourglass(j, i, y, x)
    } yield y * 4 + x

    val hourglasses = ArrayBuffer.fill(16)(0)

    for {
      j <- arr.indices
      i <- arr(j).indices
      value = arr(j)(i)
      hourglass <- matchingHourglasses(j, i)
    } hourglasses.update(hourglass, value + hourglasses(hourglass))

    hourglasses.max
  }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val arr = Array.ofDim[Int](6, 6)

    for (i <- 0 until 6) {
      arr(i) =
        StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    }

    val result = Result.hourglassSum(arr)

    printWriter.println(result)

    printWriter.close()
  }
}
