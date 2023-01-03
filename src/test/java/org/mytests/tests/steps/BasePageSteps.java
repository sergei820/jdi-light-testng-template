package org.mytests.tests.steps;

import org.testng.annotations.BeforeSuite;

public class BasePageSteps {

    public static String compileLocator(String locator, String replacement) {
        return locator.replace("REPLACE", replacement);
    }
}
