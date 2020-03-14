package com.atguigu.chapter02.datatype

object TypeDemo01 {
  def main(args: Array[String]): Unit = {

    //一切都是对象
    var num1 : Int = 10
    //scala中如果一个方法没有形参，可以省略()
    println(num1.toDouble + "\t" + num1.toString)

  }

}
