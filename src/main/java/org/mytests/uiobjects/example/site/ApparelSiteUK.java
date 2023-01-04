package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.complex.JList;
import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.mytests.uiobjects.example.site.custom.MenuItem;
import org.mytests.uiobjects.example.site.pages.CartPage;
import org.mytests.uiobjects.example.site.pages.HomePage;
import org.mytests.uiobjects.example.site.sections.MainHeader;

@JSite("https://apparel-uk.local:9002/ucstorefront/en/")
public class ApparelSiteUK {

    public static HomePage homePage;
    public static MainHeader mainHeader;
    public static CartPage cartPage;

}
