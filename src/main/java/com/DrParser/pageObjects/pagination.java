package com.DrParser.pageObjects;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrParser.helper.AbstractPage;
import com.DrParser.helper.WaitHelper;

public class pagination extends AbstractPage{
	
	private WebDriver driver;
	WaitHelper waitHelper;
	
	@FindBy(xpath="//*[@id='panel-header-0']/div[2]/span[1]")
	public WebElement pagination1;
	
	@FindBy(xpath="//*[@id='panel1a-content-0']/div/p")
	public WebElement content1;
	
	@FindBy(xpath="//*[@id='panel-header-1']/div[2]/span[1]")
	public WebElement pagination2;
	
	@FindBy(xpath="//*[@id='panel1a-content-1']/div/p")
	public WebElement content2;
	
	@FindBy(xpath="//*[@id='panel-header-2']/div[2]/span[1]")
	public WebElement pagination3;
	
	@FindBy(xpath="//*[@id='panel1a-content-2']/div/p")
	public WebElement content3;
	
	@FindBy(xpath="//*[@id='panel-header-3']/div[2]/span[1]")
	public WebElement pagination4;
	
	@FindBy(xpath="//*[@id='panel1a-content-3']/div/p")
	public WebElement content4;
	
	@FindBy(xpath="//*[@id='panel-header-4']/div[2]/span[1]")
	public WebElement pagination5;
	
	@FindBy(xpath="//*[@id='panel1a-content-4']/div/p")
	public WebElement content5;
	
	@FindBy(xpath="//*[@id='panel-header-5']/div[2]/span[1]")
	public WebElement pagination6;
	
	@FindBy(xpath="//*[@id='panel1a-content-5']/div/p")
	public WebElement content6;
	
	
	@FindBy(xpath="//div[@class='MuiPaper-root MuiAccordion-root accordion-wrapper Mui-expanded MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded']//div[@id='panel-header-0']")
	public WebElement drparser_pagination1;
	
	@FindBy(xpath="//div[@class='MuiPaper-root MuiAccordion-root accordion-wrapper Mui-expanded MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded']//div[@id='panel-header-1']")
	public WebElement drparser_pagination2;
	
	@FindBy(xpath="//div[@class='MuiPaper-root MuiAccordion-root accordion-wrapper Mui-expanded MuiAccordion-rounded MuiPaper-elevation1 MuiPaper-rounded']//div[@id='panel-header-2']")
	public WebElement drparser_pagination3;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section[3]/div/article/div[1]/div[2]")
	public WebElement drparser_content1;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section[3]/div/article/div[2]/div[2]")
	public WebElement drparser_content2;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section[3]/div/article/div[3]/div[2]")
	public WebElement drparser_content3;
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	
	public void clickPagination1() throws InterruptedException {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",pagination1);
		 js.executeScript("arguments[0].click();",pagination1);
	}
	
	public void isContent1Displayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(content1.isDisplayed());
	}
	
	public void isContent1NotDisplayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertFalse(content1.isDisplayed());
	}
	
	public void clickPagination2() {
		waitHelper.WaitForElement(this.pagination2, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",pagination2);
		 js.executeScript("arguments[0].click();",pagination2);
	}
	
	public void isContent2Displayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(content2.isDisplayed());
	}
	
	public void isContent2NotDisplayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertFalse(content2.isDisplayed());
	}
	
	public void clickPagination3() {
		waitHelper.WaitForElement(this.pagination3, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",pagination3);
		 js.executeScript("arguments[0].click();",pagination3);
	}
	
	public void isContent3Displayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(content3.isDisplayed());
	}
	
	public void isContent3NotDisplayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertFalse(content3.isDisplayed());
	}
	
	public void clickPagination4() {
		waitHelper.WaitForElement(this.pagination4, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",pagination4);
		 js.executeScript("arguments[0].click();",pagination4);
	}
	
	public void isContent4Displayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(content4.isDisplayed());
	}
	
	public void isContent4NotDisplayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertFalse(content4.isDisplayed());
	}
	
	public void clickPagination5() {
		waitHelper.WaitForElement(this.pagination5, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",pagination5);
		 js.executeScript("arguments[0].click();",pagination5);
	}
	
	public void isContent5Displayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(content5.isDisplayed());
	}
	
	public void isContent5NotDisplayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertFalse(content5.isDisplayed());
	}
	
	public void clickPagination6() {
		waitHelper.WaitForElement(this.pagination6, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",pagination6);
		 js.executeScript("arguments[0].click();",pagination6);
	}
	
	public void isContent6Displayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(content6.isDisplayed());
	}
	
	public void isContent6NotDisplayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertFalse(content6.isDisplayed());
	}
	
	public void clickDrparsePagination1() {
		waitHelper.WaitForElement(this.pagination1, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(pagination1).click().build().perform();
	}
	
	public void clickDrparsePagination2() {
		waitHelper.WaitForElement(this.pagination1, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(pagination1).click().build().perform();
	}
	
	public void clickDrparsePagination3() {
		waitHelper.WaitForElement(this.pagination1, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(pagination1).click().build().perform();
	}
	
	public void isDrparseContent1Displayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(content5.isDisplayed());
	}
	
	public void isDrparseContent1NotDisplayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertFalse(content5.isDisplayed());
	}
	
	public void isDrparseContent2Displayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(content5.isDisplayed());
	}
	
	public void isDrparseContent2NotDisplayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertFalse(content5.isDisplayed());
	}
	
	public void isDrparseContent3Displayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertTrue(content5.isDisplayed());
	}
	
	public void isDrparseContent3NotDisplayed() throws InterruptedException {
		Thread.sleep(4000);
	    assertFalse(content5.isDisplayed());
	}

	public pagination(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

}
