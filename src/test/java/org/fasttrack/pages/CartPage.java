package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class CartPage extends BasePage {

    @FindBy(css = ".woocommerce-message")
    private WebElementFacade successMessageSpan;
    @FindBy(css = "a.button.wc-forward")
    private WebElementFacade viewCartButton;
    @FindBy(css = " td.actions button.button")
    private WebElementFacade updateCartButton;
    @FindBy(css="a.remove")
    private WebElementFacade removeProductFromCartButton;
    @FindBy(css = "a.checkout-button.button.alt.wc-forward")
    private WebElementFacade proceedToCheckOutButton;
    @FindBy(css = "tr.woocommerce-cart-form__cart-item.cart_item td.product-remove a.remove")
    private List<WebElementFacade> deleteButtonsCartProducts;





    public String getSuccessMessageSpan() {
        return successMessageSpan.getText().replace("View cart\n","");
    }
    public void clickViewCartButton() {
        clickOn(viewCartButton);
    }

    public void removeFromCartButton() {
        clickOn(removeProductFromCartButton);
    }
    public void clickUpdateCart(){
        clickOn(updateCartButton);
    }
    public void clickProceedToCheckOutButton() {
        clickOn(proceedToCheckOutButton);
    }


}
