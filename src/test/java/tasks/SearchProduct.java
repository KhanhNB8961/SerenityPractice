package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static pages.PerroMartHomePage.*;

public class SearchProduct {
    public static Performable withKeyword(String keyword) {
        return Task.where("{0} search for a product",
                Click.on(CLOSE_POPUP_BUTTON),
                Enter.theValue(keyword).into(SEARCH_BOX).thenHit(Keys.ENTER)
        );
    }
}
