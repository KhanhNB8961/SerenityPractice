package pages;

import net.serenitybdd.screenplay.targets.Target;

public class InformationPage {
    public static final Target EMAIL_FIELD = Target.the("")
            .locatedBy("//input[@id='checkout_email']");
    public static final Target FIRSTNAME_FIELD = Target.the("")
            .locatedBy("//input[@id='checkout_shipping_address_first_name']");
    public static final Target LASTNAME_FIELD = Target.the("")
            .locatedBy("//input[@id='checkout_shipping_address_last_name']");
    public static final Target ADDRESS_FIELD = Target.the("")
            .locatedBy("//input[@id='checkout_shipping_address_address1']");
    public static final Target APARTMENT_FIELD = Target.the("")
            .locatedBy("//input[@id='checkout_shipping_address_address2']");
    public static final Target POSTAL_CODE_FIELD = Target.the("")
            .locatedBy("//input[@id='checkout_shipping_address_zip']");
    public static final Target PHONE_NUMBER_FIELD = Target.the("")
            .locatedBy("//input[@id='checkout_shipping_address_phone']");
    public static final Target CONTINUES_BUTTON = Target.the("")
            .locatedBy("//button[@id='continue_button']");

}
