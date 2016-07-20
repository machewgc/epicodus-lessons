import org.junit.*;
import static org.junit.Assert.*;

public class WordPuzzleTest {

  @Test
  public void wordPuzzle_computer_cmptr() {
    WordPuzzle testPuzzle = new WordPuzzle();
    assertEquals("c-mp-t-r", testPuzzle.wordPuzzle("computer"));
  }

  @Test
  public void wordPuzzle_lestermeowslikeakitten_lstrmwslikkttn() {
    WordPuzzle testPuzzle = new WordPuzzle();
    assertEquals("L-ST-R m--ws l-k- - k-tt-n", testPuzzle.wordPuzzle("LESTER meows like a kitten"));
  }

  @Test
  public void isCorrect_correctGuess_true() {
    WordPuzzle testIsCorrect = new WordPuzzle();
    assertEquals(true, testIsCorrect.isCorrect("hello self","h-ll- s-lf"));
  }

}
