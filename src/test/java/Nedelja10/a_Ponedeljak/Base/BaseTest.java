package Nedelja10.a_Ponedeljak.Base;

import Nedelja10.a_Ponedeljak.Pages.HomepagePage;
import Nedelja10.a_Ponedeljak.Pages.SidebarPage;
import Nedelja10.a_Ponedeljak.Pages.TextBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public TextBoxPage textBoxPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        homepagePage = new HomepagePage(driver);
        sidebarPage = new SidebarPage(driver);
        textBoxPage = new TextBoxPage(driver);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }


}
