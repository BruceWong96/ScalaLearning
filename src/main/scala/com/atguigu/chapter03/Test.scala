package com.atguigu.chapter03

object Test {
  def main(args: Array[String]): Unit = {
    var i = 0
    val numList = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

    var retVal = for(i <- numList)yield i
    for(i <- retVal){
      println(i)
    }
  }

}
