package pages;

import net.serenitybdd.screenplay.targets.Target;

public class CartPage {
    public static final Target CHECKOUT_BUTTON = Target.the("")
            .locatedBy("//div[@class='col-md-4']//button[text()='Checkout']");
    public static final Target PRODUCT_NAME = Target.the("")
            .locatedBy("//div[@class='CartItems_Title__x96Gd']");
    public static final Target QUANTITY_VALUE = Target.the("")
            .locatedBy("//div[@class='col-md-2']//input[@type='number']");
}
