package org.fasttrack.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import org.fasttrack.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class LoginTest extends BaseTest {

    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToHomepage();
        loginSteps.verifyHomePageMessage();
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword(Constants.USER_PASS);
        loginSteps.selectRemembermeBox();
        loginSteps.clickLogin();
        loginSteps.verifyUserIsLoggedIn("alexandra.christina");
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword("123456a");
        loginSteps.clickLogin();
        loginSteps.verifyUserLoggedInWithWrongPassword();
    }
    @Test
    public void loginWithInvalidPasswordAndLostPasswordTest() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        loginSteps.setUserEmail(Constants.USER_EMAIl);
        loginSteps.setPassword("123456a");
        loginSteps.clickLogin();
        loginSteps.verifyUserLoggedInWithWrongPassword();
        loginSteps.clickLostPassword();
        loginSteps.verifyMessageforLostPassword();
        loginSteps.completeUserOrEmailFieldToResetPassword(Constants.USER_EMAIl);
        loginSteps.clickResetPasswordButton();
        loginSteps.VerifyMessageForResetPassword();
    }
    @Test
    public void loginCheckOrderAndLogout(){
        loginSteps.doLogin(Constants.USER_EMAIl,Constants.USER_PASS);
        searchSteps.searchForKeyword("belt");
        productSteps.addProductsQty(2);
        cartSteps.addProductToCart();
        cartSteps.viewCart();
        cartSteps.proceedToCheckOut();
        checkoutSteps.clickPlaceOrder();
        accountSteps.clickMyAccountMenuButton();
        accountSteps.clickOrdersButton();
        accountSteps.clickViewOrderButton();
        accountSteps.getViewOrderMessage();
        accountSteps.clickLogoutButton();
    }


}
