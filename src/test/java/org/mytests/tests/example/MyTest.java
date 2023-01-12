package org.mytests.tests.example;

import org.hamcrest.Matchers;
import org.mytests.uiobjects.example.site.ApparelSiteUK;
import org.testng.annotations.Test;

import static com.epam.jdi.light.asserts.core.SoftAssert.jdiAssert;

public class MyTest extends BaseTest {

    @Test
    public void myTest() {
        homePageSteps.openHomePage();
        //Click “Accessories” in the global header
        ApparelSiteUK.homePage.shouldBeOpened();
        jdiAssert(ApparelSiteUK.mainHeader.menuAccessories.getText(), Matchers.containsString("wrong"));

    }
}
