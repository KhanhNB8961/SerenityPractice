package common;

import static setups.ConfigProperties.*;

public class GlobalVariables {
    public static final String driverType = property.getProperty("webDriver");
    public static final String baseUrl = property.getProperty("url");
}
