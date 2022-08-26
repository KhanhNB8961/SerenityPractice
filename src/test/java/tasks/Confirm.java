package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static pages.InformationPage.*;

public class Confirm {
    public static Performable email(String email) {
        return Task.where("",
                Enter.theValue(email).into(EMAIL_FIELD)
        );
    }
    public static Performable name(String firstName, String lastName) {
        return Task.where("",
                Enter.theValue(firstName).into(FIRSTNAME_FIELD),
                Enter.theValue(lastName).into(LASTNAME_FIELD)
        );
    }
    public static Performable address(String address, String apartment) {
        return Task.where("",
                Enter.theValue(address).into(ADDRESS_FIELD),
                Enter.theValue(apartment).into(APARTMENT_FIELD)
        );
    }
    public static Performable postalCode(String postalCode) {
        return Task.where("",
                Enter.theValue(postalCode).into(POSTAL_CODE_FIELD)
        );
    }
    public static Performable phoneNumber(String phoneNumber) {
        return Task.where("",
                Enter.theValue(phoneNumber).into(PHONE_NUMBER_FIELD),
                Click.on(CONTINUES_BUTTON)
        );
    }

}
