package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {
    WebDriver driver;
    By ExampleOneLocator=By.linkText("Example 1: Element on page that is hidden");
    By ExampleTwoLocator=By.linkText("Example 2: Element rendered after the fact");
    By startLocator=By.xpath( "//button[text()='Start']");
    String excpectedResult="Hello World!";
    protected WebDriverWait wait;


    By helloWorldText=By.xpath("//div[@id='finish']/h4");

    public DynamicLoadingPage (WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }


public void clickOnExampleOne(){


       driver.findElement(ExampleOneLocator).click();


}

    public void clickOnExampleTwo(){

        driver.findElement(ExampleTwoLocator).click();


    }

    public void clickOnStart(){

        driver.findElement(startLocator).click();


    }

public String getActualResult1(){
    // Example 1 not appears in UI

   return wait.until(ExpectedConditions.visibilityOfElementLocated(helloWorldText)).getText();

    //return wait.until(ExpectedConditions.visibilityOf(driver.findElement(helloWorldText))).getText();

}

    public String getActualResult2(){
        // Example 2 not appears in DOM and UI

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        return driver.findElement(helloWorldText).getText();
        // return wait.until(ExpectedConditions.presenceOfElementLocated(helloWorldText)).getText();
    }

    public String getExcpectedResult() {
        return excpectedResult;
    }
}
