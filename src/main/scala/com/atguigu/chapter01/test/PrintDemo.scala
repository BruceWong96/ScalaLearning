package com.atguigu.chapter01.test

object PrintDemo {
  def main(args: Array[String]): Unit = {
    var str1: String = "hello"
    var str2: String = " World!"
    println(str1 + str2)

    var name : String = "tom"
    var age : Int = 10
    var sal : Float = 10.67f
    var height : Double = 180.15
    //格式化输出
    printf("名字=%s, 年龄=%d, 薪水=%.2f 身高=%.3f", name, age, sal, height)
    println()

    //scala支持使用$输出内容
    println(s"个人信息如下：\n名字$name \n年龄$age \n薪水$sal")
    //{}中是一个表达式
    println(s"个人信息如下：\n名字${name} \n年龄${age} \n薪水${sal * 100}")
}
}
