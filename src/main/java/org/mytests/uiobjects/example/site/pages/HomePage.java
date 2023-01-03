package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.FindBy;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitAfterAction;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.TextField;
import org.openqa.selenium.WebElement;

@Url("ucstorefront/en") @Title("\n\t\tApparel Site UK | Homepage")
public class HomePage extends WebPage {

    //@Css("[title='Accessories']")
    //public static UIElement accessories;
    @UI(".navigation__overflow") public static Menu topHorizontalMenu;

    @FindBy(id="js-site-search-input")
    public static WebElement searchInput;

    @WaitAfterAction(2)
    @Css("button[class='btn btn-link js_search_button']")
    public static WebElement searchButton;

    @Css(".results>h1")
    public static WebElement searchResultsMessage;
}
