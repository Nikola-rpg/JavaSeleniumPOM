package Nedelja9.Pages;

import Nedelja9.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotificationMessagesPage extends BaseTest {
    WebDriver driver;
    WebElement notification;
    WebElement clikHereLink;

    public NotificationMessagesPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNotification() {
        return driver.findElement(By.cssSelector(".flash.notice"));
    }

    public WebElement getClikHereLink() {
        return driver.findElement(By.linkText("Click here"));
    }


    //--------------------------------------------

    public void clickOnClickHereLink() {
        getClikHereLink().click();
    }

}
