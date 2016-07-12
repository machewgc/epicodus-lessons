import java.util.Map;
import java.util.HashMap;
import java.util.Random;
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

      String choiceOne = request.queryParams("choiceOne");
      String choiceTwo = request.queryParams("choiceTwo");
      Boolean doesFirstPlayerWin = doesFirstPlayerWin(choiceOne, choiceTwo);

      if (doesFirstPlayerWin == null) {
        model.put("isATie", true);
        doesFirstPlayerWin = false;
      } else {
        model.put("isATie", false);
      }
      model.put("doesFirstPlayerWin", doesFirstPlayerWin);
      model.put("choiceOne", choiceOne);
      model.put("choiceTwo", choiceTwo);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }

  public static String computerChooses() {
    Random myRandom = new Random();


    String computerChoice = new String();
    Map<Integer,String> computerChoices = new HashMap<Integer,String>();

    computerChoices.put(0, "rock");
    computerChoices.put(1, "paper");
    computerChoices.put(2, "scissors");

    computerChoice = computerChoices(myRandom.nextInt(3));

  }

  //This could be improved by returning two booleans. One for a player1 victory and one for a tie. This would avoid null
  public static Boolean doesFirstPlayerWin(String choiceOne, String choiceTwo) {
    if (choiceOne.equals(choiceTwo)) {
      return null;
    } else if (choiceOne.equals("rock") && choiceTwo.equals("paper")) {
        return false;
    } else if (choiceOne.equals("scissors") && choiceTwo.equals("rock")) {
        return false;
    } else if (choiceOne.equals("paper") && choiceTwo.equals("scissors")) {
        return false;
    } else {
      return true;
    }
  }
}
