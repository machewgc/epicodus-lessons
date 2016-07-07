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
  public void numbersToWords_NumbersOver100_NumberOfHundreds() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    assertEquals("nine hundred ninety nine", numbersToWordsTest.numbersToWords(999));
  }

  @Test
  public void numbersToWords_NumbersOver1000_NumberOfThousands() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    assertEquals("fourteen thousand nine hundred ninety nine", numbersToWordsTest.numbersToWords(14999));
  }

  @Test
  public void numbersToWords_NumbersOver20000_NumbersUpTo999Thousand999() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    assertEquals("twenty five thousand nine hundred ninety nine", numbersToWordsTest.numbersToWords(25999));
  }

  @Test
  public void numbersToWords_NumbersOver1000000_NumberOfMillions() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    assertEquals("nine hundre ninety eight million nine hundred ninety nine thousand nine hundred ninety nine", numbersToWordsTest.numbersToWords(998999999));
  }

}
