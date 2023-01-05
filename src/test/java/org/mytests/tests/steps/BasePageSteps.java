package org.mytests.tests.steps;

import com.epam.jdi.light.elements.composite.WebPage;
import org.testng.Assert;

import static org.mytests.uiobjects.example.site.ApparelSiteUK.itemPage;
import static org.testng.Assert.assertEquals;

public class BasePageSteps {

    public static String compileLocator(String locator, String replacement) {
        return locator.replace("REPLACE", replacement);
    }

    public void checkPageTitle(String expectedPageTitle) {
        assertEquals(WebPage.getTitle(), expectedPageTitle);
    }

    public void checkActionResultMessage(String postReviewResultMessage) {
        Assert.assertTrue(itemPage.getPostReviewResultMessage().getText().contains(postReviewResultMessage));
    }
}
