import org.junit.Test
import org.junit.Assert._

class CalculatorTest {
  @Test def testAddition(): Unit = {
    val result = Calculator.add(2, 3)
    assertEquals(5, result)
  }

  @Test def testSubtraction(): Unit = {
    val result = Calculator.subtract(5, 3)
    assertEquals(2, result)
  }

  @Test def testMultiplication(): Unit = {
    val result = Calculator.multiply(4, 5)
    assertEquals(20, result)
  }

  @Test def testDivision(): Unit = {
    val result = Calculator.divide(10, 2)
    assertEquals(5, result)
  }
}
