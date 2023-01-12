package org.mytests.uiobjects.example.site.custom;


import com.epam.jdi.light.elements.common.UIElement;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import org.openqa.selenium.WebElement;

public class MenuItem extends UIElement {

    @UI("a[title='Accessories']")
    public static WebElement accessoriesLink;

    @Override
    public boolean isSelected() {
        return hasClass("active") && attr("ui").equals("label");
    }
}
