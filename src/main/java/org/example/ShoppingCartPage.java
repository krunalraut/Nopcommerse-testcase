package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Util {
    private By _ShoppingCartText=By.xpath("//h1[text()='Shopping cart']");
    private By _HTCOneM8Link=By.linkText("HTC One M8 Android L 5.0 Lollipop");
    private By _HTCOneMini =By.linkText("HTC One Mini Blue");

    public void verifyShoppingCartPage()
    {
        Assert.assertEquals(getTextFromElement(_ShoppingCartText,30),"Shopping cart");
    }
    public void checkProductInShoppingCart()
    {
        Assert.assertEquals(getTextFromElement(_HTCOneM8Link,30),"HTC One M8 Android L 5.0 Lollipop");
        Assert.assertEquals(getTextFromElement(_HTCOneMini,30),"HTC One Mini Blue");
    }

}
