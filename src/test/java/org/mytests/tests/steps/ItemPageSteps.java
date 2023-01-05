package org.mytests.tests.steps;

import org.mytests.uiobjects.example.model.ProductItem;

import static org.mytests.tests.steps.SearchResultsPageSteps.itemOnSearchResultsPage;
import static org.mytests.uiobjects.example.model.ProductItemFactory.getItemOnSearchResultsPage;
import static org.mytests.uiobjects.example.model.ProductItemFactory.getItemParametersOnItemPage;
import static org.mytests.uiobjects.example.site.ApparelSiteUK.itemPage;
import static org.testng.AssertJUnit.assertEquals;

public class ItemPageSteps {

    public ProductItem itemPageProductItem;

    public void compareSearchedItemWithItemOnItemPage() {
        itemPageProductItem = getItemParametersOnItemPage();
        assertEquals(itemOnSearchResultsPage.getName().substring(0, 24), itemPageProductItem.getName().substring(0, 24));
        assertEquals(itemOnSearchResultsPage.getPrice(), itemPageProductItem.getPrice());
    }

    public void clickReviews() {
        itemPage.getReviewsButton().click();
    }

    public void clickWriteReview() {
        itemPage.getWriteReviewButton().click();
    }

    public void fillInReviewSection(String reviewTitle, String reviewDescription, String ratingValue, String authorName) {
        itemPage.getReviewTitleInput().sendKeys(reviewTitle);
        itemPage.getReviewDescriptionTextarea().sendKeys(reviewDescription);
        if(ratingValue != null) {
            rateProduct(ratingValue);
        }
        itemPage.getReviewAuthorNameInput().sendKeys(authorName);
        itemPage.getSubmitReviewButton().click();
    }

    public void clickSubmitReviewButton() {
        itemPage.getSubmitReviewButton().click();
    }

    public void checkPostReviewResultMessage(String postReviewResultMessage) {
        assertEquals(postReviewResultMessage, itemPage.getPostReviewResultMessage().getText());
    }

    private void rateProduct(String ratingValue) {
        switch (ratingValue) {
            case "5":
                itemPage.getFiveStarRateElement().click();
                break;
        }
    }
}
