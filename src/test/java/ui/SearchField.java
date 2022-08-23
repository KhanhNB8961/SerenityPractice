package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchField {
    public static final Target searchBox = Target.the("")
            .located(By.xpath("//input[@placeholder='Search for products, brands and more']"));
}
