package org.mytests.tests.steps;

import org.mytests.uiobjects.example.site.ApparelSiteUK;
import org.testng.Assert;

public class AccessoriesPageSteps {



    public void checkThatPageIsDisplayed() {
        Assert.assertTrue(ApparelSiteUK.accessoriesPage.isOpened());
    }
}
