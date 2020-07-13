package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationConfirmPage extends Util{
    private By _PageText=By.partialLinkText("Your registration completed");
    private By _HomepageLink=By.name("register-continue");

    public void registrationConfirmation()
    {
        waitUntilElementVisible(_PageText,30);
        Assert.assertEquals(getTextFromElement(_PageText,30),"Your registration completed");
    }
    public void NavigateToHomepage()
    {
        waitUntilElementIsClickAble(_HomepageLink,40);
        clickOnElement(_HomepageLink,40);
    }
}
