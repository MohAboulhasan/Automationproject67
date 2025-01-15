package forgotpassword;

import base.BaseSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPasswordScenario extends BaseSteps {
    @Test
    public void testForgotPassword()  {
        driver.findElement(By.linkText("Forgot Password")).click();

        WebElement emailbox =driver.findElement(By.id("email"));
        emailbox.sendKeys("abc");

        WebElement retrievebutton = driver.findElement(By.xpath("//i[contains(text(),\"Retrieve\")]"));
        retrievebutton.click();

        WebElement result = driver.findElement(By.xpath("//h1[contains(text(),\"Internal\")]"));

     String actualresult =result.getText();
     String expectedresult = "Internal Server Error";
        Assert.assertTrue(actualresult.contains(expectedresult));
    }
}
