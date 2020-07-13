package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailAFriendPage extends Util {
    private By _TextOnEmailAFriendPage=By.xpath("//h1[text()='Email a friend']");
    private By _FriendEmailTextBox=By.className("friend-email");
    private By _EnterMessage= By.id("PersonalMessage");
    private By _SendEmailButton=By.name("send-email");

    public void checkForEmailaFriendPage()
    {
        waitUntilElementVisible(_SendEmailButton,20);
        Assert.assertEquals(getTextFromElement(_TextOnEmailAFriendPage,20),"Email a friend");
    }
    public void fillEmailaFriendPage()
    {
        //wait for page to be load
        waitUntilElementIsClickAble(_SendEmailButton,30);
        //enter your friend email
        typeText(_FriendEmailTextBox,"hiren@gmail.com",30);
        //enter message
        typeText(_EnterMessage,"see this",30);
        //click on send button
        clickOnElement(_SendEmailButton,30);
    }
}
