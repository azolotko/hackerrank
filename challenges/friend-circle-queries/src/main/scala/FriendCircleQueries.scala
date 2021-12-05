import java.io._
import scala.collection.mutable
import scala.io.{StdIn => stdin}
import scala.util.chaining.scalaUtilChainingOps

object Solution {
  // https://www.hackerrank.com/challenges/friend-circle-queries/problem
  def maxCircle(queries: Array[Array[Int]]): Array[Int] = {
    val sizes = mutable.Map.empty[Int, Int]
    var maxSize = 0
    val parents = mutable.Map.empty[Int, Int]

    def find(v: Int): Int = {
      var x = v
      while (x != parents(x))
        x = parents(parents(x)).tap(parents += x -> _)
      x
    }

//    def find(v: Int): Int =
//      Iterator
//        .iterate(v)(parents)
//        .grouped(2)
//        .takeWhile { case Seq(x, parent) => x != parent }
//        .foldLeft(v) { case (_, Seq(x, parent)) =>
//          parents(parent).tap(parents += x -> _)
//        }

    queries.map { case Array(a, b) =>
      if (!parents.contains(a)) {
        parents += a -> a
        sizes += a -> 1
      }

      if (!parents.contains(b)) {
        parents += b -> b
        sizes += b -> 1
      }

      val aParent = find(a)
      val bParent = find(b)

      if (aParent != bParent) {
        val aSize = sizes(aParent)
        val bSize = sizes(bParent)

        val newSize = aSize + bSize

        val (smallParent, bigParent) =
          if (aSize < bSize)
            (aParent, bParent)
          else
            (bParent, aParent)

        parents.put(smallParent, bigParent)
        sizes.put(bigParent, newSize)

        if (newSize > maxSize)
          maxSize = newSize
      }

      maxSize
    }
  }

  def main(args: Array[String]): Unit = {
    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val q = stdin.readLine.trim.toInt

    val queries = Array.ofDim[Int](q, 2)

    for (i <- 0 until q)
      queries(i) = stdin.readLine.split(" ").map(_.trim.toInt)

    val ans = maxCircle(queries)

    printWriter.println(ans.mkString("\n"))

    printWriter.close()
  }
}
