import java.io.PrintWriter
import scala.io.StdIn

object Solution {
  def timeConversion(s: String): String = {
    if (s.isEmpty) return ""

    var hh = s.take(2).toInt
    if (hh == 12)
      hh = 0

    val xm = s.slice(s.length - 2, s.length)
    if (xm == "PM")
      hh += 12

    "%02d".format(hh) + s.slice(2, s.length - 2)
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))
    val s           = StdIn.readLine
    val result      = timeConversion(s)
    printWriter.println(result)
    printWriter.close()
  }
}
