package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static utilities.BrowserUtils.waitUntilVisible;

public class CheckoutPage extends BasePage{
    @FindBy(xpath = "//button[text()='Empty Cart']")
    public WebElement emptyCartButton;

    @FindBy(xpath = "//button[contains(@class,'bg-origin-box-border bg-repeat-x')]")

    public WebElement verifyEmptyCartButton;

    @FindBy(css = "p[class='header-1']")
    public WebElement emptyCartHeader;

    public void waitForText(){
        waitUntilVisible(emptyCartHeader);
    }


    public void verifyingTheEmptyCard(){
        Assert.assertEquals(emptyCartHeader.getText(), "Your cart is empty.");

    }

    public void waitAndClick() {
        waitUntilVisible(verifyEmptyCartButton);
        verifyEmptyCartButton.click();
    }


}
