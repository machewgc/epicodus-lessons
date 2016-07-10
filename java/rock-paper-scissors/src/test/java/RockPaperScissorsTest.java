import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void doesFirstPlayerWin_rockBeatsScissors_true() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals(true, testRockPaperScissors.doesFirstPlayerWin("rock", "scissors"));
  }

  @Test
  public void doesFirstPlayerWin_scissorsBeatByRock_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals(false, testRockPaperScissors.doesFirstPlayerWin("rock", "paper"));
  }

  @Test
  public void doesFirstPlayerWin_scissorsBeatByRock_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals(null, testRockPaperScissors.doesFirstPlayerWin("rock", "rock"));
  }

}
