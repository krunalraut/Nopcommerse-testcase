package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Homepage extends Util {
    private By _welcome= By.xpath("//div[@class=\"page-body\"]/div[2]/div[1]/h2[1]");
    private By _registerLink=By.className("ico-register");
    private By _ComputerLink=By.linkText("Computers");
    private By _ElectronicsLink=By.linkText("Electronics");
    public void CheckForHomepage()
    {
        //checking text on webpage
        Assert.assertEquals(getTextFromElement(_welcome,30),"Welcome to our store");
    }
    public void clickOnRegisterLink()
    {
        //click on register link
        clickOnElement(_registerLink,30);
    }
    public void clickOnComputerLink()
    {
        //wait for page to be load
        waitUntilElementIsClickAble(_ComputerLink,30);
        //click on computer link
        clickOnElement(_ComputerLink,30);
    }
    public void clickOnElectronics()
    {
        waitUntilElementIsClickAble(_ElectronicsLink,30);
        //click on electronics link
        clickOnElement(_ElectronicsLink,30);
    }

}
