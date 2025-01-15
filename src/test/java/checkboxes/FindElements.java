package checkboxes;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class FindElements extends BaseSteps {
    @Test
    public void testElement() throws InterruptedException {
        driver.findElement(By.linkText("Checkboxes")).click();
       List<WebElement> checkWebElements =  driver.findElements(By.cssSelector("input[type=\"checkbox\"]"));
       int CheckNumbers =checkWebElements.size();
        System.out.println(CheckNumbers);
        Thread.sleep(3000);
        /*checkWebElements.get(0).click();
        Thread.sleep(3000);
        checkWebElements.get(1).click();
        Thread.sleep(3000);

         */
        driver.findElement(By.cssSelector("#checkboxes :nth-child(1)")).click();
        Thread.sleep(3000);
    }
}
