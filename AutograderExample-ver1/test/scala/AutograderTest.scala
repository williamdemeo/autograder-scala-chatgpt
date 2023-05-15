import org.junit.Test
import org.junit.Assert._

class AutograderTest {
  @Test
  def testCorrectProgram(): Unit = {
    assertEquals(5, CorrectProgram.add(2, 3))
  }

  @Test
  def testIncorrectProgram(): Unit = {
    assertEquals(5, IncorrectProgram.add(2, 3))
  }
}
