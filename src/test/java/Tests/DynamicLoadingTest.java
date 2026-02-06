package Tests;

import BaseTest.BaseTestClass;
import Pages.DynamicLoadingPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class DynamicLoadingTest extends BaseTestClass {

    @Test
    public void verifyTheHelloWord1(){

         DynamicLoading=homePage.clickOnDynamicLoading();
         DynamicLoading.clickOnExampleOne();
         DynamicLoading.clickOnStart();


        Assert.assertTrue(DynamicLoading.getActualResult1().contains(DynamicLoading.getExcpectedResult()));
    }

    @Test
    public void verifyTheHelloWord2(){


        DynamicLoading=homePage.clickOnDynamicLoading();
        DynamicLoading.clickOnExampleTwo();
        DynamicLoading.clickOnStart();

        Assert.assertTrue(DynamicLoading.getActualResult2().contains(DynamicLoading.getExcpectedResult()));
    }

    // Assignment for s3 deadline next saturday
/*1- test dynamic loading page using explicit and implicit waits
2- use Example One Page and Example Two Page
* */
}
