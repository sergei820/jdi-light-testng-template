package org.mytests.uiobjects.example.site.pages;

public class BasePage {

    public static String compileLocator(String locator, String replacement) {
        return locator.replace("REPLACE", replacement);
    }
}
