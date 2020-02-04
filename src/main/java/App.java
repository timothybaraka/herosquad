import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;

public class App {

    public static void main(String[]args){
        staticFileLocation("/public");

        get("/", (request,response)-> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "hero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad", (request,response)-> {
            Map<String, Object>model = new HashMap<->();
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());
    }

}
