package com.atguigu.chapter02.datatype

object CharDemo {
  def main(args: Array[String]): Unit = {
    //当输出一个char类型时，会输出该数字对应的字符（码值表unicode） //unicode包括ascii
    var char1 : Char = 97
    println("char1=" + char1)

    //char可以当做数字进行运算
    var char2 : Char = 'a'
    var num = 10 + char2
    println("num = " + num)

//    var char3 : Char = 'a' + 2 // 'a'+2 是一个整数，不可以将Int赋给Char

  }

}
