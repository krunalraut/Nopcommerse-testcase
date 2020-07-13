package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ComputerPage extends Util {
    private By _ExpectedTextOnComputerPage=By.xpath("//h1[text()='Computers']");
    private By _DesktopLink=By.xpath("//div[@class=\"listbox\"]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
    String _ActualTextOnComputerPage="Computers";

    public void checkForComputerPage()
    {
        Assert.assertEquals(getTextFromElement(_ExpectedTextOnComputerPage,30),_ActualTextOnComputerPage);
    }
    public void clickOnDesktopLink()
    {
        clickOnElement(_DesktopLink,40);
    }
}
