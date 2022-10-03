package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class AccountSteps extends BaseSteps{
    @Step
    public void clickDashboardButton(){
        accountPage.clickDashboardButton();
    }
    @Step
    public void clickOrdersButton(){
       accountPage.clickOrdersButton();
    }
    @Step
    public void clickDownloadsButton(){
        accountPage.clickDownloadsButton();
    }
    @Step
    public void clickEditAddressesButton(){
        accountPage.clickEditAddressesButton();
    }
    @Step
    public void clickEditAccountDetailsButton(){
        accountPage.clickEditAccountDetailsButton();
    }
    @Step
    public void clickLogoutButton(){
        accountPage.clickLogoutButton();
    }
    @Step
    public void clickViewOrderButton(){
        accountPage.clickViewOrder();
    }
    @Step
    public void clickMyAccountMenuButton(){
        homePage.clickMyAccountMenuButton();
    }
    @Step
    public void getViewOrderMessage(){
        Assert.assertEquals("Order details", accountPage.getOrderMessage());
    }
}
