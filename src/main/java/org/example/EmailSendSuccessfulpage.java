package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class EmailSendSuccessfulpage extends Util {
    private By _TextOnSendEmailsuccessful=By.xpath("//div[@class=\"page-body\"]/div[2]");

    public void checkEmailSendSuccessfully()
    {
        Assert.assertEquals(getTextFromElement(_TextOnSendEmailsuccessful,20),"Your message has been sent.");
    }
}
