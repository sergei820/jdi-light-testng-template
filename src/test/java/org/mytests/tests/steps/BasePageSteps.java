package org.mytests.tests.steps;

public class BasePageSteps {

    public static String compileLocator(String locator, String replacement) {
        return locator.replace("REPLACE", replacement);
    }
}
