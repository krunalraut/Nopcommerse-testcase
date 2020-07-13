package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class DigitalStormPage extends Util {
    private By _TextDigitalStormPage=By.xpath("//h1[contains(text(),'VANQUISH')]");
    private By _EmailAFriendLink=By.xpath("//div[@class=\"product-essential\"]/div[2]/div[9]/div[3]/input[1]");

    public void checkForDigitalStormPage()
    {
        waitUntilElementVisible(_EmailAFriendLink,30);
        Assert.assertEquals(getTextFromElement(_TextDigitalStormPage,20),"Digital Storm VANQUISH 3 Custom Performance PC");
    }
    public void clickOnEmailAFriend()
    {
        clickOnElement(_EmailAFriendLink,60);
    }
}
