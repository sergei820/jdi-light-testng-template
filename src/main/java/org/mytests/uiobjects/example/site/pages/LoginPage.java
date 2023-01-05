package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.ui.html.elements.common.Button;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
@Url("/login")
public class LoginPage extends WebPage {

    @Css("#j_username")
    private WebElement loginEmail;

    @Css("#j_password")
    private WebElement loginPassword;

    @Css(".login-section button")
    private Button logInButton;

}
