package org.solve.hackerrank
import java.util.Scanner


//  List replication

object Hack2 {

  def main(args: Array[String]) {

    scala.io.StdIn.readLine()

    val line =  new Scanner(scala.io.StdIn.toString)

    val TimesReplicate = line.next
    val EleList = line.nextInt

    def f(num: Int, arr: List[Int]): List[Int] = {
        arr.flatMap(List.fill(num)(_))
    }

  }

}
