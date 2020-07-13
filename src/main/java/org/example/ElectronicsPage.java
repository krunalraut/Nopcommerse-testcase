package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ElectronicsPage extends Util{
    private By _CellPhoneLink=By.xpath("//h2/a[text()=\" Cell phones \"]");
    private By _TextOnElectronicsPage=By.xpath("//h1[text()=\"Electronics\"]");


    public void checkForElectronicsPage()
    {
        Assert.assertEquals(getTextFromElement(_TextOnElectronicsPage,30),"Electronics");
    }
    public void clickOnCellPhoneLink()
    {
        waitUntilElementIsClickAble(_CellPhoneLink,40);
        clickOnElement(_CellPhoneLink,40);
    }
}
