package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewStoreOpenPage extends Util{
    private By _PageText=By.xpath("//h1");
    private By _TitleTexBox= By.className("enter-comment-title");
    private By _CommentTextBox = By.className("enter-comment-text");
    private By _SendCommentButton = By.name("add-comment");
    private By _CommentSentSuccessfullyText = By.xpath("//div[text()=\"News comment is successfully added.\"]");

    public void checkForNewStorePage()
    {
        waitUntilElementIsClickAble(_PageText,30);
        Assert.assertEquals(getTextFromElement(_PageText,30),"New online store is open!");
    }
    public void fillPageDetails()
    {
        typeText(_TitleTexBox,"my title",30);
        typeText(_CommentTextBox,"nice product",30);
    }
    //click on send comment button
    public void clickOnSendComment()
    {
      clickOnElement(_SendCommentButton,30);
    }

    // verify comment send successfully
    public  void CheckCommentSentSuccessfully()
    {
        waitUntilElementIsClickAble(_CommentSentSuccessfullyText,30);
       Assert.assertEquals(getTextFromElement(_CommentSentSuccessfullyText,30),"News comment is successfully added.");
    }
    //verify comment is present in the list
    public void verifyComment() {
        boolean ans =false;
        List<WebElement> commentList = driver.findElements(By.xpath("//strong[@class=\"comment-text\"]"));
        for ( WebElement comment:commentList) {
             ans=comment.getText().contains("my title");
        }
        if (ans)
        {
            System.out.println("your comment is added successfully");
        }
        else
        {
            System.out.println("your comment is not added");
        }
    }
    public void verifyMessageAtLast()
    {
        List<WebElement> commentList = driver.findElements(By.xpath("//strong[@class=\"comment-text\"]"));
        String lastItem = commentList.get(commentList.size()-1).getText();
       Assert.assertEquals(lastItem,"my title");
    }
    }
