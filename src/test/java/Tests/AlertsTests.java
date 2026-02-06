package Tests;

import BaseTest.BaseTestClass;
import Pages.AlertsPage;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class AlertsTests extends BaseTestClass {

    @Test
    public void validateAlidPage () throws InterruptedException {
        AlertsPage =homePage.clickOnAlert();

        AlertsPage.clickOnJsAlert();
     //   Assert.assertEquals(AlertsPage.getActualAlertText(),AlertsPage.getExpectedTextofJsAlert());
        AlertsPage.acceptAlert();
        Assert.assertTrue(AlertsPage.getActualResult().contains(AlertsPage.getExpectedResultOfJsAlert()));

       Thread.sleep(3000);
        AlertsPage.clickOnJsConfirm();
       Assert.assertEquals(AlertsPage.getActualAlertText(),AlertsPage.getExpectedTextofJsConfirm());
        AlertsPage.dismissAlert();
        Assert.assertTrue(AlertsPage.getActualResult().contains(AlertsPage.getExpectedResultOfJsConfirm()));

       Thread.sleep(3000);
        AlertsPage.clickOnJsPrompt();
         Assert.assertEquals(AlertsPage.getActualAlertText(),AlertsPage.getExpectedTextofJsPrompt());
        AlertsPage.sendKetAlert("Hello");

        Assert.assertTrue(AlertsPage.getActualResult().contains(AlertsPage.getExpectedResultOfJsPrompt()));

    }
}
