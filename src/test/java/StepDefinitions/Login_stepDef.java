package StepDefinitions;

import Pages.FormAuthPage;
import Pages.HomePage;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static StepDefinitions.Alerts_StepDef.Hooks.driver;

public class Login_stepDef {
HomePage homePage=new HomePage(driver);
FormAuthPage formAuthPage;
SecureAreaPage secureAreaPage;

    @Given("user is on Login Page")
    public void userIsOnLoginPage(){
       formAuthPage =homePage.clickFormLink();
        Assert.assertEquals(driver.getCurrentUrl(),"SuperSecretPassword!");


    }

   

    @When("user enter valid credentials")
    public void userEnterValidCredentials() {
        // Write code here that turns the phrase above into concrete actions
     //   throw new PendingException();
        formAuthPage.setUsername("tom smith");
        formAuthPage.setPassword("SuperSecretPassword!");
    }

    @And("click on login button")
    public void clickOnLoginButton() {
        // Write code here that turns the phrase above into concrete actions
       // throw new PendingException();
       // secureAreaPage =formAuthPage.clickLoginButton();
    }

    @Then("user should be redirected to secure are page")
    public void userShouldBeRedirectedToSecureArePage() {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    Assert.assertTrue(secureAreaPage.getActualResult().contains(secureAreaPage.getExpectedResult()));
    }

    @When("user enter {string} and {string}")
    public void userEnterAnd(String username, String password) {

        formAuthPage.setUsername(username);
        formAuthPage.setPassword(password);

    }

    @Then("Validate Message According To {string}")
    public void validateMessageAccordingTo(String Validation) {
        if (Validation.trim().equals("valid")){
            Assert.assertTrue(secureAreaPage.getActualResult().contains(secureAreaPage.getExpectedResult()));
        }
    else if(Validation.trim().equals("invalid")){
            Assert.assertTrue(formAuthPage.getAcualErrorMessage().contains(formAuthPage.getExpectedMessage()));
    }
    else if(Validation.trim().equals("invalidtheboth")){
            Assert.assertTrue(formAuthPage.getAcualErrorMessage().contains(formAuthPage.getExpectedMessage()));

        }
  }
}
