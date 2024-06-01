import scala.collection.mutable
import scala.io.StdIn

object Solution {
  def main(args: Array[String]): Unit = {
    var s = ""

    val undoStack = mutable.Stack.empty[String]

    val q = StdIn.readLine().trim.toInt

    for (_ <- 0 until q) {
      val Array(command, rest @ _*) = StdIn.readLine().split(' ')

      command match {
        case "1" => // append
          undoStack.push(s)
          s = s.concat(rest.mkString(" "))

        case "2" => // delete
          undoStack.push(s)
          val k = rest.headOption.fold(0)(_.toInt)
          s = s.dropRight(k)

        case "3" => // print
          val k = rest.headOption.fold(0)(_.toInt)
          println(s(k - 1))

        case "4" => // undo
          s = undoStack.pop()
      }
    }
  }
}
