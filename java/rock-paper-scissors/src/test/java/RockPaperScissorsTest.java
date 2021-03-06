import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void doesFirstPlayerWin_rockBeatsScissors_true() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("win", testRockPaperScissors.doesFirstPlayerWin("rock", "scissors"));
  }

  @Test
  public void doesFirstPlayerWin_rockBeatByPaper_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("lose", testRockPaperScissors.doesFirstPlayerWin("rock", "paper"));
  }

  @Test
  public void doesFirstPlayerWin_RockTiesWithRock_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("tie", testRockPaperScissors.doesFirstPlayerWin("rock", "rock"));
  }

  @Test
  public void doesFirstPlayerWin_scissorsBeatByRock_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("lose", testRockPaperScissors.doesFirstPlayerWin("scissors", "rock"));
  }

  @Test
  public void doesFirstPlayerWin_paperBeatByScissors_false() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    assertEquals("lose", testRockPaperScissors.doesFirstPlayerWin("paper", "scissors"));
  }

 @Test
  public void doesComputerChooseAString_IsAString_String() {
    RockPaperScissors testComputerChooses = new RockPaperScissors();
    String computerChoice = testComputerChooses.computerChooses();
    assertEquals(true, computerChoice instanceof String);
  }

  @Test
  public void choiceTwo_humanOpponent_userInput() {
    RockPaperScissors testChoiceTwo = new RockPaperScissors();
    String choiceTwo = "rock";
    String opponent = "human";
    assertEquals("rock", testChoiceTwo.choiceTwo(choiceTwo, opponent));
  }

  @Test
  public void choiceTwo_computerOpponent_computerInput() {
    RockPaperScissors testChoiceTwo = new RockPaperScissors();
    String choiceTwo = "rock";
    String opponent = "computer";
    String choiceTwoOutput = testChoiceTwo.choiceTwo(choiceTwo, opponent);
    assertEquals(true, choiceTwoOutput instanceof String);
  }

}
