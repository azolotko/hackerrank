import scala.collection.mutable
import scala.io.StdIn

object Solution {
  def largestRectangle(arr: Array[Int]): Long = {
    val stack   = mutable.Stack.empty[Int]
    var largest = 0L
    var i       = 0
    while (i < arr.length || stack.nonEmpty) {
      if (i < arr.length && stack.headOption.forall(arr(_) <= arr(i))) {
        stack.push(i)
        i += 1
      } else {
        val j = stack.pop()
        val k = stack.headOption.fold(0)(_ + 1)
        val h = arr(j).toLong * (i - k)

        if (h > largest)
          largest = h
      }
    }

    largest
  }

  def main(args: Array[String]) {
    val _      = StdIn.readLine.trim.toInt
    val h      = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    val result = largestRectangle(h)
    println(result)
  }
}
