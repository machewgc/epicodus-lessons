import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabble_LetterValueOf1_ValueOfOne() {
    Scrabble scrabbleTest = new Scrabble();
    Integer three = 3;
    assertEquals(three, scrabbleTest.scrabble("out"));
  }

  @Test
  public void scrabble_LettersDandG_ValueOf2() {
    Scrabble scrabbleTest = new Scrabble();
    Integer four = 4;
    assertEquals(four, scrabbleTest.scrabble("doo"));
  }

  @Test
  public void scrabble_LettersBCMP_ValueOf3() {
    Scrabble scrabbleTest = new Scrabble();
    Integer six = 6;
    assertEquals(six, scrabbleTest.scrabble("bod"));
  }

}
