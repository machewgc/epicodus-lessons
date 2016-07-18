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


    if (count.intValue() > 1) {
      return String.format("%d pennies", count.intValue());
    } else {
      return String.format("%d penny", count.intValue());
    }

  }
}
