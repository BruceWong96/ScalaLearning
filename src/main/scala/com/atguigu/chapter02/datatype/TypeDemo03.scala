package com.atguigu.chapter02.datatype

object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    //Scala遵守Java的隐式转换类型
    //低精度---》高精度
    var num = 1.2  //Double类型
    var num2 = 1.7f //Float
    num = num2
//  num2 = num  //非法
    num2 = num.toFloat
  }

}
