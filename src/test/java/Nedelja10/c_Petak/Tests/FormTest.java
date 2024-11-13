package Nedelja10.c_Petak.Tests;

import Nedelja10.c_Petak.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest extends BaseTest {
    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
    }

    @Test
    public void userCanLogIn() throws InterruptedException {
        homepagePage.clickOnCard("Forms");
        formsPage.clickOnCard("Practice Form");

        practiceFormPage.inputFirstName("Petar");
        practiceFormPage.inputLastName("Petrovic");
        practiceFormPage.inputMail("petar@gmail.com");
        practiceFormPage.clickOnMaleOption();
        practiceFormPage.inputNumber("0641234567");
        practiceFormPage.selectDateOfBirth("1985", "8", "15");
        practiceFormPage.inputSubject("Computer Science");
        practiceFormPage.selectSport();
        //practiceFormPage.inputPicture("C:\\Users\\Nikola\\Desktop\\picture2.png");
        practiceFormPage.inputAddress("98 Main St");
        practiceFormPage.inputStateNCR();
        practiceFormPage.inputCityDelhi();
        practiceFormPage.clickOnSubmitButton();

        Assert.assertEquals(practiceFormPage.cells.get(1).getText(), "Petar" + " " + "Petrovic");
        Assert.assertEquals(practiceFormPage.cells.get(3).getText(), "petar@gmail.com");
        Assert.assertEquals(practiceFormPage.cells.get(5).getText(), "Male");
        Assert.assertEquals(practiceFormPage.cells.get(7).getText(), "0641234567");
        Assert.assertEquals(practiceFormPage.cells.get(9).getText(), "15" + " " + "November" + "," + "1985");
        Assert.assertEquals(practiceFormPage.cells.get(11).getText(), "Computer Science");
        Assert.assertEquals(practiceFormPage.cells.get(13).getText(), "Sports");
        Assert.assertEquals(practiceFormPage.cells.get(17).getText(), "98 Main St");
        Assert.assertEquals(practiceFormPage.cells.get(19).getText(), "NCR" + " " + "Delhi");
    }
}
