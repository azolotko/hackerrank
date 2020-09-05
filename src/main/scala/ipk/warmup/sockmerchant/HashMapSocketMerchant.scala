package ipk.warmup.sockmerchant

import java.io.PrintWriter

import scala.collection.mutable
import scala.io.StdIn.readLine

object HashMapSocketMerchant {
  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    // new mutable.HashMap[Int, Int](initialCapacity = 1000, loadFactor = 0.75)
    val countByColor = mutable.HashMap.empty[Int, Int]

    ar.take(n).foreach(countByColor.updateWith(_)(_.map(_ + 1).orElse(Some(1))))

    countByColor.values.foldLeft(0) {
      case (pairs, count) =>
        pairs + count / 2
    }
  }

  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n  = readLine.trim.toInt
    val ar = readLine.split(" ").map(_.trim.toInt)

    val result = sockMerchant(n, ar)

    printWriter.println(result)

    printWriter.close()
  }
}
