package org.mytests.tests.example;

import org.mytests.tests.steps.CartPageSteps;
import org.mytests.uiobjects.example.site.pages.CartPage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    CartPageSteps cartPageSteps;

    @BeforeSuite
    public void setUp() {
        cartPageSteps = new CartPageSteps();
    }

    @AfterSuite
    public void tearDown() {
    }
}
