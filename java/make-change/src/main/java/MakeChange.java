import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Number;

public class MakeChange {
  public static void main(String[] args) {

  }

  public static String countCoins(BigDecimal amount) {
    BigDecimal cent = new BigDecimal(0.01);
    BigDecimal count = amount.divide(cent,0,BigDecimal.ROUND_HALF_UP);
    String coinCount = new String();
    Integer remainingCount = count.intValue();

    if (remainingCount > 5) {
      coinCount = String.format("%d nickel", 1);
      remainingCount = remainingCount - 5;
      if (remainingCount > 0) {
        coinCount = coinCount + ", ";
      }
    }

    if (remainingCount > 1) {
      coinCount = coinCount + String.format("%d pennies", remainingCount);
    } else {
      coinCount = coinCount + String.format("%d penny", remainingCount);
    }

    return coinCount;

  }
}
