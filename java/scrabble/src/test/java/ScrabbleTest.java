import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabble_LetterValueOf1_ValueOfOne() {
    Scrabble scrabbleTest = new Scrabble();
    Integer three = 3;
    assertEquals(three, scrabbleTest.scrabble("out"));
  }

}
