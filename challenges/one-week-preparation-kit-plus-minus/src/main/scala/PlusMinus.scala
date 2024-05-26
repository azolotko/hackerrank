import scala.io.StdIn

object Solution {

  def plusMinus(arr: Array[Int]): Unit = {
    if (arr.isEmpty) return

    val (positives, negatives, zeroes) =
      plusMinus0(arr)

    def print(d: Double): Unit =
      println("%.5f".format(d))

    print(positives)
    print(negatives)
    print(zeroes)
  }

  def plusMinus0(arr: Array[Int]): (Double, Double, Double) = {
    if (arr.isEmpty) return (0, 0, 0)

    var (positives, negatives, zeroes) = (0, 0, 0)
    arr.foreach {
      case p if p > 0 => positives += 1
      case n if n < 0 => negatives += 1
      case _          => zeroes += 1
    }

    (positives.toDouble / arr.length, negatives.toDouble / arr.length, zeroes.toDouble / arr.length)
  }

  def main(args: Array[String]) {
    val _   = StdIn.readLine.trim.toInt
    val arr = StdIn.readLine.replaceAll("\\s+$", "").split(" ").map(_.trim.toInt)
    plusMinus(arr)
  }
}
