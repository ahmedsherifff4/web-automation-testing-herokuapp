package BaseTest;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static java.lang.Thread.sleep;

public class BaseTestClass {
    protected WebDriver driver;
    protected SecureAreaPage securePage;
    protected HomePage homePage ;
    protected CheckBoxPage checkBox;
   public DropDownPage dropDown;
   protected DynamicLoadingPage DynamicLoading;
   protected AddRemovePage addRemovePage;
   protected WebDriverWait wait;
   protected AlertsPage AlertsPage;
   /* HomePage homePage = new HomePage();
    FormAuthPage formAuthPage = new FormAuthPage();*/


    @BeforeClass
    public void setup(){
    driver = new ChromeDriver();
    driver.manage().window().maximize();

    securePage= new SecureAreaPage(driver);
    homePage= new HomePage(driver);

    }

    @BeforeMethod
public void goToHomePage(){

    driver.get("https://the-internet.herokuapp.com/");

}


@AfterClass
    public void tearDown(){


driver.quit();

}



}
