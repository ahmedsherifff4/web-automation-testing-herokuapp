package Tests;

import BaseTest.BaseTestClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveTest extends BaseTestClass {

    @Test
    public void validateAddRemoveElement() throws InterruptedException {
        addRemovePage=homePage.clickOnAddAndRemoveElements();
        addRemovePage.addElememt(6);


        Thread.sleep(2000);
        addRemovePage.removeElement(3);

    }

}
