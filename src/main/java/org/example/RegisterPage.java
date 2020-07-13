package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class RegisterPage extends Util {
    private By _PageText=By.xpath("//strong[text()='Your Personal Details']");
    String expectedText="Your Personal Details";
    private By _ClickGender= By.id("gender-male");
    private By _FirstName=By.id("FirstName");
    private By _LastName=By.id("LastName");
    private By _DayDateOfBirth=By.name("DateOfBirthDay");
    private By _MonthDateOfBirth=By.name("DateOfBirthMonth");
    private By _YearDateOfBirth=By.name("DateOfBirthYear");
    private By _Email=By.id("Email");
    private By _CompanyName=By.id("Company");
    private By _NewsLetter=By.id("Newsletter");
    private By _Password=By.id("Password");
    private By _ConfirmPassword=By.id("ConfirmPassword");
    private By _ClickOnRegisterButton=By.id("register-button");

    public void checkRegistrationPage()
    {
        Assert.assertEquals(getTextFromElement(_PageText,20),"Your Personal Details");
    }

    public void enterRegisterPageDetais()
    {
        waitUntilElementIsClickAble(_ClickOnRegisterButton,30);
        //click on male radio button
        clickOnElement(_ClickGender,20);
        //enter first name
        typeText(_FirstName,"krunal",20);
        //enter Last name
        typeText(_LastName,"Raut",20);
        //select day from list
        selectFromListByIndex(_DayDateOfBirth,1,20);
        //select month from list
        selectFromListByText(_MonthDateOfBirth,"April",10);
        //select month from list
        selectFromListByValue(_YearDateOfBirth,"1990",10);
        //enter email
        typeText(_Email,"krunal+"+timestamp()+"@gmail.com",20);
        //click Newsletter
        clickOnElement(_NewsLetter,20);
        //enter company name
        clickOnElement(_CompanyName,20);
        //enter password
        typeText(_Password,"abc123",20);
        //enter confirm password
        typeText(_ConfirmPassword,"abc123",20);
    }
    public void clickOnButton()
    {
        clickOnElement(_ClickOnRegisterButton,20);
    }
}
