import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.get;
import static spark.Spark.staticFileLocation;
import static spark.route.HttpMethod.post;

public class App {

    public static void main(String[]args){
        staticFileLocation("/public");

        get("/", (request,response)-> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "home.hbs");
        }, new HandlebarsTemplateEngine());

        get("/hero", (request,response)-> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "hero.hbs");
        }, new HandlebarsTemplateEngine());

        get("/squad", (request,response)-> {
            Map<String, Object>model = new HashMap<String, Object>();
            String recipient = request.queryParams("recipient");
            String sender = request.queryParams("sender");
            model.put("recipient",recipient);
            model.put("sender",sender);
            return new ModelAndView(model, "squad.hbs");
        }, new HandlebarsTemplateEngine());

        get("/herosquad", (request,response)-> {
            Map<String, Object> model = new HashMap<String, Object>();
            String name = request.queryParams("name");
            String age = request.queryParams("age");
            String power = request.queryParams("power");
            String weakness = request.queryParams("weakness");
            model.put("name", name);
            model.put("age", age);
            model.put("power", power);
            model.put("weakness", weakness);

            String hero = request.queryParams("hero");
            String group = request.queryParams("group");
            model.put("hero", hero);
            model.put("group", group);
            return new ModelAndView(model, "herosquad.hbs");
        }, new HandlebarsTemplateEngine());
    }

}
