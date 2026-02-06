package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AddRemovePage {
    WebDriver driver;
    By addButton=By.xpath("//div[@class='example']/button");
    By removeButton=By.xpath("(//div[@class='example']//button)[2]");


    public AddRemovePage(WebDriver driver){
    this.driver=driver;

    }

    public void addElememt(int count) {
     for(int i=0; i<count ;i++){
    // List<WebElement> addButtons=driver.findElements(addButton);
    driver.findElement(addButton).click();
        }

    }

public void removeElement(int count){
    //   List<WebElement> deleteButtons = driver.findElements(removeButton);
    for (int i = 0 ; i < count ; i++){
        List<WebElement> deleteButtons = driver.findElements(removeButton);

        deleteButtons.get(0).click();
    }
      }

}
