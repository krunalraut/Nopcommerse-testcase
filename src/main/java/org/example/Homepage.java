package org.example;

import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class Homepage extends Util {
    private By _welcome= By.xpath("//div[@class=\"page-body\"]/div[2]/div[1]/h2[1]");
    private By _registerLink=By.className("ico-register");
    private By _ComputerLink=By.linkText("Computers");
    private By _ElectronicsLink=By.linkText("Electronics");
    private By _SearchButton =By.xpath("//input[@class='button-1 search-box-button']");
    private By _FacebookLink =By.linkText("Facebook");
    private By _DetailsButton1=By.xpath("//div[@class=\"news-items\"]/div[1]/div[3]/a");
    private By _CurrencyOption=By.id("customerCurrency");

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
    //click on Electronics link
    public void clickOnElectronics()
    {
        waitUntilElementIsClickAble(_ElectronicsLink,30);
        //click on electronics link
        clickOnElement(_ElectronicsLink,30);
    }
    //click on search button
    public void clickOnSearchButton()
    {
        waitUntilElementIsClickAble(_SearchButton,30);
        clickOnElement(_SearchButton,30);
    }
    public void verifyTextOnAlert()
    {
        Assert.assertEquals(getTextFromAlert(),"Please enter some search keyword");
    }
    //click on facebook link
    public void clickOnFacebookLink()
    {
        waitUntilElementIsClickAble(_FacebookLink,30);
        clickOnElement(_FacebookLink,30);
    }
    public void clickOnDetails1()
    {
        //click on details1
        clickOnElement(_DetailsButton1,30);
    }
    //chane and verify currency option to us doller
    public void changeCurrencyOption()
    {
        selectFromListByText(_CurrencyOption,"US Dollar",30);
        List <WebElement> priceList=driver.findElements(By.xpath("//div [@class=\"item-grid\"]//span[@class=\"price actual-price\"]"));
        System.out.println(priceList.size());
        for (WebElement price:priceList)
        {
            Assert.assertEquals(price.getText().contains("$"),true);
        }
    }
}
