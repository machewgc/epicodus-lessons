import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void doesFirstPlayerWin_rockBeatsScissors_true() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals(true, testRockPaperScissors.doesFirstPlayerWin("rock", "scissors"));
  }

  @Test
  public void doesFirstPlayerWin_rockBeatByPaper_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals(false, testRockPaperScissors.doesFirstPlayerWin("rock", "paper"));
  }

  @Test
  public void doesFirstPlayerWin_RockTiesWithRock_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals(null, testRockPaperScissors.doesFirstPlayerWin("rock", "rock"));
  }

  @Test
  public void doesFirstPlayerWin_scissorsBeatByRock_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals(false, testRockPaperScissors.doesFirstPlayerWin("scissors", "rock"));
  }

  @Test
  public void doesFirstPlayerWin_paperBeatByScissors_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals(false, testRockPaperScissors.doesFirstPlayerWin("paper", "scissors"));
  }

  @Test
  public void doesComputerChooseAString_IsAString_String() {
    RockPaperScissors testComputerChooses = new RockPaperScissors();
    String computerChoice = testComputerChooses.computerChooses();
    assertEquals(true, computerChoice instanceof String);
  }

  @Test
  public void isHumanOpponent_human_True() {
    RockPaperScissors testOpponent = new RockPaperScissors();
    assertEquals(true, testOpponent.isHumanOpponent("human"));
  }

  @Test
  public void isHumanOpponent_computer_False() {
    RockPaperScissors testOpponent = new RockPaperScissors();
    assertEquals(false, testOpponent.isHumanOpponent("computer"));
  }

}
