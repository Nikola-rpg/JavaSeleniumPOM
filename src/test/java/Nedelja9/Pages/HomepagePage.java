package Nedelja9.Pages;

import Nedelja9.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepagePage extends BaseTest {
    WebDriver driver;
    WebElement addRemoveElementsLink;
    WebElement checkboxes;
    WebElement notificationMessages;

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getaddRemoveElementsLink() {
        return driver.findElement(By.linkText("Add/Remove Elements"));
    }

    public WebElement getCheckboxes() {
        return driver.findElement(By.linkText("Checkboxes"));
    }

    public WebElement getNotificationMessages() {
        return driver.findElement(By.linkText("Notification Messages"));
    }

    //----------------------------------------------------------------

    public void clickOnAddRemoveElementsLink() {
        getaddRemoveElementsLink().click();
    }

    public void clickOnCheckboxesLink() {
        getCheckboxes().click();
    }

    public void clickOnNotificationMessages() {
        getNotificationMessages().click();
    }
}
