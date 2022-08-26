package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static pages.ProductInformationPage.*;

public class AddProductToCart {
    public static Performable withQuantity(String quantity) {
        return Task.where("",
                Enter.theValue(quantity).into(QUANTITY_FIELD)
                        .then(Click.on(ADD_TO_CART_BUTTON))
                        .then(Click.on(CANCEL_GIFT_POPUP))
                        .then(Click.on(CHECK_OUT_CART_BUTTON))
        );
    }
}
