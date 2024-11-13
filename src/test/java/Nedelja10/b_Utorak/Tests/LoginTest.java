package Nedelja10.b_Utorak.Tests;

import Nedelja10.b_Utorak.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("http://the-internet.herokuapp.com/login");
    }

    @Test
    public void userCanLogIn() {
        String validUserName = excelReader.getStringData("Sheet1", 1, 0);
        String validPassword = excelReader.getStringData("Sheet1", 1, 1);

        loginPage.inputUserName(validUserName);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLogInButton();
        Assert.assertTrue(secureAreaPage.getLogoutButton().isDisplayed());
        Assert.assertTrue(secureAreaPage.getFleshSuccess().isDisplayed());
        Assert.assertTrue(secureAreaPage.getFleshSuccess().getText().contains("You logged into a secure area!"));
    }

    @Test
    public void userCanNotLogInWithInvalidUserName() {
        String invalidUserName = excelReader.getStringData("Sheet1", 1, 2);
        String validPassword = excelReader.getStringData("Sheet1", 1, 1);

        loginPage.inputUserName(invalidUserName);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLogInButton();
        Assert.assertTrue(loginPage.getFlashError().isDisplayed());
        Assert.assertTrue(loginPage.getFlashError().getText().contains("Your username is invalid!"));
    }

    @Test
    public void userCanNotLogInWithInvalidPassword() {
        String validUserName = excelReader.getStringData("Sheet1", 1, 0);
        String invalidPassword = excelReader.getStringData("Sheet1", 1, 3);

        loginPage.inputUserName(validUserName);
        loginPage.inputPassword(invalidPassword);
        loginPage.clickOnLogInButton();
        Assert.assertTrue(loginPage.getFlashError().isDisplayed());
        Assert.assertTrue(loginPage.getFlashError().getText().contains("Your password is invalid!"));
    }

    @Test
    public void userCanNotLogInWithInvalidUserNameAndPassword() {
        String invalidUserName = excelReader.getStringData("Sheet1", 1, 2);
        String invalidPassword = excelReader.getStringData("Sheet1", 1, 3);

        loginPage.inputUserName(invalidUserName);
        loginPage.inputPassword(invalidPassword);
        loginPage.clickOnLogInButton();
        Assert.assertTrue(loginPage.getFlashError().isDisplayed());
        //Assert.assertTrue(loginPage.getFlashError().getText().contains("Your username is invalid!"));
        boolean isPresent = false;
        try {
            isPresent = secureAreaPage.getLogoutButton().isDisplayed();
        } catch (Exception e) {
        }
        Assert.assertFalse(isPresent);
    }

    @AfterClass
    public void tearDown() {
        //driver.close();
    }
}
