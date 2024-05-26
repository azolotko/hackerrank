import scala.io.StdIn

object Solution {
  def miniMaxSum(arr: Array[Int]) {
    val (min, max) = miniMaxSum0(arr)
    println(s"$min $max")
  }

  def miniMaxSum0(arr: Array[Int]): (Long, Long) = {
    val sorted: Array[Long] = arr.map(x => x: Long)

    (
      sorted.take(4).sum,
      sorted.slice(sorted.length - 4, sorted.length).sum
    )
  }

  def main(args: Array[String]) {
    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    miniMaxSum(arr)
  }
}
