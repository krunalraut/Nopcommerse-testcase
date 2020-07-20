package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;




public class FacebookPopUpWindow extends Util {
    private By _CreatePageButton= By.xpath("//div[@class=\"clearfix\"]//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]");
    public void handleFacebookPopupWindow() {
        String MainWindow = driver.getWindowHandle();

        // To handle all new opened window.
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                // Switching to Child window
               Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
                //verify create a page button
                waitUntilElementIsClickAble(_CreatePageButton,30);
                String text = getTextFromElement(_CreatePageButton,30);
                Assert.assertEquals(text,"Create a Page");
                //driver.findElement(By.xpath("//div[@class=\"clearfix\"]//button[@class=\"_4jy0 _4jy3 _4jy2 _51sy selected _42ft\"]"));
                String colour=driver.findElement(_CreatePageButton).getCssValue("background-color").toString();
                System.out.println("colour of button is:"+colour);
                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }

}