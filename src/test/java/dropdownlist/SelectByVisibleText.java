package dropdownlist;

import base.BaseSteps;
import org.testng.annotations.Test;
import pages.DropDownPage;

public class SelectByVisibleText extends BaseSteps {
    @Test
    public void testSelectVisibleText() throws InterruptedException {
       DropDownPage dropDownPage = homePage.clickOnDropDownLink();
       //Thread.sleep(3000);
       dropDownPage.selectFromDropDownListVisibleText("Option 1");
       Thread.sleep(3000);
    }
}
