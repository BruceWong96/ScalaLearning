package com.atguigu.chapter02.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    //类型推导
    //1.一旦确定类型，就不能更改
    var num = 10 //num 为 Int类型

    //使用isInstanceOf来判断
    println(num.isInstanceOf[Int]) //true

    //2.变量也可以用val来声明，但是val声明的变量不可更改
    //val底层java代码 就是加上了final
    val age = 18
    // age = 19  //非法
    var age2 = 18
    age2 = 19    //合法

    val dog = new Dog  //val所以不能改变
    dog.age = 11
    dog.name = "cat"
  }
}
class Dog{
  var name : String = "" //var 所以可以改变
  var age : Int = 10
}