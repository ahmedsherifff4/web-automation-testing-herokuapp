package Tests;

import BaseTest.BaseTestClass;
import Pages.CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTestClass{

    @Test //1- write a test to verify that checkbox one is selected
    public void verifyCheckboxOneIsSelected() throws InterruptedException {

       checkBox=homePage.clickCheckBoxPage();

        Assert.assertFalse(checkBox.checkOneIsSelected()); //false
        Thread.sleep(2000);
        checkBox.clickOnBox1();

       Assert.assertTrue(checkBox.checkOneIsSelected()); // True

       Assert.assertEquals(checkBox.checkOneIsSelected(),checkBox.checkTwoIsSelected());
    }

    @Test //2- write a test to verify that checkbox two is selected
    public void verifyCheckboxTwoIsSelected() throws InterruptedException {
        checkBox=homePage.clickCheckBoxPage();
        Thread.sleep(2000);
        Assert.assertTrue(checkBox.checkTwoIsSelected());


    }

    // second assignment for s3 deadline next friday
    /*
      1- write a test to verify that checkbox one is selected
      2- write a test to verify that checkbox two is selected
      According to POM pattern
      */

}
