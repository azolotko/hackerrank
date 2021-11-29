import java.io._
import scala.io._

object Result {

  /*
   * Complete the 'primality' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts INTEGER n as parameter.
   */

  val prime = "Prime"
  val notPrime = "Not prime"

  def primality(n: Long): String =
    if (n == 2 || n == 3)
      prime
    else if (n < 2 || n % 2 == 0 || n % 3 == 0)
      notPrime
    else {
      val it = Iterator.unfold(5)(i =>
        if (Math.pow(i, 2) <= n)
          Some(i, i + 6)
        else
          None
      )

      if (it.exists(i => n % i == 0 || n % (i + 2) == 0))
        notPrime
      else
        prime
    }
}

object Solution {
  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val p = StdIn.readLine.trim.toInt

    for (_ <- 1 to p) {
      val n = StdIn.readLine.trim.toLong

      val result = Result.primality(n)

      printWriter.println(result)
    }

    printWriter.close()
  }
}
