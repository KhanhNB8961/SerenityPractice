package common;

import static setups.ConfigProperties.property;

public class VerifyCartParameter {
    public static final String SEARCH_KEY = property.getProperty("keyword");
    public static final String ITEM_NAME = property.getProperty("productName");
    public static final String QTY = property.getProperty("quantity");
}
