package Nedelja10.c_Petak.Pages;

import Nedelja10.c_Petak.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomepagePage extends BaseTest {
    public HomepagePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "card-body")
    public List<WebElement> chooseButton;

    //-----------------------

    public void clickOnCard(String cardName) {
        for (int i = 0; i < chooseButton.size(); i++) {

            if (chooseButton.get(i).getText().equals(cardName)) {
                scrollToElement(chooseButton.get(i));
                chooseButton.get(i).click();
                break;
            }
        }
    }
}
