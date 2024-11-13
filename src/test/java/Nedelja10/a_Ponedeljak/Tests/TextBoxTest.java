package Nedelja10.a_Ponedeljak.Tests;

import Nedelja10.a_Ponedeljak.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void userCanSubmitWithValidMail() {
        String Name = "Pera";
        String Email = "petar@petar.com";
        String CurrentAddress = "Beograd";
        String PermanentAddress = "Novi Sad";

        homepagePage.clickOnCard("Elements");
        sidebarPage.clickOnButton("Text Box");
        Assert.assertFalse(textBoxPage.getOutput().isDisplayed());
        textBoxPage.inputName(Name);
        textBoxPage.inputEmail(Email);
        textBoxPage.inputCurrentAddress(CurrentAddress);
        textBoxPage.inputPermanentAddress(PermanentAddress);
        scrollToElement(textBoxPage.getSubmitButton());
        textBoxPage.clickOnSubmitButton();
        Assert.assertTrue(textBoxPage.getOutput().isDisplayed());

        Assert.assertEquals(textBoxPage.getOutputPodatak().get(0).getText(), "Name:" + Name);
        Assert.assertEquals(textBoxPage.getOutputPodatak().get(1).getText(), "Email:" + Email);
        Assert.assertEquals(textBoxPage.getOutputPodatak().get(2).getText(), "Current Address :" + CurrentAddress);
        Assert.assertEquals(textBoxPage.getOutputPodatak().get(3).getText(), "Permananet Address :" + PermanentAddress);
    }

    @Test
    public void userCanNotSubmitWithInvalidMail() {
        String Name = "Pera";
        String Email = "petar@petar.c";
        String CurrentAddress = "Beograd";
        String PermanentAddress = "Novi Sad";

        homepagePage.clickOnCard("Elements");
        sidebarPage.clickOnButton("Text Box");
        Assert.assertFalse(textBoxPage.getOutput().isDisplayed());
        textBoxPage.inputName(Name);
        textBoxPage.inputEmail(Email);
        textBoxPage.inputCurrentAddress(CurrentAddress);
        textBoxPage.inputPermanentAddress(PermanentAddress);
        scrollToElement(textBoxPage.getSubmitButton());
        textBoxPage.clickOnSubmitButton();
        Assert.assertTrue(textBoxPage.getErrorControl().isDisplayed());
        Assert.assertFalse(textBoxPage.getOutput().isDisplayed());
    }

    @AfterClass
    public void tearDown() {
        //driver.close();
    }
}
