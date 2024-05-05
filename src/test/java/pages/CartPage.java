package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.PageHelper;

public class CartPage extends PageHelper {

    public CartPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "cart_button")
    public WebElement deleteFromCartButton;

    @FindBy(className = "cart_item")
    public WebElement productFieldInCart;

    public void clickDeleteFromCartButton() {
        clickElement(deleteFromCartButton);
    }

    public void verifyCartNotEmpty() {
        verifyElementVisible(productFieldInCart);
    }

    public void verifyEmptyCart() {
        verifyElementInvisible(productFieldInCart);
    }

}
