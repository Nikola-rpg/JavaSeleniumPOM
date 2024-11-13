package Nedelja10.c_Petak.Pages;

import Nedelja10.c_Petak.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(id = "userName")
    public WebElement userNmaeField;

    @FindBy(id = "password")
    public WebElement passwordField;

    //-------------------------------

    public void clickOnLoginButton() {
        loginButton.click();
    }

    public void inputUsername(String username) {
        userNmaeField.clear();
        userNmaeField.sendKeys(username);
    }

    public void inputPassword(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
    }
}
