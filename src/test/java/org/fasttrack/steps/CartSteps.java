package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class CartSteps extends BaseSteps {

    @Step
    public void addAlbumWOOToCart() {
        productPage.selectAlbumWOO();
        productPage.clickAddToCartButton();
    }

    @Step
    public void addProductToCart() {
        productPage.clickAddToCartButton();
    }

    @Step
    public void viewCartWhenProductAdded() {
        cartPage.clickViewCartButton();
    }

    @Step
    public void viewCart() {
        homePage.clickCartMenuButton();
    }
    @Step
    public void clickUpdateCart() {
        cartPage.clickUpdateCart();
    }
    @Step
    public void removeFromCart() {
        cartPage.removeFromCartButton();
    }
    @Step
    public void checkSuccessMessageSpan(String productName) {
        String expected = "“" + productName + "” has been added to your cart.";
        String actual = cartPage.getSuccessMessageSpan();
        Assert.assertEquals(expected, actual);
    }
    @Step
    public void proceedToCheckOut() {
        cartPage.clickProceedToCheckOutButton();
    }


}
