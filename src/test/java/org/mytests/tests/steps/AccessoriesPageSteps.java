package org.mytests.tests.steps;

import org.mytests.uiobjects.example.site.ApparelSiteUK;

public class AccessoriesPageSteps {



    public void checkThatPageIsDisplayed() {
        ApparelSiteUK.accessoriesPage.checkOpened();
    }
}
