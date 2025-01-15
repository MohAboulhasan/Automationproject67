package addremove;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddRemovePage;

public class DeleteButtonScenario extends BaseSteps {
    @Test
    public void testDeleteButton() throws InterruptedException {
        /*driver.findElement(By.xpath("//a[contains(text(),\"Add/Remove\")]")).click();
        driver.findElement(By.xpath("//button[@onclick =\"addElement()\"]")).click();

        WebElement deletebutton = driver.findElement(By.xpath("//button[@onclick =\"deleteElement()\"]"));
        Assert.assertTrue(deletebutton.isDisplayed());

         */
        AddRemovePage addRemovePage=homePage.clickOnAddDeletebuttonLink();
        Thread.sleep(5000);
        addRemovePage.clickOnAddElementButton();
        Assert.assertTrue(addRemovePage.checkDeleteElementButton());

    }
}
