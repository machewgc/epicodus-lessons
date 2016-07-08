import java.util.HashMap;
import java.lang.*;

public class NumbersToWords {
  public static void main(String[] args) {

  }
  public static String numbersToWords(Long numberInput) {
    String numberInWords = new String();
    Long count = numberInput;

    if (count >= 1000000000) {
      numberInWords = oneToNineNineNine((count - count % 1000000000) / 1000000000) + " billion";
      count = numberInput % 1000000000;
      if (count > 0) {
        numberInWords = numberInWords + " ";
      }
    }
    if (count >= 1000000) {
      numberInWords = oneToNineNineNine((count - count % 1000000) / 1000000) + " million";
      count = numberInput % 1000000;
      if (count > 0) {
        numberInWords = numberInWords + " ";
      }
    }
    if (count >= 1000) {
      numberInWords = numberInWords + oneToNineNineNine((count - count % 1000) / 1000) + " thousand";
      count = numberInput % 1000;
      if (count > 0) {
        numberInWords = numberInWords + " ";
      }
    }
    if (count > 0) {
      numberInWords = numberInWords + oneToNineNineNine(count);
    }
    return numberInWords;
  }
  public static String oneToNineNineNine(Long numberInput) {
    String numberInWords = new String();
    Long count = numberInput;
    Integer key = 0;
    Long temp = 0L;

    HashMap<Integer,String> underTwenty = new HashMap();
      underTwenty.put(1,"one");
      underTwenty.put(2,"two");
      underTwenty.put(3,"three");
      underTwenty.put(4,"four");
      underTwenty.put(5,"five");
      underTwenty.put(6,"six");
      underTwenty.put(7,"seven");
      underTwenty.put(8,"eight");
      underTwenty.put(9,"nine");
      underTwenty.put(10,"ten");
      underTwenty.put(11,"eleven");
      underTwenty.put(12,"twelve");
      underTwenty.put(13,"thirteen");
      underTwenty.put(14,"fourteen");
      underTwenty.put(15,"fifteen");
      underTwenty.put(16,"sixteen");
      underTwenty.put(17,"seventeen");
      underTwenty.put(18,"eighteen");
      underTwenty.put(19,"nineteen");

    HashMap<Integer,String> tenMultiplesOverTen = new HashMap();
      tenMultiplesOverTen.put(20, "twenty");
      tenMultiplesOverTen.put(30, "thirty");
      tenMultiplesOverTen.put(40, "fourty");
      tenMultiplesOverTen.put(50, "fifty");
      tenMultiplesOverTen.put(60, "sixty");
      tenMultiplesOverTen.put(70, "seventy");
      tenMultiplesOverTen.put(80, "eighty");
      tenMultiplesOverTen.put(90, "ninety");

    HashMap<Integer,String> hundreds = new HashMap();
      hundreds.put(100, "one hundred");
      hundreds.put(200, "two hundred");
      hundreds.put(300, "three hundred");
      hundreds.put(400, "four hundred");
      hundreds.put(500, "five hundred");
      hundreds.put(600, "six hundred");
      hundreds.put(700, "seven hundred");
      hundreds.put(800, "eight hundred");
      hundreds.put(900, "nine hundred");

    if (count >= 100) {
      temp = count - count % 100;
      key = temp.intValue();
      numberInWords = numberInWords + hundreds.get(key);
      count = numberInput % 100;
      if (count > 0) {
        numberInWords = numberInWords + " ";
      }
    }
    if (numberInput > 19) {
      temp = count - count % 10;
      key = temp.intValue();
      numberInWords = numberInWords + tenMultiplesOverTen.get(key);
      count = numberInput % 10;
      if (count > 0) {
        numberInWords = numberInWords + " ";
      }
    }
    if (count > 0) {
      key = count.intValue();
      numberInWords = numberInWords + underTwenty.get(key);
    }
    return numberInWords;
  }
}
