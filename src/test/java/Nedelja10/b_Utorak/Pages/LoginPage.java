package Nedelja10.b_Utorak.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    WebElement usernameField;
    WebElement passwordField;
    WebElement loginButton;
    WebElement flashError;

public LoginPage(WebDriver driver) {
    this.driver = driver;
}

public WebElement getUsernameField() {
    return driver.findElement(By.id("username"));
}

public WebElement getPasswordField() {
    return driver.findElement(By.id("password"));
}

public WebElement getLoginButton() {
    return driver.findElement(By.cssSelector("button[type='submit']"));
}

public WebElement getFlashError() {
    return driver.findElement(By.cssSelector(".flash.error"));
}

//------------------------------------

public void inputUserName(String UserName) {
    getUsernameField().clear();
    getUsernameField().sendKeys(UserName);
}

public void inputPassword(String Password) {
    getPasswordField().clear();
    getPasswordField().sendKeys(Password);
}

public void clickOnLogInButton() {
    getLoginButton().click();
}
}
