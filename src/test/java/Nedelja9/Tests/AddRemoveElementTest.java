package Nedelja9.Tests;

import Nedelja9.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddRemoveElementTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void UserCanAddElement() {
        homepagePage.clickOnAddRemoveElementsLink();

        boolean isPresent = false;
        try {
            isPresent = addRemoveElementsPage.getDeleteButton().isDisplayed();
        } catch (Exception e) {
        }
        Assert.assertFalse(isPresent);

        addRemoveElementsPage.clickOnAddElementButton();
        Assert.assertTrue(addRemoveElementsPage.getDeleteButton().isDisplayed());
    }

    @Test
    public void UserCanDeleteElement() {
        homepagePage.clickOnAddRemoveElementsLink();
        addRemoveElementsPage.clickOnAddElementButton();
        Assert.assertTrue(addRemoveElementsPage.getDeleteButton().isDisplayed());

        addRemoveElementsPage.clickOnDeleteButton();

        boolean isPresent = false;
        try {
            isPresent = addRemoveElementsPage.getDeleteButton().isDisplayed();
        } catch (Exception e) {
        }
        Assert.assertFalse(isPresent);
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
