package com.atguigu.chapter02.datatype

object UnitNullNothing {
  def main(args: Array[String]): Unit = {
    val res = sayHello()
    println("res = " + res)

    //null可以赋给 ref （引用类型） 但是不可以赋给值类型
    val dog : Dog = null
    println(dog)
  }

  //Unit等价于Java的void，只有一个实例值()
  def sayHello() : Unit = {

  }
}

class Dog{

}
