import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Number;
import java.util.LinkedHashMap;
import java.io.*;

public class MakeChange {
  public static void main(String[] args) {

  }

  public static String countCoins(BigDecimal amount) {
    BigDecimal cent = new BigDecimal(0.01);
    BigDecimal count = amount.divide(cent,0,BigDecimal.ROUND_HALF_UP);
    String coinCount = new String();
    Integer remainingCount = count.intValue();
    Integer keyCount = 0;
    LinkedHashMap<String,Integer> coinsAndAmounts = new LinkedHashMap<String,Integer>();

    if (remainingCount > 20) {
      coinsAndAmounts.put("dimes",2);
      remainingCount -= 20;
    } else if (remainingCount > 10) {
      coinsAndAmounts.put("dime",1);
      remainingCount -= 10;
    }

    if (remainingCount > 5) {
      coinsAndAmounts.put("nickel",1);
      remainingCount -= 5;
    }

    if (remainingCount > 1) {
      coinsAndAmounts.put("pennies", remainingCount);
    } else if (remainingCount == 1) {
      coinsAndAmounts.put("penny", 1);
    }

    for (String key : coinsAndAmounts.keySet()) {
      keyCount ++;
      coinCount = coinCount + coinsAndAmounts.get(key) + " " + key;
      if (coinsAndAmounts.size() > keyCount) {
        coinCount = coinCount + ", ";
      }
    }

    return coinCount;

  }
}
