package com.atguigu.chapter02.datatype

object TypeDemo02 {
  def main(args: Array[String]): Unit = {
    println(sayHello)
  }

  //开发中，有一个方法，就会异常中断，这时就可以返回Nothing
  def sayHello : Nothing ={
    throw new Exception("异常")
  }

}
