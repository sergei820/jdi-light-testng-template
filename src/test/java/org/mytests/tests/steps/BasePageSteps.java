package org.mytests.tests.steps;

import com.epam.jdi.light.elements.composite.WebPage;

public class BasePageSteps {

    public static String compileLocator(String locator, String replacement) {
        return locator.replace("REPLACE", replacement);
    }


}
