package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class TestSuit extends TestExtra {
    Homepage homepage=new Homepage();
    RegisterPage registerPage=new RegisterPage();
    RegistrationConfirmPage registrationConfirmPage=new RegistrationConfirmPage();
    ComputerPage computerPage=new ComputerPage();
    DesktopPage desktopPage=new DesktopPage();
    DigitalStormPage digitalStormPage=new DigitalStormPage();
    EmailAFriendPage emailAFriendPage=new EmailAFriendPage();
    EmailSendSuccessfulpage emailSendSuccessfulpage= new EmailSendSuccessfulpage();
    ElectronicsPage electronicsPage=new ElectronicsPage();
    CellphonePage cellphonePage=new CellphonePage();
    ShoppingCartPage shoppingCartPage=new ShoppingCartPage();
    FacebookPopUpWindow facebookPopUpWindow= new FacebookPopUpWindow();
    NewStoreOpenPage newStoreOpenPage = new NewStoreOpenPage();
    IFrameHandle iFrameHandle= new IFrameHandle();


    @Test (priority = 0)
    public void RegistrationWithValidCredential()
    {
        //check homepage
        homepage.CheckForHomepage();
        //click on register
        homepage.clickOnRegisterLink();
        //check user is on registration page
        registerPage.checkRegistrationPage();
        //enter registration page details
        registerPage.enterRegisterPageDetais();
        //click on register button
        registerPage.clickOnButton();
    }
    @Test(priority = 1)
    public void userAbleToReferAFriend()
    {
        //check homepage
        homepage.CheckForHomepage();
        //click on register
        homepage.clickOnRegisterLink();
        //check user is on registration page
        registerPage.checkRegistrationPage();
        //enter registration page details
        registerPage.enterRegisterPageDetais();
        //click on register button
        registerPage.clickOnButton();
        //navigate to homepage
        registrationConfirmPage.NavigateToHomepage();
        //check homepage
        homepage.CheckForHomepage();
        //click on computer
        homepage.clickOnComputerLink();
        //verify computerpage
        computerPage.checkForComputerPage();
        //click on desktop
        computerPage.clickOnDesktopLink();
        //verify desktop page
        desktopPage.checkForDesktopPage();
        //click on digital storm
        desktopPage.clickOnDigitalStormAddToCartButton();
        //check for digital storm page
        digitalStormPage.checkForDigitalStormPage();
        //click on email a friend
        digitalStormPage.clickOnEmailAFriend();
        //check for email a friend page
        emailAFriendPage.checkForEmailaFriendPage();
        //fill all textbox
        emailAFriendPage.fillEmailaFriendPage();
        //check email send successfully
        emailSendSuccessfulpage.checkEmailSendSuccessfully();
    }
    @Test (priority = 2)
    public void VerifyProductAddedToShoppingCart()
    {
        // check user on homepage
        homepage.CheckForHomepage();
        //click on electronics
        homepage.clickOnElectronics();
        //check user on electronics page
        electronicsPage.checkForElectronicsPage();
        //click on cellphone
        electronicsPage.clickOnCellPhoneLink();
        //check user on cellphone
        cellphonePage.checkForCellphonePage();
        //add phones to shopping cart
        cellphonePage.AddToCartMobile();
        //click on shopping cart link
        cellphonePage.navigateToShoppingCart();
        //check user on shipping cart
        shoppingCartPage.verifyShoppingCartPage();
        //verify products in shopping cart
        shoppingCartPage.checkProductInShoppingCart();
    }

    @Test
    public void verifyAlertOnSearchButton()
    {
        //check user is on homepage
        homepage.CheckForHomepage();
        //click on search button
        homepage.clickOnSearchButton();
        //get text from popup
        homepage.verifyTextOnAlert();
        //click on ok button in alert
        clickOnOkOfAlert();
    }
    @Test
    public void toVerifyFacebookLink()
    {
        //check user is on homepage
        homepage.CheckForHomepage();
        //click on facebook link
        homepage.clickOnFacebookLink();
        //verify url
        facebookPopUpWindow.handleFacebookPopupWindow();
    }
    @Test
    public void verifyCommentInDetails()
    {
        //click on detais 1
        homepage.clickOnDetails1();
        //check for page
        newStoreOpenPage.checkForNewStorePage();
        //fill page
        newStoreOpenPage.fillPageDetails();
        //click on send comment button
        newStoreOpenPage.clickOnSendComment();
        //verify comment send successfully
        newStoreOpenPage.CheckCommentSentSuccessfully();
        //verify comment is added
        newStoreOpenPage.verifyComment();
        //verify comment present at bottom
        newStoreOpenPage.verifyMessageAtLast();
    }
    @Test
    public void userAbleToChangeCurrency()
    {
        homepage.CheckForHomepage();
        //click on currency option & check currency
        homepage.changeCurrencyOption();
    }
    @Test
    public void handleIFrame()
    {
        //verify page
        iFrameHandle.verifyIframeWindow();
        //enter and verify first iframe
        iFrameHandle.enterIntoIFrame();
        //fill the detais
        iFrameHandle.fillDetailsIFrame();
        //enter and check inner iframe
        iFrameHandle.enterIntoInnerIFrame();
        //enter and check last iframe
        iFrameHandle.enterIntoLastFrame();
    }

}
