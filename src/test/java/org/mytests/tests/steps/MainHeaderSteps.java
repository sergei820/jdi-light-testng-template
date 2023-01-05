package org.mytests.tests.steps;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.mytests.tests.steps.BasePageSteps.compileLocator;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.mainHeader;
import static org.mytests.uiobjects.example.site.sections.MainHeader.MAIN_HEADER_ITEM;
import static org.mytests.uiobjects.example.site.sections.MainHeader.searchButton;
import static org.mytests.uiobjects.example.site.sections.MainHeader.searchInput;

public class MainHeaderSteps {

    public void searchOnSite(String valueToSearch) {
        searchInput.sendKeys(valueToSearch);
        //Click search icon next to the field
        searchButton.click();
    }

    public void clickMenuItem(String menuItemName) {
        try{
            switch(menuItemName) {
                case "Accessories":
                    mainHeader.getMenuAccessories().click();
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public void clickLoginRegisterButton() {
        mainHeader.getLoginRegisterButton().click();
    }
}
