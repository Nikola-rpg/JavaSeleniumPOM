package Nedelja9.Base;

import Nedelja9.Pages.AddRemoveElementsPage;
import Nedelja9.Pages.CheckboxesPage;
import Nedelja9.Pages.HomepagePage;
import Nedelja9.Pages.NotificationMessagesPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {
    public WebDriver driver;
    public HomepagePage homepagePage;
    public AddRemoveElementsPage addRemoveElementsPage;
    public CheckboxesPage checkboxesPage;
    public NotificationMessagesPage notificationMessagesPage;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        homepagePage = new HomepagePage(driver);
        addRemoveElementsPage = new AddRemoveElementsPage(driver);
        checkboxesPage = new CheckboxesPage(driver);
        notificationMessagesPage = new NotificationMessagesPage(driver);
    }
}
