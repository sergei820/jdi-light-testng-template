package org.mytests.uiobjects.example.site;

import com.epam.jdi.light.elements.pageobjects.annotations.JSite;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import lombok.Data;
import org.mytests.uiobjects.example.site.pages.AccessoriesPage;
import org.mytests.uiobjects.example.site.pages.CartPage;
import org.mytests.uiobjects.example.site.pages.HomePage;
import org.mytests.uiobjects.example.site.pages.ItemPage;
import org.mytests.uiobjects.example.site.pages.LoginPage;
import org.mytests.uiobjects.example.site.pages.SearchResultsPage;
import org.mytests.uiobjects.example.site.sections.AddToCartForm;
import org.mytests.uiobjects.example.site.sections.FilterForm;
import org.mytests.uiobjects.example.site.sections.MainHeader;

@Data
@JSite("https://apparel-uk.local:9002/ucstorefront/en/")
public class ApparelSiteUK {

    @Url("/")
    public static HomePage homePage;
    public static MainHeader mainHeader;
    public static CartPage cartPage;
    public static SearchResultsPage searchResultsPage;
    public static AccessoriesPage accessoriesPage;
    public static AddToCartForm addToCartForm;
    public static FilterForm filterForm;
    public static ItemPage itemPage;
    public static LoginPage loginPage;


}
