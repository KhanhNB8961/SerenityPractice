package common;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setups.DriverSetup;

import java.time.Duration;

public class Helpers {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public Helpers() {
        driver = DriverSetup.getDriver();
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void waitForPageLoaded() {
        ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
            @Override
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
            }
        };
        try {
            Thread.sleep(1000);
            wait.until(condition);
        } catch (Throwable error) {
            Assert.fail("Timeout waiting for Page Load request to compete.");
        }
    }

    public void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    public void setText(WebElement element, String value) {
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(value);
    }

    public By productXPath(String value) {
        return (By.xpath("//div[text()='" + value + "']"));
    }

    public void checkQuantityType(String value) {
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            System.out.println("Quantity have to have type is Integer");
            driver.quit();
        }
    }
}
