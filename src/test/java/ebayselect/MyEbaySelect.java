package ebayselect;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MyEbaySelect extends BaseSteps {
    Actions actions;
    @Test
    public void testHoover() throws InterruptedException {
        driver.get("https://www.ebay.com");
        actions = new Actions(driver);
        //Thread.sleep(3000);
       actions.moveToElement(driver.findElement(By.cssSelector("a[title=\"My eBay\"]"))).perform();
        //Thread.sleep(3000);
        driver.findElement(By.cssSelector("#gh-ul-nav :nth-child(1)")).click();



    }
}
