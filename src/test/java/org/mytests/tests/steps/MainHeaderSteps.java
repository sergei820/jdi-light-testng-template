package org.mytests.tests.steps;

import static org.mytests.uiobjects.example.site.sections.MainHeader.searchButton;
import static org.mytests.uiobjects.example.site.sections.MainHeader.searchInput;

public class MainHeaderSteps {

    public void searchOnSite(String valueToSearch) {
        searchInput.sendKeys(valueToSearch);
        //Click search icon next to the field
        searchButton.click();
    }
}
