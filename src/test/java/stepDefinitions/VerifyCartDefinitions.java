package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import tasks.NavigateTo;
import tasks.Search;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static setups.DriverSetup.*;

public class VerifyCartDefinitions {
    @Given("{actor} go to website")
    public void openHomePage(Actor staff) {
        staff.can(BrowseTheWeb.with(getDriver()));
        staff.wasAbleTo(NavigateTo.thePerroMartHomePage());
    }
    @When("{actor} add an item to cart")
    public void addToCart(Actor staff) {
        when(staff).attemptsTo(Search.item("hihihihihihihihiiihihihihih"));
        and(staff).attemptsTo();
//        and(staff).attemptsTo();
    }
    @Then("I verify that item have been added")
    public void verifyCart() {

    }
}
