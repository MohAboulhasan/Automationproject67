package Wait;

import base.BaseSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingPage;
import pages.OnePage;

public class DynamicLoadingTest extends BaseSteps {
    @Test
    public void testHelloWorld(){
       /*DynamicLoadingPage dynamicLoadingPage= homePage.clickOnDynamicLoadingLink();
      OnePage onePage= dynamicLoadingPage.clickOnExample1();
      onePage.clickOnStartButton();

        */

    DynamicLoadingPage dynamicLoadingPage=homePage.clickOnDynamicLoadingLink();
    OnePage onePage= dynamicLoadingPage.clickOnExample1();
    onePage.clickOnStartButton();

      String actualresult = onePage.getValidationMessage();
      String expectedresult = "Hello World!";
        Assert.assertTrue(actualresult.contains(expectedresult));

    }
}
