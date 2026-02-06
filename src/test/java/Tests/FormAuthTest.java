package Tests;

import BaseTest.BaseTestClass;
import Pages.FormAuthPage;
import Pages.HomePage;
import Pages.SecureAreaPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormAuthTest extends BaseTestClass {




    @Test
    public void verifyFormAuthPageWithValidCredentials() {

        FormAuthPage formAuthPage = homePage.clickFormLink();
        formAuthPage.setUsername("tomsmith");
        formAuthPage.setPassword("SuperSecretPassword!");
        formAuthPage.clickLoginButton();
       Assert.assertTrue(securePage.getActualResult().contains(securePage.getExpectedResult()));

    }

    /* Assigment For s3

     1- validate wrong password
     2- validate wrong username
     3- validate wrong password and username
*/


    @Test
    public void verifyFormAuthPageWithInValidUsername(){

        FormAuthPage authPage=homePage.clickFormLink();
        authPage.setUsername("worngUsername");
        authPage.setPassword("SuperSecretPassword!");
        authPage.clickLoginButton();
        Assert.assertTrue(authPage.getAcualErrorMessage().contains(authPage.getExpectedMessage()));


    }

    @Test
    public void verifyFormAuthPageWithInValidPassword(){

        FormAuthPage authPage=homePage.clickFormLink();
        authPage.setUsername("tomsmith");
        authPage.setPassword("worngPassword");
        authPage.clickLoginButton();
        Assert.assertTrue(authPage.getAcualErrorMessage().contains(authPage.getExpectedMessage()));


    }

    @Test
    public void verifyFormAuthPageWithValidUsernameAndPassword() {

        FormAuthPage formAuthPage = homePage.clickFormLink();
        formAuthPage.setUsername("worngUserName");
        formAuthPage.setPassword("worngPassword");
        formAuthPage.clickLoginButton();
        Assert.assertTrue(securePage.getActualResult().contains(securePage.getExpectedResult()));

    }


}
