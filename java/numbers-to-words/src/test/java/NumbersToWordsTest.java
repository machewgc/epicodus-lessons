import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void numbersToWords_NumberLessThan20_SingleCorrespondingWord() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    assertEquals("fifteen", numbersToWordsTest.numbersToWords(15));
  }

  @Test
  public void numbersToWords_Numbers20_30_40_50_60_70_80_90_SingleCorrespondingWord() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    assertEquals("thirty", numbersToWordsTest.numbersToWords(30));
  }
}
