package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.Css;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.XPath;
import lombok.Data;
import org.openqa.selenium.WebElement;

@Data
public class ItemPage extends WebPage {

    @Css("div[class='product-details page-title'] .name")
    private WebElement itemName;

    @Css(".product-details .price")
    private WebElement itemPrice;

    @Css("a#tabreview")
    private WebElement reviewsButton;

    @XPath("//button[text()='Write a Review']")
    private WebElement writeReviewButton;

    @Css("input[name='headline']")
    private WebElement reviewTitleInput;

    @Css("textarea[name='comment']")
    private WebElement reviewDescriptionTextarea;

    @Css("div[class='rating-stars js-writeReviewStars']:last-child")
    private WebElement fiveStarRateElement;
}
