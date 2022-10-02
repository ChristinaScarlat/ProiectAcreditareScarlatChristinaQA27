package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;


public class SearchTest extends BaseTest {
    @Test
    public void loginAndSearchForProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.navigateToProductName("beanie");
    }

    @Test
    public void loginAndSearchForSecondProductNameTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("shirt");
    }
    @Test
    public void loginAndSearchForProductLogoAndAddToCart(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("logo");
        productSteps.clickViewAllLogoCollection();
        productSteps.addProductsQty(2);
        cartSteps.addProductToCart();
    }
    @Test
    public void searchForProductSetQtyAndAddToCart(){
        searchSteps.searchForKeyword("belt");
        productSteps.addProductsQty(2);
        cartSteps.addProductToCart();
    }
    @Test
    public void searchForInvalidProduct() {
        searchSteps.searchForKeyword("@Cap");
        searchSteps.findProductWithInvalidName();
    }
}
