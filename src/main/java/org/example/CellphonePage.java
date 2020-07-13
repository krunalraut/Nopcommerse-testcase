package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CellphonePage extends Util {
    private By _TextOnCellPhonePage=By.xpath("//h1[text()=\"Cell phones\"]");
    private By _HTCOneMbAddToCartButton=By.xpath("//div[@data-productid=\"18\"]/div[2]/div[3]/div[2]/input[1]");
    private By _CancelPopupMessage=By.cssSelector("span.close");
    private By _HTCOneMiniAddToCartButton=By.xpath("//div[@class=\"item-grid\"]/div[2]/div/div[2]/div[3]/div[2]/input[1]");
    private By _ShoppingCartLink=By.linkText("Shopping cart");

    public void checkForCellphonePage()
    {
        //check for cellphone page
        Assert.assertEquals(getTextFromElement(_TextOnCellPhonePage,20),"Cell phones");
    }
    public void AddToCartMobile()
    {
        //add HTC One Mobile to cart
        clickOnElement(_HTCOneMbAddToCartButton,30);
        //cancel popup
        clickOnElement(_CancelPopupMessage,30);
        //wait for element to be apear
        waitUntilElementIsClickAble(_HTCOneMiniAddToCartButton,30);
        //add HTC One Mini to cart
        clickOnElement(_HTCOneMiniAddToCartButton,30);
    }
    public void navigateToShoppingCart()
    {
        waitUntilElementIsClickAble(_ShoppingCartLink,30);
        clickOnElement(_ShoppingCartLink,30);
    }
}
