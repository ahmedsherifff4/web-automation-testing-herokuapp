package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver=driver;


    }

    By formLinkLocator = By.linkText("Form Authentication");
    //By chechBoxLocator = By.linkText("Form Authentication");
    By checkBoxLocator=By.linkText("Checkboxes");
    By dropDownLocator=By.linkText("Dropdown");
    By DynamicLoadingLocator=By.linkText("Dynamic Loading");
    By alertLocator=By.linkText("JavaScript Alerts");

    public void clickOnForm(){

        driver.findElement(formLinkLocator).click();


    }




    public FormAuthPage clickFormLink() {
        driver.findElement(formLinkLocator).click();
        return new FormAuthPage(driver);
    }

    public CheckBoxPage clickCheckBoxPage() {
        driver.findElement(checkBoxLocator).click();
        return new CheckBoxPage(driver);
    }

    public CheckBoxPage clickCheckBoxLink(){
        driver.findElement(checkBoxLocator).click();
        return new CheckBoxPage(driver);


    }
    public DropDownPage clickOnDropDownLink(){

        driver.findElement(dropDownLocator).click();
        return new DropDownPage(driver);

    }

    public DynamicLoadingPage clickOnDynamicLoading(){
        driver.findElement(DynamicLoadingLocator).click();
        return new DynamicLoadingPage(driver);


    }

    public AddRemovePage clickOnAddAndRemoveElements(){

        driver.findElement(By.linkText("Add/Remove Elements")).click();
        return new AddRemovePage(driver);

    }

    public AlertsPage clickOnAlert(){
   driver.findElement(alertLocator).click();
        return new AlertsPage(driver);
    }

}
