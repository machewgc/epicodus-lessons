import java.util.HashMap;

public class NumbersToWords {
  public static void main(String[] args) {

  }
  public static String numbersToWords(Integer numberInput) {
    String numberInWords = new String();

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

    HashMap<Integer,String> tenMultiplesOverTwenty = new HashMap();
      tenMultiplesOverTwenty.put(20, "twenty");
      tenMultiplesOverTwenty.put(30, "thirty");
      tenMultiplesOverTwenty.put(40, "fourty");
      tenMultiplesOverTwenty.put(50, "fifty");
      tenMultiplesOverTwenty.put(60, "sixty");
      tenMultiplesOverTwenty.put(70, "seventy");
      tenMultiplesOverTwenty.put(80, "eighty");
      tenMultiplesOverTwenty.put(90, "ninety");

    if (numberInput % 10 == 0 && numberInput > 10) {
      numberInWords = tenMultiplesOverTwenty.get(numberInput);
    } else {
      numberInWords = underTwenty.get(numberInput);
    }

    return numberInWords;
  }
}
