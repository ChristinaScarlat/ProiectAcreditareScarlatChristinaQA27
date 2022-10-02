package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class CartTest extends BaseTest{

    @Test
    public void loginAndAddToCartTest(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("Cap");
        cartSteps.addProductToCart();
        cartSteps.checkSuccessMessageSpan("Cap");
    }
    @Test
    public void addProductToCart(){
        cartSteps.addAlbumWOOToCart();
        cartSteps.checkSuccessMessageSpan("Album");
    }
    @Test
    public void loginAndRemoveProductFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("Cap");
        cartSteps.addProductToCart();
        cartSteps.viewCartWhenProductAdded();
        cartSteps.removeFromCart();
    }
    @Test
    public void removeProductFromCart(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        cartSteps.viewCart();
        cartSteps.removeFromCart();
    }
    @Test
    public void addQtyCartProductAndUpdate(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        cartSteps.viewCart();
        productSteps.addProductsQty(3);
        cartSteps.clickUpdateCart();
    }
    @Test
    public void addQtyOnLogoProductsAndAddToCart(){
        searchSteps.searchForKeyword("logo");
        productSteps.clickViewAllLogoCollection();
        productSteps.selectLogoProductsAndAddQtyAndAddToCart(1);
        cartSteps.addProductToCart();
    }
    @Test
    public void addDifferentQtyOnLogoProductsAndAddToCart(){
        searchSteps.searchForKeyword("logo");
        productSteps.clickViewAllLogoCollection();
        productSteps.addProductsQty(1);
        productSteps.clickQtyOnLogoProductTShirt(2);
        productSteps.clickQtyOnLogoProductBeanie(1);
        cartSteps.addProductToCart();
    }


}
