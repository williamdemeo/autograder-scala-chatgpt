// src/test/scala/CalculatorTest.scala
import org.junit.Assert._
import org.junit.Test

class CalculatorTest {
  private val calculator = new Calculator()

  @Test
  def testAddition(): Unit = {
    assertEquals(4, calculator.add(2, 2))
  }

  @Test
  def testSubtraction(): Unit = {
    assertEquals(2, calculator.subtract(4, 2))
  }

  @Test
  def testMultiplication(): Unit = {
    assertEquals(6, calculator.multiply(2, 3))
  }

  @Test
  def testDivision(): Unit = {
    assertEquals(2, calculator.divide(6, 3))
  }
}
