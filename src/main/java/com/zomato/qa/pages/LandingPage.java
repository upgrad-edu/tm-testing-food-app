package com.zomato.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.zomato.qa.base.TestBase;
import java.awt.*;

public class LandingPage extends TestBase{
	
	//Page Factory
	@FindBy(xpath="//div[@class='sc-jMMfwr jsKxRk logo']//img[@class='high-res-image']")
	WebElement zomatoLogo;

	@FindBy(xpath="//input[@placeholder='Search for restaurant, cuisine or a dish']")
	WebElement searchBox;


	@FindBy(xpath="//div[@class='sc-chbbiW ebxmtz']")
	WebElement searchButton;

	@FindBy(xpath="//a[contains(text(),'KFC')]")
	WebElement KFC;


	//Initializing the Page Objects:
	public LandingPage(WebDriver driver) throws AWTException {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	Robot rb = new Robot();


	//Actions:

	public String validateLandingPageTitle(){
		return driver.getTitle();
	}

	public String validateKFCPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateSearchBoxIsPresent(){
		return searchBox.isDisplayed();
	}

	public boolean validateLogoIsPresent(){
		return zomatoLogo.isDisplayed();
	}

	public void enterSearchQuery(String searchText) throws InterruptedException {

		searchBox.sendKeys(searchText);
		Thread.sleep(2000);
		searchButton.click();
	}


	public void clickKFC() throws InterruptedException {
		KFC.isDisplayed();
		Thread.sleep(2000);
		KFC.click();
	}




}
