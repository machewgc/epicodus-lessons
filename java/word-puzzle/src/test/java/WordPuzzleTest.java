import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
  public void choiceTwo_computerOpponent_computerInput() {
    WordPuzzle testPuzzle = new WordPuzzle();
    String puzzle = "computer";
    assertEquals("c-mp-t-r", testPuzzle.wordPuzzle("computer"));
  }

}
