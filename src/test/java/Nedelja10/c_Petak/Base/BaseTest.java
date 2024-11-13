package Nedelja10.c_Petak.Base;

import Nedelja10.c_Petak.Pages.HomepagePage;
import Nedelja10.c_Petak.Pages.BookStorePage;
import Nedelja10.c_Petak.Pages.LoginPage;
import Nedelja10.c_Petak.Pages.ProfilePage;
import Nedelja10.c_Petak.Pages.FormsPage;
import Nedelja10.c_Petak.Pages.PracticeFormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public static WebDriver driver;
    public HomepagePage homepagePage;
    public BookStorePage bookStorePage;
    public LoginPage loginPage;
    public ProfilePage profilePage;
    public FormsPage formsPage;
    public PracticeFormPage practiceFormPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        homepagePage = new HomepagePage();
        bookStorePage = new BookStorePage();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
        formsPage = new FormsPage();
        practiceFormPage = new PracticeFormPage();

    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }
}
