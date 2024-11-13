package Nedelja10.c_Petak.Pages;

import Nedelja10.c_Petak.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PracticeFormPage extends BaseTest {
    public PracticeFormPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "firstName")
    public WebElement firstName;

    @FindBy(id = "lastName")
    public WebElement lastName;

    @FindBy(id = "userEmail")
    public WebElement userMail;

    @FindBy(css = "label[for='gender-radio-1']")
    public WebElement maleIzbor;

    @FindBy(id = "userNumber")
    public WebElement userNumber;

    @FindBy(id = "subjectsInput")
    public WebElement subjectField;

    @FindBy(css = "label[for='hobbies-checkbox-1']")
    public WebElement sportOption;

    @FindBy(css = "label[for='hobbies-checkbox-2']")
    public WebElement readingOption;

    @FindBy(css = "label[for='hobbies-checkbox-3']")
    public WebElement musicOption;

    @FindBy(id = "uploadPicture")
    public WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    public WebElement currentAddress;

    @FindBy(css = ".col-md-4.col-sm-12")
    public WebElement izborDrzave;

    @FindBy(xpath = "//div[contains(text(),'NCR')]")
    public WebElement drzavaNCR;

    @FindBy(id = "city")
    public WebElement izborGrada;

    @FindBy(xpath = "//div[text()='Delhi']")
    public WebElement gradDelhi;

    @FindBy(id = "dateOfBirthInput")
    public WebElement datumRodjenja;

    @FindBy(className = "react-datepicker__year-select")
    public WebElement yearDropDownMenu;

    @FindBy(className = "react-datepicker__month-select")
    public WebElement monthDropDownMenu;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(css = "td")
    public List<WebElement> cells;

    //--------------------------

    public void inputFirstName(String name) {
        firstName.clear();
        firstName.sendKeys(name);
    }

    public void inputLastName(String lastname) {
        lastName.clear();
        lastName.sendKeys(lastname);
    }

    public void inputMail(String mail) {
        userMail.clear();
        userMail.sendKeys(mail);
    }

    public void inputNumber(String number) {
        userNumber.clear();
        userNumber.sendKeys(number);
    }

    public void inputSubject(String subject) {
        subjectField.clear();
        subjectField.sendKeys(subject);
        subjectField.sendKeys("\n");
    }

    public void clickOnMaleOption() {
        scrollToElement(maleIzbor);
        maleIzbor.click();
    }

    public void inputPicture(String imageLocation) {
        uploadPicture.sendKeys(imageLocation);
    }

    public void selectSport() {
        scrollToElement(sportOption);
        sportOption.click();
    }

    public void selectReading() {
        scrollToElement(readingOption);
        readingOption.click();
    }

    public void selectMusic() {
        scrollToElement(musicOption);
        musicOption.click();
    }

    public void inputAddress(String address) {
        currentAddress.clear();
        currentAddress.sendKeys(address);
    }

    public void inputStateNCR() {
        scrollToElement(izborDrzave);
        izborDrzave.click();
        drzavaNCR.click();
    }

    public void inputCityDelhi() {
        scrollToElement(izborGrada);
        izborGrada.click();
        gradDelhi.click();
    }

    public void selectDateOfBirth(String year, String month, String Day) {
        datumRodjenja.click();
        yearDropDownMenu.sendKeys(year);
        monthDropDownMenu.sendKeys(month);
        WebElement day = driver.findElement(By.xpath("//div[contains(@class, 'react-datepicker__day') and text()='" + Day + "']"));
        scrollToElement(day);
        day.click();
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }
}
