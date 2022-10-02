package org.fasttrack.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends BasePage{

    @FindBy(id = "reg_email")
    private WebElementFacade regEmailAddressField;
    @FindBy(id = "reg_password")
    private WebElementFacade regPasswordField;
    @FindBy(css = "p.woocommerce-FormRow.form-row button")
    private WebElementFacade registerButton;
    @FindBy(css = ".woocommerce-error li")
    private WebElementFacade errorMessageForRegister;
    @FindBy(css = ".#post-7 > div > div > div > div > ul > li")
    private WebElementFacade errorMessageForRegisterNoMail;
    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(2) > div")
    private WebElementFacade errorMessageForRegisterWeakPass;
    @FindBy(css = "#customer_login > div.u-column2.col-2 > form > p:nth-child(2) > small")
    private WebElementFacade errorMessageForRegisterWeakPassHint;

    public void setRegEmailField(String value) {
        typeInto(regEmailAddressField, value);
    }
    public void setPasswordField(String value) {
        typeInto(regPasswordField, value);
    }
    public void clickRegisterButton() {
        clickOn(registerButton);
    }
    public String getErrorMessageForAlReadyRegistered(){
        return errorMessageForRegister.getText();
    }
    public String getErrorMessageForAlReadyRegisteredWeakPass(){
        return errorMessageForRegisterWeakPass.getText();
    }
    public String getErrorMessageForAlReadyRegisteredWeakPassHint(){
        return errorMessageForRegisterWeakPassHint.getText();
}

}
