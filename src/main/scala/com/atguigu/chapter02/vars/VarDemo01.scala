package com.atguigu.chapter02.vars

object VarDemo01 {
  def main(args: Array[String]): Unit = {
    var age : Int = 19
    var sal : Double = 10.9
    var name : String = "tom"
    var isPass : Boolean = true

    //在Scala中，小数默认是Double，整数默认为Int
    var score : Float = 70.9f
    println(s"${age} ${isPass}")
}
}
