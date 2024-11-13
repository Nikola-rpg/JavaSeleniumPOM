package Nedelja10.b_Utorak.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecureAreaPage {
    WebDriver driver;
    WebElement logoutButton;
    WebElement fleshSuccess;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.cssSelector(".icon-2x.icon-signout"));
    }

    public WebElement getFleshSuccess() {
        return driver.findElement(By.cssSelector(".flash.success"));
    }
}
