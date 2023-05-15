import com.gradescope.jh61b.grader.{GradedTest,GradedTestRunnerJSON}
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(classOf[GradedTestRunnerJSON])
class ProgramTests {
  @Test
  @GradedTest(name = "Test add method", max_score = 1)
  def testAdd(): Unit = {
    val result = WorkingProgram.add(2, 3)
    assert(result == 5)
  }

  @Test
  @GradedTest(name = "Test divide method", max_score = 1)
  def testDivide(): Unit = {
    val result = NonWorkingProgram.divide(10, 5)
    assert(result == 2)
  }
}
