package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;

public class FilterForm extends WebPage {

    public static final String FILTER_CHECKBOX_BY_VALUE = "//span[contains(text(),'REPLACE')]/parent::span";

    @UI("#sortOptions1")
    public static Dropdown dropdownSortBy;
}
