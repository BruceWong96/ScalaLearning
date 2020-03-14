package com.atguigu.chapter02.dataconvert

object Demo01 {
  def main(args: Array[String]): Unit = {
    var n1 = 19
    var n2 = 1.2f
    var n3 = n1 + n2  //1.有多种类型的数据混合计算时，系统首先自动将所有数据转化成容量最大的那种数据类型，
    //然后再进行计算

//    2.(Byte, Short) 和Char之间不会自动的转换类型
    var n4 : Byte = 10

//    3.Byte Short Char之间可以计算，在计算时首先转化为Int类型
    var n5 : Byte = 10
    var n6 : Char = 90
    var n7 = n5 + n6
    println(n7)



  }
}
