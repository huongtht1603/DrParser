package com.DrParser.pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrParser.helper.AbstractPage;
import com.DrParser.helper.WaitHelper;

public class backToTop extends AbstractPage{
	
	private WebDriver driver;
	WaitHelper waitHelper;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/footer/div/div[1]/div/div[2]/a")
	public WebElement contactUsNowBtn;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/div/span/span[1]/img")
	public WebElement backToTopBtn;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/div/section/div/div/div/div/div/div/h1")
	public WebElement banner;

	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/div/div/div/h1")
	public WebElement contactPageBanner;
	
	@FindBy(xpath="//h1[normalize-space()='With Game-changing AI']")
	public WebElement homepagebanner;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[1]/div[2]/div/div/div/div/div/h1[1]")
	public WebElement blogbanner;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/div[1]/div/div/h1")
	public WebElement positionBanner;
	
	public String artiIntePage_title = "Artificial Intelligence";
	public String businessIntePage_title = "Business Intelligence";
	public String dataEngineer_title = "Data Engineering";
	public String dataSciencePage_title = "Data Science And Analytics Solutions";
	public String companyPage_banner = "Neurond AI";

	
	public void clickBackToTopBtn() throws InterruptedException {
		Thread.sleep(2000);
		waitHelper.WaitForElement(this.contactUsNowBtn, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",contactUsNowBtn);
		 js.executeScript("arguments[0].click();",backToTopBtn);
		 Thread.sleep(2000);
	}
	
	public void isTopOfArtificialIntelligencePage() {
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfBusinessIntelligencePage() {
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfDataEngineeringPage() {
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfDataSciencePage() {
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfCompanyPage() throws InterruptedException {
		Thread.sleep(2000);
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfBlogPage() {
	    assertTrue(blogbanner.isDisplayed());
	}
	
	public void isTopOfCareersPage() {
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfDrParserproductPage() {
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfDemoDrParserproductPage() {
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfPackagesPage() {
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfContactPage() {
	    assertTrue(contactPageBanner.isDisplayed());
	}
	
	public void isTopOfEmployeeBenefitsPage() {
	    assertTrue(banner.isDisplayed());
	}
	
	public void isTopOfPositionPage() throws InterruptedException {
		Thread.sleep(2000);
	    assertTrue(positionBanner.isDisplayed());
	}
	
	public void isTopOfHomePage() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(homepagebanner.isDisplayed());
	}
	
	public backToTop(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	

}
