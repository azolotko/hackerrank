import java.io._

object Solution {
  def substrCount(s: String): Long = {
    if (s.isEmpty) return 0

    s.zipWithIndex
      .foldLeft(0) { case (res, (c, i)) =>
        var rule1 = 0
        var rule2 = 0

        var j = i
        while (j < s.length && s(j) == c) {
          rule1 += 1
          j += 1
        }

        var n = i - 1
        var m = i + 1
        if (n >= 0) {
          val cc = s(n)
          if (cc != c) {
            while (n >= 0 && m < s.length && s(n) == cc && s(m) == cc) {
              rule2 += 1
              n -= 1
              m += 1
            }
          }
        }

        res + rule1 + rule2
      }
  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val s = stdin.readLine

    val result = substrCount(s.take(n))

    printWriter.println(result)

    printWriter.close()
  }
}
