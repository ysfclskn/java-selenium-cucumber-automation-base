package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ProductsPage;

public class ProductsSteps {

    ProductsPage productsPage = new ProductsPage();

    @When("add random product to cart on products page")
    public void addRandomProductToCartOnProductsPage() {
        productsPage.addRandomProductToCart();
    }

    @When("add random product and go to cart on products page")
    public void addRandomProductAndGoToCart() {
        productsPage.addRandomProductToCart();
        productsPage.clickCartButton();
    }

    @When("click cart button on products page")
    public void clickCartButtonOnProductsPage() {
        productsPage.clickCartButton();
    }

    @Then("verify product added to cart on products page")
    public void verifyProductAddedToCart() {
        productsPage.verifyProductAddedToCart();
    }

}
