import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
    staticFileLocation("/public");

    get("/form", (request, response) -> {
      HashMap model = new HashMap();

      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/dalton", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/dalton.vtl" );
      return new ModelAndView(model, layout);    }, new VelocityTemplateEngine());

    get("/lester", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/lester.vtl" );
      return new ModelAndView(model, layout);    }, new VelocityTemplateEngine());

    get("/kittystory", (request, response) -> {
      HashMap model = new HashMap();

      model.put("cat1", request.queryParams("cat1"));
      model.put("cat2", request.queryParams("cat2"));
      model.put("animal", request.queryParams("animal"));
      model.put("exclamation", request.queryParams("exclamation"));
      model.put("verb", request.queryParams("verb"));
      model.put("noun", request.queryParams("noun"));

      model.put("template", "templates/kittystory.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
