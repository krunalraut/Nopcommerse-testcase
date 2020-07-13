package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DesktopPage extends Util{
    private By _ExpectedTextOnDesktop=By.xpath("//h1[text()='Desktops']");
    private By _DigitalStormLink=By.linkText("Digital Storm VANQUISH 3 Custom Performance PC");
    public void checkForDesktopPage()
    {
        Assert.assertEquals(getTextFromElement(_ExpectedTextOnDesktop,20),"Desktops");
    }
    public void clickOnDigitalStormAddToCartButton()
    {

       clickOnElement(_DigitalStormLink,20);
    }
}
