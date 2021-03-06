import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.lang.Number;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.io.*;
import java.lang.Math;
import spark.ModelAndView;
import java.text.DecimalFormat;

public class MakeChange {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/change", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/change.vtl");

      DecimalFormat format = new DecimalFormat();
      format.setParseBigDecimal(true);
      String decimalString = request.queryParams("decimalNumber");
      BigDecimal decimalNumber = new BigDecimal(decimalString);

      String coins = countCoins(decimalNumber);

      model.put("coins", coins);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

  public static String countCoins(BigDecimal amount) {
    BigDecimal cent = new BigDecimal(0.01);
    BigDecimal count = amount.divide(cent,0,BigDecimal.ROUND_HALF_UP);
    String coinCount = new String();
    Integer remainingCount = count.intValue();
    Integer keyCount = 0;
    LinkedHashMap<String,Integer> coinsAndAmounts = new LinkedHashMap<String,Integer>();

    if (remainingCount >= 50) {
      coinsAndAmounts.put("quarters",Math.round(remainingCount/25));
      remainingCount = remainingCount - Math.round(remainingCount/25) * 25;
    } else if (remainingCount >= 25) {
      coinsAndAmounts.put("quarter",1);
      remainingCount -= 25;
    }

    if (remainingCount >= 20) {
      coinsAndAmounts.put("dimes",2);
      remainingCount -= 20;
    } else if (remainingCount >= 10) {
      coinsAndAmounts.put("dime",1);
      remainingCount -= 10;
    }

    if (remainingCount >= 5) {
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
