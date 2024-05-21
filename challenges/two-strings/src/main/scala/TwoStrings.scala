import java.io._
import scala.collection.immutable._
import scala.io._

object SolutionImpl {
  def twoStrings(s1: String, s2: String): String =
    if (s1.to(HashSet).intersect(s2.to(HashSet)).nonEmpty)
      "YES"
    else
      "NO"
}

object Solution {
  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val q = StdIn.readLine.trim.toInt

    for (_ <- 1 to q) {
      val s1 = StdIn.readLine

      val s2 = StdIn.readLine

      val result = SolutionImpl.twoStrings(s1, s2)

      printWriter.println(result)
    }

    printWriter.close()
  }
}
