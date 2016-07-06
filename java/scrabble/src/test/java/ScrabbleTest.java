import org.junit.*;
import static org.junit.Assert.*;

public class ScrabbleTest {

  @Test
  public void scrabble_LettersAEIOULNRST_ValueOfOne() {
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

  @Test
  public void scrabble_LettersFHVWY_ValueOf4() {
    Scrabble scrabbleTest = new Scrabble();
    Integer seven = 7;
    assertEquals(seven, scrabbleTest.scrabble("fod"));
  }

  @Test
  public void scrabble_LettersFHVWY_ValueOf4() {
    Scrabble scrabbleTest = new Scrabble();
    Integer eight = 8;
    assertEquals(eight, scrabbleTest.scrabble("korn"));
  }

}
