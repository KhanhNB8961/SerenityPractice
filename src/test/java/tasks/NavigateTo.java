package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable thePerroMartHomePage() {
        return Task.where("",
                Open.browserOn().the(PerroMartHomePage.class));
    }
}
