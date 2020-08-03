package src.main.test.java.com.zomato.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TryLoggingIn {

    WebDriver driver;


    public void setup(){
        //use FF Driver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    /*@Test
    public void applyAsDeveloper() {
        //Create object of HomePage Class
        HomePage home = new HomePage(driver);
        home.clickOnDeveloperApplyButton();

        //Create object of DeveloperPortalPage
        DeveloperPortalPage devportal= new DeveloperPortalPage(driver);

        //Check if page is opened
        Assert.assertTrue(devportal.isPageOpened());

        //Click on Join Toptal
        devportal.clikOnJoin();

        //Create object of DeveloperApplyPage
        DeveloperApplyPage applyPage =new DeveloperApplyPage(driver);

        //Check if page is opened
        Assert.assertTrue(applyPage.isPageOpened());

        //Fill up data
        applyPage.setDeveloper_email("dejan@toptal.com");
        applyPage.setDeveloper_full_name("Dejan Zivanovic Automated Test");
        applyPage.setDeveloper_password("password123");
        applyPage.setDeveloper_password_confirmation("password123");
        applyPage.setDeveloper_skype("automated_test_skype");

        //Click on join
        //applyPage.clickOnJoin();
    }

    @Test
    public void close(){
        driver.close();
    }*/
}
