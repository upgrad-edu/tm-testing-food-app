package com.zomato.qa.TestCase;

import com.zomato.qa.base.TestBase;
import com.zomato.qa.pages.LandingPage;
import org.testng.Assert;
import org.testng.annotations.*;
import java.awt.*;
import java.net.MalformedURLException;

public class LandingPageTest extends TestBase{
	LandingPage landingPage;

	
	public LandingPageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() throws MalformedURLException, AWTException {
		initialization();
		landingPage = new LandingPage(driver);
	}
	
	@Test(priority=1)
	public void landingPageTitleTest() throws InterruptedException {

		Thread.sleep(2000);

		String title = landingPage.validateLandingPageTitle();
		Assert.assertEquals(title, "Restaurants - Delhi NCR Restaurants, Restaurants in Delhi NCR | Zomato India");
	}
	
	@Test(priority=2)
	public void searchBoxTest(){
		boolean flag = landingPage.validateSearchBoxIsPresent();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void searchTextTestAndVerifySame() throws InterruptedException {
			landingPage.enterSearchQuery("Chicken");
			Thread.sleep(4000);
	}

	@Test(priority=4)
	public void clickKFCandVerifyPage() throws InterruptedException {
		landingPage.clickKFC();
		Thread.sleep(4000);
		landingPage.validateKFCPageTitle();

	}


	@Test(priority=5)
	public void verifyZomatoLogo() throws InterruptedException {
		landingPage.validateLogoIsPresent();
	}

	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	
	
	

}
