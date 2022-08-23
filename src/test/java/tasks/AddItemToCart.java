package tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class AddItemToCart {
    public static Performable item(String itemName) {
        return Task.where("",
                Enter.theValue(itemName).into(By.xpath("//input[@placeholder='Search for products, brands and more']")).thenHit(Keys.ENTER));
    }
}
