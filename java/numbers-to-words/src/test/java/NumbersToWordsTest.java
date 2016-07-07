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

  @Test
  public void numbersToWords_NumbersOver20NotDivisibleBy10_TwoWordNumber() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    assertEquals("ninety one", numbersToWordsTest.numbersToWords(91));
  }

  @Test
  public void numbersToWords_NumbersDivisiblyBy100_NumberOfHundreds() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    assertEquals("one hundred twenty one", numbersToWordsTest.numbersToWords(121));
  }

}
