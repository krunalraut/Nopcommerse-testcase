package org.example;





import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.testng.ITestResult;


public class Hooks {
    BrowserManager browserManager=new BrowserManager();
   @Before
    public void setBrowser()
    {
        browserManager.setBrowser();

    }
    @After
    public void closeBrowser()
    {
        browserManager.closeBrowser();
    }
}
