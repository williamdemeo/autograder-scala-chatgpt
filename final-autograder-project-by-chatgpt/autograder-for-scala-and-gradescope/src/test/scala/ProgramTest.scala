import com.gradescope.jh61b.grader.{GradedTest,GradedTestRunnerJSON}
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(classOf[GradedTestRunnerJSON])
class ProgramTests {
  @Test
  @GradedTest(name = "Test CorrectProgram add method", max_score = 1)
  def testAddRight(): Unit = {
    assert(CorrectProgram.sum(2, 3) == 5)
  }

  @Test
  @GradedTest(name = "Test IncorrectProgram add method", max_score = 1)
  def testAddWrong(): Unit = {
    assert(IncorrectProgram.sum(2, 3) == 5)
  }
}

