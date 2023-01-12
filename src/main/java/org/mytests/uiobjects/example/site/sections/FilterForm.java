package org.mytests.uiobjects.example.site.sections;

import com.epam.jdi.light.elements.complex.dropdown.Dropdown;
import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.WaitTimeout;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import lombok.Getter;
import org.openqa.selenium.WebElement;

import java.awt.*;

@Getter
public class FilterForm extends WebPage {

    public static final String FILTER_CHECKBOX_BY_VALUE = "//span[contains(text(),'REPLACE')]/parent::span";

    @WaitTimeout(5)
    @UI("//span[contains(text(),'£0-£19.99')]/parent::span")
    public static Checkbox priceCheckbox;

    @UI("#sortOptions1")
    public static Dropdown dropdownSortBy;
}
