package Tests;

import BaseTest.BaseTestClass;
import Pages.DropDownPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTestClass {

    @Test
    public void tryByValue() throws InterruptedException {
         dropDown = homePage.clickOnDropDownLink();
        Thread.sleep(2000);
        dropDown.selectByValue("1");


    }


@Test
    public void tryByText(){
       dropDown=homePage.clickOnDropDownLink();
       dropDown.selectByText("Option 1");


    }

    @Test
    public void tryByIndex() {

        dropDown=homePage.clickOnDropDownLink();
        dropDown.selectByIndex(1);

    }

@Test
    public void validateOptionIsSelected(){
        dropDown=homePage.clickOnDropDownLink();
        dropDown.selectByIndex(1);



    }



}
