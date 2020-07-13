package org.example;

import org.testng.annotations.Test;

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
}
