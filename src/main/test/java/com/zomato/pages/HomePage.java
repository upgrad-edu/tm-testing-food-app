package src.main.test.java.com.zomato.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;

    //Page URL
    private static String PAGE_URL="https://www.zomato.com";

    //Locators
    @FindBy(how = How.XPATH, using = "//div[@class='sc-jqIZGH ijazXQ logo']//img[@class='high-res-image']")
    private WebElement zomatoLogo;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
    private WebElement login;

    @FindBy(how = How.XPATH, using = "//input[@placeholder='Search for restaurant, cuisine or a dish']")
    private WebElement searchBox;

    @FindBy(how = How.XPATH, using = "//div[@class='sc-hzNEM iRLIfy']")
    private WebElement searchBttn;

    @FindBy(how = How.XPATH, using = "//a[contains(text(),'KFC')]")
    private WebElement KFC;



    //Constructor
    public HomePage(WebDriver driver){
        this.driver=driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }


    //Action on login button
    public void clickOnLoginButton(){
        login.click();
    }

    public void enterSearchItem(){
        searchBox.sendKeys("chicken");
    }

    public void clickSearchButton(){
        searchBttn.click();
    }

    public void clickKFC(){
     KFC.click();
    }
}