package login;

import base.BaseSteps;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginScenario extends BaseSteps{


    @Test(priority = 1)
    public void validCredentialsTest(){
      LoginPage loginPage =  homePage.clickOnForumAuthenticationLink();
      loginPage.insertUsername("tomsmith");
      loginPage.insertPassword("SuperSecretPassword!");
      SecureAreaPage secureAreaPage =  loginPage.clickOnLoginButton();

        String actualresult = secureAreaPage.getValidationMessage();
        String expectedresult ="You logged into a secure area!";

        Assert.assertTrue(actualresult.contains(expectedresult));



    }
    @Test(priority = 2)
    public void invalidUsernameTest(){

       LoginPage loginPage = homePage.clickOnForumAuthenticationLink();
       loginPage.insertUsername("Ahmed");
       loginPage.insertPassword("SuperSecretPassword");
       loginPage.clickOnLoginButton();
       String actualresult = loginPage.geterrormessage();



        String expectedresult ="Your username is invalid!";

        Assert.assertTrue(actualresult.contains(expectedresult));

    }
    @Test(priority = 3)
    public void invalidPasswordTest(){

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword");
        driver.findElement(By.className("radius")).click();

        String actualresult = driver.findElement(By.id("flash")).getText();
        String expectedresult ="Your password is invalid!";

        Assert.assertTrue(actualresult.contains(expectedresult));

    }

}
