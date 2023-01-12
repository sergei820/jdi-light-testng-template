package org.mytests.tests.steps;

import com.epam.jdi.light.elements.composite.WebPage;
import io.qameta.allure.Step;
import org.hamcrest.Matchers;
import org.mytests.uiobjects.example.site.pages.ItemPage;

import static com.epam.jdi.light.asserts.core.SoftAssert.jdiAssert;
import static org.hamcrest.Matchers.containsString;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.itemPage;
import static org.mytests.uiobjects.example.site.pages.ItemPage.postReviewResultMessage;

public class BasePageSteps {

    public static String compileLocator(String locator, String replacement) {
        return locator.replace("REPLACE", replacement);
    }

    public void checkPageTitle(String expectedPageTitle) {
        jdiAssert(WebPage.getTitle(), Matchers.comparesEqualTo(expectedPageTitle));
        //assertEquals(WebPage.getTitle(), expectedPageTitle);
    }

    @Step
    public void checkActionResultMessage(String postReviewResultMessage) {
        //ItemPage.postReviewResultMessage.assertThat().text(containsString(postReviewResultMessage);
        String resultMessage = ItemPage.postReviewResultMessage.getText();
        jdiAssert(resultMessage, containsString(postReviewResultMessage));
    }
}
