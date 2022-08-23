package ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchField {
    public static final Target searchBox = Target.the("")
            .locatedBy("//input[@placeholder='Search for products, brands and more']");
}
