package pages;

import net.serenitybdd.screenplay.targets.Target;

public class PaymentInformationPage {
    public static final Target CONTACT_VALUE = Target.the("")
            .locatedBy("//bdo[@dir='ltr']");
    public static final Target SHIP_TO_VALUE = Target.the("")
            .locatedBy("//address[@class='address address--tight']");
    public static final Target PRODUCT_NAME = Target.the("")
            .locatedBy("//th[@class='product__description']");
}
