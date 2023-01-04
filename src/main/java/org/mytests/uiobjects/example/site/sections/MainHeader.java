package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitAfterAction;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitTimeout;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import org.openqa.selenium.WebElement;

public class MainHeader extends WebPage {

    @WaitTimeout(4)
    @Css("input#js-site-search-input")
    public static WebElement searchInput;

    @WaitAfterAction(2)
    @Css("button[class='btn btn-link js_search_button']")
    public static WebElement searchButton;
}
