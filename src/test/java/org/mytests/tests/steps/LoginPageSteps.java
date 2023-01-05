package org.mytests.tests.steps;

import org.testng.Assert;

import static org.mytests.uiobjects.example.site.ApparelSiteUK.loginPage;

public class LoginPageSteps extends BasePageSteps {

    public void checkThatPageIsDisplayed() {
        Assert.assertTrue(loginPage.isOpened());
    }

    public void fillInLogInForm(String login, String password) {
        loginPage.getLoginEmail().sendKeys(login);
        loginPage.getLoginPassword().sendKeys(password);
    }

    public void clickLogInButton() {
        loginPage.getLogInButton().click();
    }
}
