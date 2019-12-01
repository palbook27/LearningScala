object chapter2 {
  /**
    *
    * 자료형
    *
    * 표현식
    *
    */
  def acction() = {
    //Q1
    val celsius = 7
    val fahr1 = celsius * 9
    val fahr2 = fahr1 / 5.0
    val fahrenheit = fahr2 + 32
    println("fahrenheit : " + fahrenheit)

    //Q2
    println("fahrenheit(Int) : " + fahrenheit.toInt)

    //Q3
    val amount = 2.7255
    val samount = f"You owe $$$amount%.2f dollars"
    println(samount)

    //Q4
    val flag = false
    val result = !flag

    //Q5
    val temp0 = 128
    val temp1:Char = temp0.toChar
    val temp2:String = temp0.toString
    val temp3:Double = temp0.toDouble

    //Q6
    val s = "Frank,123 Main,925-555-1943,95122"
    val p = """.*,(\d{3})-(\d{3})-(\d{4}),.*""".r
    val p(p1,p2,p3) = s
    val phoneNumber = (p1.toInt, p2.toInt, p3.toInt)

    println("p is : " + p)
    println("phoneNumber tuple : " + phoneNumber)


  }
}
