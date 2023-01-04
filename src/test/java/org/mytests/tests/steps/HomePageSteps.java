package org.mytests.tests.steps;

import com.epam.jdi.light.elements.composite.WebPage;

import static com.epam.jdi.light.elements.init.UIFactory.$;

public class HomePageSteps {

    public void openHomePage() {
        WebPage.openUrl("https://apparel-uk.local:9002/ucstorefront/en");
        if($("button#details-button").isVisible()) {
            $("button#details-button").click();
            $("a#proceed-link").click();
        }
    }
}
