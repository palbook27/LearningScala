object chapter1 {
  def acction() = {
    //Q1
    print("Please remain on the line")

    //Q2
    println("data : " + cToF(22.5))

    //Q3
    println("data : " + recToF(72.5))
  }

  def cToF(x:Double):Double = {
    val c = (x * 9/5) + 32
    c
  }

  def recToF(x:Double):Double = {
    val c = (x - 32) / 9 * 5
    c
  }
}
