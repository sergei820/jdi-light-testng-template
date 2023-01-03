package org.mytests.tests.example;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setUp() {
    }

    @AfterSuite
    public void tearDown() {
    }
}
