package org.fasttrack.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class RegisterSteps extends BaseSteps{

    @Step
    public void setRegEmailAddress(String RegEmail) {
        registerPage.setRegEmailField(RegEmail);
    }
    @Step
    public void setPassword(String password) {
        registerPage.setPasswordField(password);
    }
    @Step
    public void clickRegister() {
        registerPage.clickRegisterButton();
    }
    @Step
    public void verifyErrorMessageForRegister(){
    Assert.assertEquals("Error: An account is already registered with your email address. Please log in.", registerPage.getErrorMessageForAlReadyRegistered());
}
    @Step
    public void verifyErrorMessageForRegisterWithNoMail(){
        Assert.assertEquals("Error: Please provide a valid email address.", registerPage.getErrorMessageForAlReadyRegistered());
    }
    @Step
    public void verifyErrorMessageForRegisterWithNoPass(){
        Assert.assertEquals("Error: Please enter an account password.", registerPage.getErrorMessageForAlReadyRegistered());
    }
    @Step
    public void verifyErrorMessageForRegisterWithNoCredentials(){
        Assert.assertEquals("Error: Please provide a valid email address.", registerPage.getErrorMessageForAlReadyRegistered());
    }
    @Step
    public void verifyErrorMessageForRegisterWeakPass(){
        Assert.assertEquals("Weak - Please enter a stronger password.", registerPage.getErrorMessageForAlReadyRegisteredWeakPass());
    }
    @Step
    public void verifyErrorMessageForRegisterWeakPassHint(){
        Assert.assertEquals("Hint: The password should be at least twelve characters long. To make it stronger, use upper and lower case letters, numbers, and symbols like ! \" ? $ % ^ & ).", registerPage.getErrorMessageForAlReadyRegisteredWeakPassHint());
    }

}
