package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;

public class ProductSteps extends BaseSteps{

    @Step
    public void clickViewAllLogoCollection(){
        productPage.clickviewAllLogoCollection();
    }
    @Step
    public void addProductsQty(int Qty){
        productPage.getQtyFieldProducts(Qty);
    }
    @Step
    public void clickQtyOnLogoProductTShirt(int Qty){
        productPage.clickQtyLogoProductTShirt(Qty);
    }
    @Step
    public void clickQtyOnLogoProductBeanie(int Qty){
        productPage.clickQtyLogoProductBeanie(Qty);
    }
    @Step
    public void selectLogoProductsAndAddQtyAndAddToCart(int Qty){
        productPage.getQtyFieldProducts(Qty);
        productPage.clickQtyLogoProductTShirt(Qty);
        productPage.clickQtyLogoProductBeanie(Qty);
    }
}
