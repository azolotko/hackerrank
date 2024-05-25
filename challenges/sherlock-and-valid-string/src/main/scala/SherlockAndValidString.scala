import java.io._
import scala.collection.mutable
import scala.io.StdIn

object Solution {
  def isValid(s: String): String = {
    val freq = mutable.HashMap.empty[Char, Int]
    s.foreach(freq.updateWith(_)(k => Option(k.fold(1)(_ + 1))))

    var prev  = 0
    var spare1 = true

    freq.valuesIterator.foreach { k =>
      if (prev == 0)
        prev = k
      else if (k == prev)
        ()
      else if (spare1 && (k == 1 || math.abs(prev - k) == 1))
        spare1 = false
      else if (spare1 && prev == 1) {
        spare1 = false
        prev = k
      } else
        return "NO"
    }

    "YES"
  }

  def main(args: Array[String]) {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = StdIn.readLine

    val result = isValid(s)

    printWriter.println(result)

    printWriter.close()
  }
}
