package Nedelja10.c_Petak.Pages;

import Nedelja10.c_Petak.Base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends BaseTest {
    public ProfilePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "submit")
    public WebElement logoutButton;
}
