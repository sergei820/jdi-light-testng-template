package org.mytests.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import lombok.Getter;
import org.openqa.selenium.WebElement;

@Getter
public class ItemPage extends WebPage {

    @UI("div[class='product-details page-title'] .name")
    private WebElement itemName;

    @UI(".product-details .price")
    private WebElement itemPrice;

    @UI("a#tabreview")
    private WebElement reviewsButton;

    @UI("//button[text()='Write a Review']")
    private WebElement writeReviewButton;

    @UI("input[name='headline']")
    private WebElement reviewTitleInput;

    @UI("textarea[name='comment']")
    private WebElement reviewDescriptionTextarea;

    @UI("div[class='rating-stars js-writeReviewStars']:last-child")
    private WebElement fiveStarRateElement;

    @UI("#alias")
    private WebElement reviewAuthorNameInput;

    @UI("button[value='Submit Review']")
    private Button submitReviewButton;

    @UI(".global-alerts > div")
    public static WebElement postReviewResultMessage;
}
