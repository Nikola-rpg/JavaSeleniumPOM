package Nedelja9.Tests;

import Nedelja9.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void userCanCheckCheckbox1() {
        homepagePage.clickOnCheckboxesLink();
        if (checkboxesPage.getCheckbox1().isSelected()) {
            checkboxesPage.clickOnCheckbox1();
        }
        Assert.assertFalse(checkboxesPage.getCheckbox1().isSelected());
        checkboxesPage.clickOnCheckbox1();
        Assert.assertTrue(checkboxesPage.getCheckbox1().isSelected());
    }

    @Test
    public void userCanUncheckCheckbox1() {
        homepagePage.clickOnCheckboxesLink();
        if (!checkboxesPage.getCheckbox1().isSelected()) {
            checkboxesPage.clickOnCheckbox1();
        }
        Assert.assertTrue(checkboxesPage.getCheckbox1().isSelected());
        checkboxesPage.clickOnCheckbox1();
        Assert.assertFalse(checkboxesPage.getCheckbox1().isSelected());
    }

    @Test
    public void userCanCheckAndUncheckCheckbox1() {
        homepagePage.clickOnCheckboxesLink();
        if (checkboxesPage.getCheckbox1().isSelected()) {
            checkboxesPage.clickOnCheckbox1();
        }
        Assert.assertFalse(checkboxesPage.getCheckbox1().isSelected());
        checkboxesPage.clickOnCheckbox1();
        Assert.assertTrue(checkboxesPage.getCheckbox1().isSelected());
        checkboxesPage.clickOnCheckbox1();
        Assert.assertFalse(checkboxesPage.getCheckbox1().isSelected());
    }


    @Test
    public void userCanCheckCheckbox2() {
        homepagePage.clickOnCheckboxesLink();
        if (checkboxesPage.getCheckbox2().isSelected()) {
            checkboxesPage.clickOnCheckbox2();
        }
        Assert.assertFalse(checkboxesPage.getCheckbox2().isSelected());
        checkboxesPage.clickOnCheckbox2();
        Assert.assertTrue(checkboxesPage.getCheckbox2().isSelected());
    }

    @Test
    public void userCanUncheckCheckbox2() {
        homepagePage.clickOnCheckboxesLink();
        if (!checkboxesPage.getCheckbox2().isSelected()) {
            checkboxesPage.clickOnCheckbox2();
        }
        Assert.assertTrue(checkboxesPage.getCheckbox2().isSelected());
        checkboxesPage.clickOnCheckbox2();
        Assert.assertFalse(checkboxesPage.getCheckbox2().isSelected());
    }

    @Test
    public void userCanCheckAndUncheckCheckbox2() {
        homepagePage.clickOnCheckboxesLink();
        if (checkboxesPage.getCheckbox2().isSelected()) {
            checkboxesPage.clickOnCheckbox2();
        }
        Assert.assertFalse(checkboxesPage.getCheckbox2().isSelected());
        checkboxesPage.clickOnCheckbox2();
        Assert.assertTrue(checkboxesPage.getCheckbox2().isSelected());
        checkboxesPage.clickOnCheckbox2();
        Assert.assertFalse(checkboxesPage.getCheckbox2().isSelected());
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

}
