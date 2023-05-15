object NonWorkingProgram {
  def divide(a: Int, b: Int): Int = a / b

  def main(args: Array[String]): Unit = {
    val result = divide(10, 0)
    println(result)
  }
}
