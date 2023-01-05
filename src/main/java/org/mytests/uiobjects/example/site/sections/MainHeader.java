package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitAfterAction;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitTimeout;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
public class MainHeader extends WebPage {

    public static final String MAIN_HEADER_ITEM = "//div[@class='navigation__overflow']//a[text()='REPLACE']";

    @Css(".liOffcanvas > a")
    private WebElement loginRegisterButton;

    @WaitTimeout(4)
    @Css("input#js-site-search-input")
    public static WebElement searchInput;

    @WaitAfterAction(3)
    @XPath("//div[@class='navigation__overflow']//a[text()='Accessories']")
    private WebElement menuAccessories;

    @WaitAfterAction(2)
    @Css("button[class='btn btn-link js_search_button']")
    public static WebElement searchButton;
}
