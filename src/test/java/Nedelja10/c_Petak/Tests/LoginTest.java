package Nedelja10.c_Petak.Tests;

import Nedelja10.c_Petak.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void userCanLogIn() {
        homepagePage.clickOnCard("Book Store Application");
        bookStorePage.clickOnCard("Login");
        loginPage.inputUsername("Petar45!");
        loginPage.inputPassword("Petar45!");
        loginPage.clickOnLoginButton();
        Assert.assertTrue(profilePage.logoutButton.isDisplayed());

    }
}
