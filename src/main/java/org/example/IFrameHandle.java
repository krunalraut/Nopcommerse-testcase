package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class IFrameHandle extends Util{
    private By _TextOnPage = By.xpath("//span[text()=\"Not a Friendly Topic\"]");
    private By _TopicTextBox = By.xpath("//input[1]");
    private By _TopicText = By.id("topic");
    private By _InnerFrameText = By.xpath("//b[text()=\"Inner Frame Check box :\"]");
    private By _innerFrameCheckBox =By.id("a");
    private By _AnimalDropDownMenu = By.xpath("//select");

    public void verifyIframeWindow()
    {
        driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
        waitUntilElementIsClickAble(_TextOnPage,30);
        //check for page
       Assert.assertEquals(getTextFromElement(_TextOnPage,30),"Not a Friendly Topic");
    }
    public void enterIntoIFrame()
    {
        //switch to iframe
        driver.switchTo().frame("frame1");
        //verify iframe page
        Assert.assertEquals(getTextFromElement(_TopicText,30),"Topic :");
       // typeText(_TopicTextBox,"abc",30);
    }
    //fill iframe
    public void fillDetailsIFrame()
    {
        waitUntilElementIsClickAble(_TopicTextBox,30);
        //enter topic
        typeText(_TopicTextBox,"ABC",30);
    }
    //enter into inner frame and click on checkbox
    public void enterIntoInnerIFrame()
    {
        driver.switchTo().frame("frame3");
        //check for inner frame
        Assert.assertEquals(getTextFromElement(_InnerFrameText,30),"Inner Frame Check box :");
        //click on checkbox
        clickOnElement(_innerFrameCheckBox,30);
        //driver.switchTo().frame("frame1");
        driver.switchTo().defaultContent();
    }
    public void enterIntoLastFrame()
    {
        driver.switchTo().frame("frame2");
        // check for last frame
        Assert.assertEquals(getTextFromElement(By.xpath("//b[text()=\"Animals : \"]"),30),"Animals :");
        //select avatar from drop down menu
        selectFromListByText(_AnimalDropDownMenu,"Avatar",30);
        //switch to main window
        driver.switchTo().defaultContent();
    }
}
