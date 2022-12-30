package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.complex.Menu;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;

@Url("ucstorefront/en") @Title("\n\t\tApparel Site UK | Homepage")
public class HomePage extends WebPage {

    @Css("[title='Accessories']")
    @UI(".navigation__overflow") public static Menu topHorizontalMenu;

}
