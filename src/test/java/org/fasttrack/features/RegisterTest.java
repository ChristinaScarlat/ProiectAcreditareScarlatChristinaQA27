package org.fasttrack.features;

import org.fasttrack.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void registerWithValidCredentialsTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setRegEmailAddress(Constants.USER_EMAIl);
        registerSteps.setPassword(Constants.USER_PASS);
        registerSteps.clickRegister();
        registerSteps.verifyErrorMessageForRegister();
    }
    @Test
    public void registerWithNoEmailTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setRegEmailAddress("");
        registerSteps.setPassword("Parola12345!!");
        registerSteps.clickRegister();
        registerSteps.verifyErrorMessageForRegisterWithNoMail();
    }
    @Test
    public void registerWithNoPasswordTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setRegEmailAddress("christinas@test.reg");
        registerSteps.setPassword("");
        registerSteps.clickRegister();
        registerSteps.verifyErrorMessageForRegisterWithNoPass();
    }
    @Test
    public void registerWithNoCredentialsTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setRegEmailAddress("");
        registerSteps.setPassword("");
        registerSteps.clickRegister();
        registerSteps.verifyErrorMessageForRegisterWithNoCredentials();
    }
    @Test
    public void registerWithInvalidCredentialsTest(){
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLoginPage();
        registerSteps.setRegEmailAddress("123@456.ro");
        registerSteps.setPassword("Pass12345!");
        registerSteps.verifyErrorMessageForRegisterWeakPass();
        registerSteps.verifyErrorMessageForRegisterWeakPassHint();
    }
}
