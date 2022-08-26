package common;

import static setups.ConfigProperties.*;

public class VerifyInformationParameter {
    public static final String KEYWORD = property.getProperty("keyword");
    public static final String PRODUCT_NAME = property.getProperty("productName");
    public static final String QUANTITY = property.getProperty("quantity");
    public static final String EMAIL = property.getProperty("email");
    public static final String FIRST_NAME = property.getProperty("firstName");
    public static final String LAST_NAME = property.getProperty("lastName");
    public static final String ADDRESS = property.getProperty("address");
    public static final String APARTMENT = property.getProperty("apartment");
    public static final String POSTAL_CODE = property.getProperty("postalCode");
    public static final String COUNTRY = property.getProperty("country");
    public static final String PHONE_NUMBER = property.getProperty("phoneNumber");
}
