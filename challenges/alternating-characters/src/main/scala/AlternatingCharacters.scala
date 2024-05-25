import java.io._
import scala.io.StdIn

object Solution {
  def alternatingCharacters(s: String): Int = {
    if (s.isEmpty) return 0

    var char = s.head
    var deletions = 0

    s.tail.foreach { c =>
      if (c == char)
        deletions += 1
      else
        char = c
    }

    deletions
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val q = StdIn.readLine.trim.toInt

    for (_ <- 1 to q) {
      val s = StdIn.readLine

      val result = alternatingCharacters(s)

      printWriter.println(result)
    }

    printWriter.close()
  }
}
