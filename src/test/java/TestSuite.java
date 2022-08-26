import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.junit.Test;
import org.junit.runner.RunWith;
import setups.BaseSetup;
import tasks.*;
import pages.CartPage;
import pages.PaymentInformationPage;

import static common.VerifyCartParameter.*;
import static common.VerifyInformationParameter.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static setups.ConfigProperties.*;

@RunWith(SerenityRunner.class)
public class TestSuite extends BaseSetup {
    @Test
    public void shouldBeVerifyCart() {
        initPropertyFile("verifyCart.properties");

        givenThat(staff).wasAbleTo(
                NavigateTo.thePerroMartHomePage());
        when(staff).attemptsTo(
                SearchProduct.withKeyword(SEARCH_KEY),
                ClickOnProduct.named(ITEM_NAME));
        and(staff).attemptsTo(
                AddProductToCart.withQuantity(QTY));
        then(staff).attemptsTo(
                Ensure.that(CartPage.PRODUCT_NAME).hasText(ITEM_NAME),
                Ensure.that(CartPage.QUANTITY_VALUE).hasValue(QTY));
    }

    @Test
    public void shouldBeVerifyInformation() {
        initPropertyFile("verifyInformation.properties");

        givenThat(staff).wasAbleTo(
                NavigateTo.thePerroMartHomePage());
        when(staff).attemptsTo(
                SearchProduct.withKeyword(KEYWORD),
                ClickOnProduct.named(PRODUCT_NAME));
        and(staff).attemptsTo(
                AddProductToCart.withQuantity(QUANTITY),
                PerformToCheckout.clickCheckoutButton());
        and(staff).attemptsTo(
                Confirm.email(EMAIL),
                Confirm.name(FIRST_NAME, LAST_NAME),
                Confirm.address(ADDRESS, APARTMENT),
                Confirm.postalCode(POSTAL_CODE),
                Confirm.phoneNumber(PHONE_NUMBER));
        then(staff).attemptsTo(
                Ensure.that(PaymentInformationPage.PRODUCT_NAME).hasText(PRODUCT_NAME),
                Ensure.that(PaymentInformationPage.CONTACT_VALUE).hasText(EMAIL),
                Ensure.that(PaymentInformationPage.SHIP_TO_VALUE).hasText(ADDRESS + ", " + APARTMENT + ", " + COUNTRY + " " + POSTAL_CODE));
    }
}
