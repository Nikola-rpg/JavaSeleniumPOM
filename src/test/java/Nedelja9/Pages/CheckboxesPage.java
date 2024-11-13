package Nedelja9.Pages;

import Nedelja9.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage extends BaseTest {
    WebDriver driver;
    List<WebElement> checkboxes1And2;
    WebElement checkbox1;
    WebElement checkbox2;


    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getCheckboxes1And2() {
        return driver.findElements(By.cssSelector("input[type='checkbox']"));
    }

    public WebElement getCheckbox1() {
        return getCheckboxes1And2().get(0);
    }

    public WebElement getCheckbox2() {
        return getCheckboxes1And2().get(1);
    }

    //----------------------------------------

    public void clickOnCheckbox1() {
        getCheckbox1().click();
    }

    public void clickOnCheckbox2() {
        getCheckbox2().click();
    }
}
