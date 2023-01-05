package org.mytests.tests.steps;

import com.epam.jdi.light.elements.pageobjects.annotations.WaitTimeout;
import org.mytests.uiobjects.example.site.sections.FilterForm;
import org.openqa.selenium.WebElement;

import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.mytests.tests.steps.BasePageSteps.compileLocator;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.filterForm;
import static org.mytests.uiobjects.example.site.sections.FilterForm.FILTER_CHECKBOX_BY_VALUE;
import static org.mytests.uiobjects.example.site.sections.FilterForm.dropdownSortBy;

public class FilterFormSteps {

    public void clickFilterCheckbox(String filterValue) {
        $(compileLocator(FILTER_CHECKBOX_BY_VALUE, filterValue)).click();
    }

    public void selectSortByDropdownValue(String dropdownValue) {
        dropdownSortBy.select(dropdownValue);
    }
}
