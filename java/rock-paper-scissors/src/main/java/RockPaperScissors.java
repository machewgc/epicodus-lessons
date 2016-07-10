import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/battle", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/battle.vtl");

      String choice1 = request.queryParams("choice1");
      String choice2 = request.queryParams("choice2");
      Boolean doesFirstPlayerWin = doesFirstPlayerWin(choice1, choice2);

      model.put("doesFirstPlayerWin", doesFirstPlayerWin);
      model.put("choice1", request.queryParams("choice1"));
      model.put("choice2", request.queryParams("choice2"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static Boolean doesFirstPlayerWin(String choice1, String choice2) {
    return false;
  }
}
