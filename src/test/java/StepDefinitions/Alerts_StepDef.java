package StepDefinitions;

import Pages.AlertsPage;
import Pages.HomePage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_StepDef {
    HomePage homePage= new HomePage(Hooks.driver);
    AlertsPage alertsPage;


    public static class Hooks {
      public static WebDriver driver;

      @Before
      public void setUp(){
          driver = new ChromeDriver();
          driver.manage().window().maximize();

          driver.get("https://the-internet.herokuapp.com/");

      }


        public void goToHomePage(){


        }


    @After
        public void tearDown(){


    //driver.quit();

        }
    }
}
