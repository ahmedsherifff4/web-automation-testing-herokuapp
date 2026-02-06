package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownPage {
    WebDriver driver;
    By dropDownLocator=By.linkText("Dropdown");
    Select select ;

    public DropDownPage(WebDriver driver){
        this.driver=driver;
        WebElement dropdown=driver.findElement(By.id("dropdown"));
        select=new Select(dropdown);

    }

    public void selectByValue(String value){
        select.selectByValue(value);
    }
    public void selectByText(String text){

    select.selectByVisibleText(text);

   }

   public void selectByIndex(int index) {

        select.selectByIndex(index);

   }

   

}
