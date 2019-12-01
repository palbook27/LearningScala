object chapter3 {
  /**
    * 표현식과 조건문
    *
    * if문
    * case문
    * for문
    * while do while
    *
    */
  //Q1.
  def matchString(name:String):String = name match{
    case "" => "n/a"
    case _ => _
  }

  //Q2.
  def checkDouble(d:Double):String = {
    if (d > 0) "greater"
    else if (d == 0) "same"
    else "less"
  }

  def checkDouble2(d:Double):String = d match{
    case d if d > 0 => "greater"
    case d if d == 0 => "same"
    case d if d < 0 => "less"
  }

  //Q3.
  def colormatch(color:String):String = color match{
    case "cyan" => "00ffff"
    case "magenta" => "00ff00"
    case "yellow" => "ffff00"
    case x => {
      println(s"Didn't expect $x !")
      "333333"
    }
  }



  //Q4.
  def print5Num(start:Int , end:Int):Unit = {
    for (i <- start to end) { //for (i <- 1 to 100 by 5) {
      print(i + ", ")
      if(i % 5 == 0){
        println("")
      }
    }
  }


  //Q5.
  def printNum3and5(start:Int , end:Int):Unit = {
    for (i <- start to end) { //for (i <- 1 to 100 by 5) {
      print(i + " :")
      if(i % 3 == 0){
        print(" type")
      }
      if(i % 5 == 0){
        print(" typesafe")
      }
    }
  }


  //Q6.
  def printNum3and5upgrade(start:Int , end:Int):Unit = {
    for (i <- start to end){ var s = ""; if (i%3==0) s="type"; if (i%5==0) s+="safe"; if(s.isEmpty) s += i; println(s) }
  }
}
