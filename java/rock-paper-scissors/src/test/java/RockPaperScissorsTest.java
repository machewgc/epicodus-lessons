import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void doesFirstPlayerWin_rockBeatsScissors_true() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals(true, testRockPaperScissors.doesFirstPlayerWin("rock", "scissors"));
  }

}
