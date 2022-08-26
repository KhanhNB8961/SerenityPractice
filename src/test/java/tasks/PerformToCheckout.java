package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static pages.CartPage.*;

public class PerformToCheckout {
    public static Performable clickCheckoutButton() {
        return Task.where("",
                Click.on(CHECKOUT_BUTTON));
    }
}
