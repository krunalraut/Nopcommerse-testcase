package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util extends BaseProject {
    public static void waitUntilElementIsClickAble(By by, int time)
    {
        WebDriverWait wait = new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitUntilElementVisible(By by,int time)
    {
        WebDriverWait wait= new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public static void clickOnElement(By by,int time)
    {
        waitUntilElementIsClickAble(by,time);
        driver.findElement(by).click();
    }

    public static String getTextFromElement(By by, int time) {
       waitUntilElementVisible(by,time);
        return driver.findElement(by).getText();
    }

    public static void typeText(By by, String text, int time)
    {
        waitUntilElementIsClickAble(by,time);
        driver.findElement(by).sendKeys(text);
    }
    public static void selectFromListByIndex(By by,int index, int time)
    {
       waitUntilElementIsClickAble(by,time);
        Select select=new Select(driver.findElement(by));
        select.selectByIndex(index);
    }
    public static void selectFromListByText(By by,String text,int time)
    {
        waitUntilElementIsClickAble(by,time);
        Select select=new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }
    public static void selectFromListByValue(By by,String value, int time)
    {
        waitUntilElementIsClickAble(by,time);
        Select select=new Select(driver.findElement(by));
        select.selectByValue(value);
    }
    public static long timestamp() {
        return (System.currentTimeMillis());
    }

}
