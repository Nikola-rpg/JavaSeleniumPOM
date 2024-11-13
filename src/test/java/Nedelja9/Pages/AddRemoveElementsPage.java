package Nedelja9.Pages;

import Nedelja9.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemoveElementsPage extends BaseTest {
    WebDriver driver;
    WebElement addRemoveElementTitle;
    WebElement addElementButton;
    WebElement deleteButton;


    public AddRemoveElementsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getAddRemoveElementTitle() {
        return driver.findElement(By.id("content"));
    }

    public WebElement getAddElementButton() {
        return driver.findElement(By.cssSelector("button[onclick='addElement()']"));
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.className("added-manually"));
    }

    //------------------------------------------------------

    public void clickOnAddElementButton() {
        getAddElementButton().click();
    }

    public void clickOnDeleteButton() {
        getDeleteButton().click();
    }
}
