package ipk.warmup.countingvalleys

import java.io.PrintWriter

import scala.io.StdIn.readLine

object CountingValleys {
  def countingValleys(n: Int, s: String): Int =
    s.take(n)
      .foldLeft((0, 0)) {
        case ((altitude, valleys), symbol) =>
          symbol match {
            case 'U' => (altitude + 1, valleys + (if (altitude == -1) 1 else 0))
            case 'D' => (altitude - 1, valleys)
          }
      }
      ._2

  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = readLine.trim.toInt
    val s = readLine

    val result = countingValleys(n, s)

    printWriter.println(result)

    printWriter.close()
  }
}
