package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util{
    public void setBrowser()
    {
        //seting up chromedriver path
        System.setProperty("webdriver.chrome.driver","src\\test\\web driver\\chromedriver.exe");
        //creating chrome driver object to open chrome browser
        driver=new ChromeDriver();
        //maximise screen
        driver.manage().window().maximize();
        //applying implicitly wait of 30 sec to driver instance
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        //open Url
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser()
    {
        driver.close();
    }
}
