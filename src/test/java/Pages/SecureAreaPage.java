package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    WebDriver driver;
    By actualResult= By.id("flash");
    String ExcpectedResult="You logged into a secure area!";

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getActualResult(){
        return driver.findElement(actualResult).getText();
    }

    public String getExpectedResult(){
        return ExcpectedResult;
    }
}
