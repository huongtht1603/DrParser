package com.DrParser.pageObjects;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.DrParser.helper.AbstractPage;
import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;

public class navigationmenu extends AbstractPage {
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id='responsive-navbar-nav']/div/div[1]/div[1]/a")
	public WebElement servicesNav;
	
	@FindBy(xpath="//a[normalize-space()='artificial intelligence']")
	public WebElement artiInteNav;
	
	@FindBy(xpath="//a[normalize-space()='business intelligence']")
	public WebElement businessInteNav;
	
	@FindBy(xpath="//a[normalize-space()='data engineering']")
	public WebElement dataEngineerNav;
	
	@FindBy(xpath="//a[normalize-space()='data science and analytics solutions']")
	public WebElement dataScienceNav;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/div/section/div/div/div/div/div/div/h1")
	public WebElement banner;	
	
	@FindBy(xpath="//a[normalize-space()='company']")
	public WebElement companyNav;
	
	@FindBy(xpath="//a[normalize-space()='Blog']")
	public WebElement blogNav;
	
	@FindBy(xpath="//a[normalize-space()='careers']")
	public WebElement careersNav;
	
	@FindBy(xpath="//a[normalize-space()='contact']")
	public WebElement contactNav;
	
	@FindBy(xpath="//a[normalize-space()='products']")
	public WebElement productsNav;
	
	@FindBy(xpath="//a[normalize-space()='Dr Parser']")
	public WebElement drParserNav;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section[2]/div/div/div/button[2]")
	public WebElement checkOutPackageBtn;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/article[2]/div[2]/div/div/a/div/div")
	public WebElement ourBenefitsBtn;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section[1]/div/div/div[2]/a")
	public WebElement readMoreBtn;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[4]/div/div/div[2]/div[1]/div/div/p")
	public WebElement artiInteLnk;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[4]/div/div/div[2]/div[3]/div/div/p")
	public WebElement businessInteLnk;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[4]/div/div/div[2]/div[4]/div/div/p")
	public WebElement dataEngineerLnk;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[4]/div/div/div[2]/div[2]/div/div/p")
	public WebElement dataScienceLnk;
	
	public String artiIntePage_title = "Artificial Intelligence";
	public String businessIntePage_title = "Business Intelligence";
	public String dataEngineer_title = "Data Engineering";
	public String dataSciencePage_title = "Data Science And Analytics Solutions";
	public String dataSciencePage_bannertitle = "Data Science and Analytics Solutions";
	public String companyPage_title = "Company";
	public String blogPage_title = "Blog";
	public String careersPage_title = "Careers";
	public String DrParser_title = "CV Parsing";
	public String contactPage_title = "Contact";
	
	
	
	WaitHelper waitHelper;

	public navigationmenu(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void hoverservicesNav() {
		waitHelper.WaitForElement(this.servicesNav, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(servicesNav).build().perform();
	}
	
	public void clickartiInteNav() throws InterruptedException {
		waitHelper.WaitForElement(this.artiInteNav, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(artiInteNav).click().build().perform();
	    Thread.sleep(2000);
	}
	
	
	public void clickbusinessInteNav() throws InterruptedException {
		waitHelper.WaitForElement(this.businessInteNav, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(businessInteNav).click().build().perform();
	    Thread.sleep(2000);
	}
	
	public void clickdataEngineerNav() throws InterruptedException {
		waitHelper.WaitForElement(this.dataEngineerNav, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(dataEngineerNav).click().build().perform();
	    Thread.sleep(2000);
	}
	
	public void clickdataScienceNav() throws InterruptedException {
		waitHelper.WaitForElement(this.dataScienceNav, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(dataScienceNav).click().build().perform();
	    Thread.sleep(2000);
	}
	
	public void clickcompanyNav() throws InterruptedException {
		waitHelper.WaitForElement(this.companyNav, 3);
		this.companyNav.click();
		Thread.sleep(2000);
	}
	
	public void clickblogNav() throws InterruptedException {
		waitHelper.WaitForElement(this.blogNav, 3);
		this.blogNav.click();
		Thread.sleep(2000);
	}
	
	public void clickcareersNav() throws InterruptedException {
		waitHelper.WaitForElement(this.careersNav, 3);
		this.careersNav.click();
		Thread.sleep(2000);
	}
	
	public void clickcontactNav() throws InterruptedException {
		waitHelper.WaitForElement(this.contactNav, 3);
		this.contactNav.click();
		Thread.sleep(2000);
	}
	
	public void hoverProductsNav() {
		waitHelper.WaitForElement(this.productsNav, 30);
		Actions act= new Actions(driver);
	    act.moveToElement(productsNav).build().perform();
	}
	
	public void clickdrParserNav() throws InterruptedException {
		waitHelper.WaitForElement(this.drParserNav, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(drParserNav).click().build().perform();
		Thread.sleep(1000);
	}
	
	public void clickCheckOutPackagesBtn() throws InterruptedException {
		waitHelper.WaitForElement(this.checkOutPackageBtn, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(checkOutPackageBtn).click().build().perform();
	    Thread.sleep(1000);
	}
	
	public void clickOurBenefitsBtn() throws InterruptedException {
		waitHelper.WaitForElement(this.ourBenefitsBtn, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(ourBenefitsBtn).click().build().perform();
	    Thread.sleep(1000);
	}
	
	public void clickReadMorePositionBtn() throws InterruptedException {
		waitHelper.WaitForElement(this.readMoreBtn, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(readMoreBtn).click().build().perform();
	    Thread.sleep(1000);
	}
	
	public void isBeingArtificialIntelligencePage() throws InterruptedException {
	    String actTitle= driver.getTitle();
	    assertTrue(actTitle.contains(artiIntePage_title));
	    assertTrue(banner.getText().contains(artiIntePage_title));
	    Thread.sleep(1000);
	}
	
	public void isBeingBusinessIntelligencePage() {
	    String actTitle= driver.getTitle();
	    assertTrue(actTitle.contains(businessIntePage_title));
	    assertTrue(banner.getText().contains(businessIntePage_title));
	}
	
	public void isBeingDataEngineeringPage() throws InterruptedException {
		Thread.sleep(2000);
	    String actTitle= driver.getTitle();
	    assertTrue(actTitle.contains(dataEngineer_title));
	    assertTrue(banner.isDisplayed());
	}

	public void isBeingDataScienceAndAnalyticsSolutionsPage() {
	    String actTitle= driver.getTitle();
	    assertTrue(actTitle.contains(dataSciencePage_title));
	    Assert.assertEquals(dataSciencePage_bannertitle, banner.getText());
	}
	
	public void isBeingCompanyPage() {
	    String actTitle= driver.getTitle();
	    assertTrue(actTitle.contains(companyPage_title));
	}
	
	public void isBeingBlogPage() {
	    String actTitle= driver.getTitle();
	    assertTrue(actTitle.contains(blogPage_title));
	}
	
	public void isBeingCareersPage() throws InterruptedException {
		Thread.sleep(2000);
	    String actTitle= driver.getTitle();
	    System.out.print(actTitle);
	    assertTrue(actTitle.contains(careersPage_title));
	}
	
	public void isBeingContactPage() {
	    String actTitle= driver.getTitle();
	    assertTrue(actTitle.contains(contactPage_title));
	}
	
	public void isBeingDrParserPage() throws InterruptedException {
		Thread.sleep(2000);
	    String actTitle= driver.getTitle();
	    System.out.println(actTitle);
	    assertTrue(actTitle.contains(DrParser_title));

	}
	
	public void clickartiInteLnk() {
		waitHelper.WaitForElement(this.artiInteLnk, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(artiInteLnk).click().build().perform();
	}
	
	
	public void clickbusinessInteLnk() {
		waitHelper.WaitForElement(this.businessInteLnk, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(businessInteLnk).click().build().perform();
	}
	
	public void clickdataEngineerLnk() {
		waitHelper.WaitForElement(this.dataEngineerLnk, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(dataEngineerLnk).click().build().perform();
	}
	
	public void clickdataScienceLnk() {
		waitHelper.WaitForElement(this.dataScienceLnk, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(dataScienceLnk).click().build().perform();
	}	
}
