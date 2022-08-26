package pages;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://perromart.com.sg/")
public class PerroMartHomePage extends PageObject {
    public static final Target CLOSE_POPUP_BUTTON = Target.the("Close popup button")
            .locatedBy("//button[@tabindex='0']");
    public static final Target SEARCH_BOX = Target.the("Search box")
            .locatedBy("//input[@placeholder='Search for products, brands and more']");
}
