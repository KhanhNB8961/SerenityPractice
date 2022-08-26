package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pages.PerroMartHomePage;

public class NavigateTo {
    public static Performable thePerroMartHomePage() {
        return Task.where("{0} open the website",
                Open.browserOn().the(PerroMartHomePage.class));
    }
}
