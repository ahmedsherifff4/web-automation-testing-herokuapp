package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckBoxPage {

    WebDriver driver;

    By checkBoxLocator1= By.xpath("//input[@type='checkbox'][1]");
    By checkBoxLocator2= By.xpath("//input[@type='checkbox'][2]");


    public CheckBoxPage(WebDriver driver){

     this.driver=driver;
    }


    public void clickOnBox1(){
        driver.findElement(checkBoxLocator1).click();

    }

    public void clickOnBox2(){
        driver.findElement(checkBoxLocator2).click();

    }

    public boolean checkOneIsSelected(){

      return   driver.findElement(checkBoxLocator1).isSelected();


    }

    public boolean checkTwoIsSelected(){


      return   driver.findElement(checkBoxLocator2).isSelected();
    }


}
