package org.mytests.tests.steps;

import com.epam.jdi.light.elements.composite.WebPage;
import org.mytests.uiobjects.example.model.ProductItem;
import org.mytests.uiobjects.example.site.ApparelSiteUK;

import static org.mytests.tests.steps.AddToCartFormSteps.itemToBuy;
import static org.mytests.uiobjects.example.model.ProductItemFactory.getAddedToCartItem;
import static org.testng.Assert.assertEquals;

public class CartPageSteps {

    public void compareItemToBuyWithItemInCart() {
        ProductItem itemInCart = getAddedToCartItem();
        assertEquals(itemToBuy.getName(), itemInCart.getName());
        assertEquals(itemToBuy.getSize().replace("Size ", ""), itemInCart.getSize());
        assertEquals(itemToBuy.getQuantity().replace("Quantity Added ", ""), itemInCart.getQuantity());
        assertEquals(itemToBuy.getPrice(), itemInCart.getPrice().replace("Item price: ", ""));
    }

    public void checkThatPageIsDisplayed() {
        ApparelSiteUK.cartPage.checkOpened();
    }
}
