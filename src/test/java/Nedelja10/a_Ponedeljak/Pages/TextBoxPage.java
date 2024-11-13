package Nedelja10.a_Ponedeljak.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TextBoxPage {
    WebDriver driver;
    WebElement nameField;
    WebElement emailField;
    WebElement currentAddressField;
    WebElement permanentAddressField;
    WebElement submitButton;
    WebElement output;
    WebElement outputPodatak;
    WebElement errorControl;

    public TextBoxPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getNameField() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getEmailField() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getCurrentAddressField() {
        return driver.findElement(By.id("currentAddress"));
    }

    public WebElement getPermanentAddressField() {
        return driver.findElement(By.id("permanentAddress"));
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getOutput() {
        return driver.findElement(By.id("output"));
    }

    public List<WebElement> getOutputPodatak() {
        return driver.findElements(By.className("mb-1"));
    }

    public WebElement getErrorControl() {
        return driver.findElement(By.cssSelector(".mr-sm-2.field-error.form-control"));
    }

    //---------------------------------------

    public void inputName(String Name) {
        getNameField().clear();
        getNameField().sendKeys(Name);
    }

    public void inputEmail(String Email) {
        getEmailField().clear();
        getEmailField().sendKeys(Email);
    }

    public void inputCurrentAddress(String CurrentAddress) {
        getCurrentAddressField().clear();
        getCurrentAddressField().sendKeys(CurrentAddress);
    }

    public void inputPermanentAddress(String PermanentAddress) {
        getPermanentAddressField().clear();
        getPermanentAddressField().sendKeys(PermanentAddress);
    }

    public void clickOnSubmitButton() {
        getSubmitButton().click();
    }
}
