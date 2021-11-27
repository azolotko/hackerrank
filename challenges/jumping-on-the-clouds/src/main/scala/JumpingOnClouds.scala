import java.io._
import scala.io._

object Result {
  def jumpingOnClouds(c: Array[Int]): Int =
    if (c.length <= 1)
      0 // reached last cloud
    else
      Math.min(
        if (c(1) == 0)
          1 + jumpingOnClouds(c.drop(1))
        else
          Int.MaxValue,
        if (c.length > 2 && c(2) == 0)
          1 + jumpingOnClouds(c.drop(2))
        else
          Int.MaxValue
      )
}

object Solution {
  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = StdIn.readLine.trim.toInt

    val c = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)

    val result = Result.jumpingOnClouds(c)

    printWriter.println(result)

    printWriter.close()
  }
}
