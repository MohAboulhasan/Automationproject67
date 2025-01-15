package seleniumcommands;

import base.BaseSteps;
import org.testng.annotations.Test;

public class Commands extends BaseSteps {
    @Test
    public void test(){
       String title = driver.getCurrentUrl();
        System.out.println(title);

    }

}
