import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");

    get("/", (request, response) -> {
      return new ModelAndView(new HashMap(), "templates/hello.vtl");
    }, new VelocityTemplateEngine());

    get("/favorite_photos", (request, response) -> {
      return new ModelAndView(new HashMap(), "templates/favorite_photos.vtl");
    }, new VelocityTemplateEngine());

    get("/about_me", (request, response) ->
    "<!DOCTYPE html>" +
      "<html>" +
      "<head>" +
        "<title>About Me</title>" +
        "<link rel='stylesheet'  href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
      "</head>" +
      "<body>" +
        "<h1>About Me</h1>" +
          "<ul>" +
            "<li>I love cats</li>" +
            "<li>I love ice cream</li>" +
            "<li>I love lamp</li>" +
          "</ul>" +
        "</body>" +
        "</html>"
    );
  }
}
