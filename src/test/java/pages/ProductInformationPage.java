package pages;

import net.serenitybdd.screenplay.targets.Target;

public class ProductInformationPage {
    public static final Target QUANTITY_FIELD = Target.the("")
            .locatedBy("//input[@min='1']");
    public static final Target ADD_TO_CART_BUTTON = Target.the("")
            .locatedBy("//span[contains(text(),'Add to cart')]");
    public static final Target CANCEL_GIFT_POPUP = Target.the("")
            .locatedBy("//button[contains(text(),'Cancel')]");
    public static final Target CHECK_OUT_CART_BUTTON = Target.the("")
            .locatedBy("//a[@href='/cart']//div[@class='px-3 py-3 p-xxl-3 d-flex align-items-center position-relative']");

}
