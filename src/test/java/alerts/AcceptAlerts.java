package alerts;

import base.BaseSteps;
import org.testng.annotations.Test;
import pages.JSAlertsPage;

public class AcceptAlerts extends BaseSteps {
    @Test
    public void testAcceptAlert() throws InterruptedException {
       JSAlertsPage jsAlertsPage= homePage.clickOnJSAlertsLink();
       jsAlertsPage.clickOnJSAlertButton();
       //Thread.sleep(3000);
       jsAlertsPage.acceptAlert();
        //Thread.sleep(3000);

    }
}
