package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {

    WebDriver driver;
    Alert alert;

    By jsAlert= By.xpath("//button[@onclick='jsAlert()']");
    By jsConfirm= By.xpath("//button[@onclick=\"jsConfirm()\"]");
    By jsPrompt= By.xpath("//button[@onclick=\"jsPrompt()\"]");
    By resultTestLocator=By.id("result");
    String expectedTextofJsAlert="I am a JS";
    String expectedResultOfJsAlert="You successfully clicked an alert";

    String expectedTextofJsConfirm="I am a JS Confirm";
    String expectedResultOfJsConfirm="You clicked: Cancel";

    String expectedTextofJsPrompt="I am a JS prompt";
    String expectedResultOfJsPrompt="You entered:";

    public AlertsPage(WebDriver driver){
        this.driver=driver;

    }
    public Alert switchAlert(){
        return driver.switchTo().alert();
    }

    public void clickOnJsAlert(){

        driver.findElement(jsAlert).click();
    }

    public void clickOnJsConfirm(){

        driver.findElement(jsConfirm).click();
    }
    public void clickOnJsPrompt(){

        driver.findElement(jsPrompt).click();
    }

    public void acceptAlert(){
            switchAlert().accept();
    }
    public void dismissAlert(){
         switchAlert().dismiss();
    }

    public void sendKetAlert(String text){
        switchAlert().sendKeys(text);
        switchAlert().accept();
    }

    public String getActualResult(){
        return driver.findElement(resultTestLocator).getText();
    }

    public String getActualAlertText(){

         return switchAlert().getText();
    }

    public String getExpectedResultOfJsAlert() {
        return expectedResultOfJsAlert;
    }

    public String getExpectedTextofJsAlert() {
        return expectedTextofJsAlert;
    }

    public String getExpectedTextofJsConfirm() {
        return expectedTextofJsConfirm;
    }

    public String getExpectedTextofJsPrompt() {
        return expectedTextofJsPrompt;
    }

    public String getExpectedResultOfJsConfirm() {
        return expectedResultOfJsConfirm;
    }

    public String getExpectedResultOfJsPrompt() {
        return expectedResultOfJsPrompt;
    }
}
