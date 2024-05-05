package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.PageHelper;

import java.util.List;

public class ProductsPage extends PageHelper {

    public ProductsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindAll(@FindBy(className = "btn_inventory"))
    public List<WebElement> addCartButtonList;

    @FindBy(className = "shopping_cart_badge")
    public WebElement cartBadge;

    @FindBy(className = "shopping_cart_link")
    public WebElement cartButton;

    public void addRandomProductToCart() {
        clickElement(getRandomItemFromList(addCartButtonList));
    }

    public void clickCartButton() {
        clickElement(cartButton);
    }

    public void verifyProductAddedToCart() {
        verifyElementVisible(cartBadge);
    }

}
