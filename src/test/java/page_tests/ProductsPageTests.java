package page_tests;

import generic_keywords.WebElementsInteractions;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import page_objects.LoginPageObject;
import page_objects.ProductsPageObject;

public class ProductsPageTests extends BaseTest {
    LoginPageObject loginPageObject;
    ProductsPageObject productsPageObject;
    private static final Logger logger = LogManager.getLogger(ProductsPageTests.class);


    @Test
    public void testItemName() {
        String username = "standard_user";
        String password = "secret_sauce";
        loginPageObject = new LoginPageObject(driver);
        productsPageObject = loginPageObject.userLogin(username, password);
        logger.info("Username is: " + username + "/n Password is: " + password);

        System.out.println(productsPageObject.getTitleOfProductPage());

        System.out.println(productsPageObject.getItemName());

    }

}
