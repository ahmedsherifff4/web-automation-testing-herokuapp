package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthPage {

WebDriver driver;



    By usernameTextboxLocator = By.id("username");
    By passwordTextboxLocator = By.id("password");
    By loginButtonLocator = By.className("radius");

//String actualErrorText=driver.findElement(By.id("flash")).getText();
    By actualErrorTextLocator = By.id("flash");
    String excpectedUserName="Your username is invalid!";
    String excpectedPassword="Your password is invalid!";
    By excpectedActualResult=By.id("flash");//---------------------------------------

    String expectedMessage="Your username is invalid!";


    public FormAuthPage(WebDriver driver) {

        this.driver=driver;
    }

    public void setUsername(String userName){

        driver.findElement(usernameTextboxLocator).clear();
        driver.findElement(usernameTextboxLocator).sendKeys(userName);

    }



public void setPassword(String password){

    driver.findElement(passwordTextboxLocator).clear();
    driver.findElement(passwordTextboxLocator).sendKeys(password);

}

public void clickLoginButton(){

    driver.findElement(loginButtonLocator).click();


}

public String getAcualErrorMessage(){

    return driver.findElement(excpectedActualResult).getText();

}

    public String getExpectedUsernameError(){
        return excpectedUserName;
    }

    public String getExpectedPasswordError(){
        return excpectedPassword;
    }

public String getExcpectedActualResult(){

       return driver.findElement(excpectedActualResult).getText();

}

    public String getExpectedMessage() { //
        return expectedMessage;
    }
}
