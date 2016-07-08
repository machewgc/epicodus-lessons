import org.junit.*;
import static org.junit.Assert.*;

public class NumbersToWordsTest {

  @Test
  public void numbersToWords_NumberLessThan20_SingleCorrespondingWord() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    long testNumber = 15L;
    assertEquals("fifteen", numbersToWordsTest.numbersToWords(testNumber));
  }

  @Test
  public void numbersToWords_Numbers20_30_40_50_60_70_80_90_SingleCorrespondingWord() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    long testNumber = 30L;
    assertEquals("thirty", numbersToWordsTest.numbersToWords(testNumber));
  }

  @Test
  public void numbersToWords_NumbersOver20NotDivisibleBy10_TwoWordNumber() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    long testNumber = 91L;
    assertEquals("ninety one", numbersToWordsTest.numbersToWords(testNumber));
  }

  @Test
  public void numbersToWords_NumbersOver100_NumberOfHundreds() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    long testNumber = 999L;
    assertEquals("nine hundred ninety nine", numbersToWordsTest.numbersToWords(testNumber));
  }

  @Test
  public void numbersToWords_NumbersOver1000_NumberOfThousands() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    long testNumber = 14999L;
    assertEquals("fourteen thousand nine hundred ninety nine", numbersToWordsTest.numbersToWords(testNumber));
  }

  @Test
  public void numbersToWords_NumbersOver20000_NumbersUpTo999Thousand999() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    long testNumber = 25999L;
    assertEquals("twenty five thousand nine hundred ninety nine", numbersToWordsTest.numbersToWords(testNumber));
  }

  @Test
  public void numbersToWords_NumbersOver1000000_NumberOfMillions() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    long testNumber = 998025999L;
    assertEquals("nine hundred ninety eight million twenty five thousand nine hundred ninety nine", numbersToWordsTest.numbersToWords(testNumber));
  }

  @Test
  public void numbersToWords_NumbersOver1000000000_NumberOfBillions() {
    NumbersToWords numbersToWordsTest = new NumbersToWords();
    long testNumber = 122000000999L;
    assertEquals("one hundred twenty two billion nine hundred ninety nine", numbersToWordsTest.numbersToWords(testNumber));
  }

}
