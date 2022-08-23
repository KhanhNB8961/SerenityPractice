package setups;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static common.GlobalVariables.*;
import static setups.ConfigProperties.*;

public class BaseSetup {
    @Before
    public static void initDriver(){
        initPropertyFile();
        DriverSetup.setDriver(driverType);
    }
    @After
    public void closeDriver(){
        DriverSetup.getDriver().quit();
    }
}
