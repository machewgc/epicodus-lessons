import java.util.Map;
import java.util.HashMap;
import java.util.Random;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class WordPuzzle {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/puzzle", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/puzzle.vtl");

      String wordOrPhrase = request.queryParams("wordOrPhrase");
      String puzzle = wordPuzzle(wordOrPhrase);

      model.put("puzzle",puzzle);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

  public static String wordPuzzle(String wordOrPhrase) {
      String puzzle = wordOrPhrase.replaceAll("[aeiouAEIOU]","-");
      return puzzle;
  }

  public static Boolean isCorrect(String guess, String answer) {
    return false;
  }
}
