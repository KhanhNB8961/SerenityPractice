package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static ui.SearchField.searchBox;

public class Search {
    public static Performable item(String itemName) {
        return Task.where("",
                Enter.theValue(itemName).into(searchBox).thenHit(Keys.ENTER));
    }
}
