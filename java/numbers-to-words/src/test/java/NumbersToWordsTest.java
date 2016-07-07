import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void numbersToWords_NumberLessThan20_SingleCorrespondingWord() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    assertEquals("fifteen", numbersToWordsTest.numbersToWords(15));
  }


}
