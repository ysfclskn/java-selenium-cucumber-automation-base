package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.CartPage;

public class CartSteps {

    CartPage cartPage = new CartPage();

    @And("click remove product from cart button on cart page")
    public void clickRemoveProductFromCartButtonOnCartPage() {
        cartPage.clickDeleteFromCartButton();
    }

    @Then("verify empty cart on cart page")
    public void verifyEmptyCartOnCartPage() {
        cartPage.verifyEmptyCart();
    }

    @Then("verify product added to cart on cart page")
    public void verifyProductAddedToCartOnCartPage() {
        cartPage.verifyCartNotEmpty();
    }

}
