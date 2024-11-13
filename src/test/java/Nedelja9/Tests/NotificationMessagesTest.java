package Nedelja9.Tests;

import Nedelja9.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NotificationMessagesTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://the-internet.herokuapp.com/");
    }

    @Test
    public void userGetNotificationWhenClickOnLink() throws InterruptedException {
        homepagePage.clickOnNotificationMessages();
        Assert.assertTrue(notificationMessagesPage.getNotification().isDisplayed());
        notificationMessagesPage.clickOnClickHereLink();

        for (int i = 1; i < 6; i++) {
            notificationMessagesPage.clickOnClickHereLink();
            String tekstNotifikacije = notificationMessagesPage.getNotification().getText();
            if (tekstNotifikacije.contains("please try again")) {
                System.out.println(i + ". poruka je: " + tekstNotifikacije);
                Assert.assertTrue(tekstNotifikacije.contains("please try again"));
            } else {
                System.out.println(i + " poruka je: " + tekstNotifikacije);
                Assert.assertTrue(tekstNotifikacije.contains("Action successful"));
            }
        }
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
