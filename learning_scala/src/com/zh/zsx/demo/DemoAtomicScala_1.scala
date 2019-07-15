package com.zh.zsx.demo


object DemoAtomicScala_1 {
  def main(args: Array[String]): Unit = {
    //方法是将一组活动组合起来并赋予一个名字。这是组合程序的最基本方式
    def multiplyByTwo(x:Int):Int = {
      println("Inside multiplyByTwo")
      x * 2
    }
    val r = multiplyByTwo(5)//Methon call
    println(r)
    //AddMultipy.scala
    def addMultiply(x:Int,y:Double,s:String):Double = {
      println(s)
      (x+y) * 2.1
    }
    val r2 : Double = addMultiply(7,9,"Inside addMultiply")
    println(r2)
    def test(x : Int,y:Double,s:String,expected:Double)={
      val result = addMultiply(x,y,s)
      assert(result == expected,"Expected " + expected + "Got" + result )
      println("result:"+ result )
    }
    test(7,9,"Inside addMultipy",33.6)
  }
}
