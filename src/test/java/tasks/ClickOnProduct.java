package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static common.Helpers.*;

public class ClickOnProduct {
    public static Performable named(String productName) {
        return Task.where("",
                Click.on(productXPath(productName))
        );
    }
}
