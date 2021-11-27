import java.io._
import scala.io._

object Result {
  def countingValleys(steps: Int, path: String): Int =
    path
      .take(steps)
      .foldLeft((0, 0)) {
        case ((valleys, level), 'D') =>
          (valleys + (if (level == 0) 1 else 0), level - 1)
        case ((valleys, level), 'U') =>
          (valleys, level + 1)
      }
      ._1

}

object Solution {
  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val steps = StdIn.readLine.trim.toInt

    val path = StdIn.readLine

    val result = Result.countingValleys(steps, path)

    printWriter.println(result)

    printWriter.close()
  }
}
