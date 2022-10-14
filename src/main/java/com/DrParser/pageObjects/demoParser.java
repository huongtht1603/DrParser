package com.DrParser.pageObjects;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.DrParser.helper.AbstractPage;
import com.DrParser.helper.WaitHelper;

public class demoParser extends AbstractPage{
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section[2]/div/div/div/button[1]")
	public WebElement demoBtn;
	
	@FindBy(xpath="//*[@id='upload']/p/label/strong")
	public WebElement browserBtn;
	
	@FindBy(xpath="//*[@id='upload']/p/p/strong")
	public WebElement uploadFileName;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/div[2]/section/form/button")
	public WebElement parseCVBtn;
	
	@FindBy(xpath="//*[@id='parse']")
	public WebElement CVParsingCompletedBtn;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/div[2]/section[2]/div/div[1]/button[1]")
	public WebElement parsedResultBtn;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/div[2]/section[2]/div/div[1]/button[2]")
	public WebElement responseJsonBtn;

	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/button[1]/span[1]")
	public WebElement rawJsonTab;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/div[2]/section[2]/div/div[2]/div[1]/div[2]/div/button[2]/span[1]")
	public WebElement beautifulJsonTab;
	
	@FindBy(xpath="//*[@id='upload']/p/span")
	public WebElement startOverLnk;
	
	@FindBy(xpath="//p[contains(text(),'Please select')]")
	public WebElement msg;
	
	
	public String pdf1= "C:\\Users\\huong.tran\\desktop\\upload1.exe";
	public String pdf1name= "Bui Quoc Khanh";
	
	public String pdf2= "C:\\Users\\huong.tran\\desktop\\upload3.exe";
	public String pdf2name= "Bui-Phan-Tho";
	
	public String nonpdf= "C:\\Users\\huong.tran\\desktop\\upload2.exe";
	public String expectedMsg= "Please select PDF file only";
	WaitHelper waitHelper;

	public demoParser(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void clickDemoBtn() throws InterruptedException{
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",demoBtn);
		 js.executeScript("arguments[0].click();",demoBtn);
		 Thread.sleep(5000);
		 if(!driver.findElements(By.xpath("/html/body/div[3]/div/div/div")).isEmpty()){
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.ESCAPE).build().perform();
		}
	}
	
	public void uploadPdfCV() throws InterruptedException, IOException, AWTException {
		Thread.sleep(1000);
		waitHelper.WaitForElement(this.browserBtn, 4);
		Actions act= new Actions(driver);
	    act.moveToElement(browserBtn).click().build().perform();
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec(pdf1);
	}
	
	public void clickParseCVBtn() throws InterruptedException {
		Thread.sleep(3000);
		waitHelper.WaitForElement(this.parseCVBtn, 4);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",parseCVBtn);
		 js.executeScript("arguments[0].click();",parseCVBtn);
	}

	public void clickstartOverLnk() throws InterruptedException {
		Thread.sleep(1000);
		waitHelper.WaitForElement(this.startOverLnk, 4);
		Actions act= new Actions(driver);
	    act.moveToElement(startOverLnk).click().build().perform();
	}
		
	public void isParseCompletely() throws InterruptedException {
		Thread.sleep(20000);
		assertTrue(uploadFileName.getText().contains(pdf1name));
		assertTrue(CVParsingCompletedBtn.isDisplayed());
		assertTrue(parsedResultBtn.isDisplayed());
	}
	
	
	public void uploadNonPdfCV() throws InterruptedException, IOException, AWTException {
		waitHelper.WaitForElement(this.browserBtn, 4);
		Actions act= new Actions(driver);
	    act.moveToElement(browserBtn).click().build().perform();
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec(nonpdf);
	    Thread.sleep(15000);
	}
	
	public void uploadAnotherPdfCV() throws InterruptedException, IOException, AWTException {
		Thread.sleep(10000);
		waitHelper.WaitForElement(this.browserBtn, 4);
		Actions act= new Actions(driver);
	    act.moveToElement(browserBtn).click().build().perform();
	    Thread.sleep(1000);
	    Runtime.getRuntime().exec(pdf2);
	}
	
	public void isMessageDisplayed() {
		waitHelper.WaitForElement(this.msg, 4);
	    assertTrue(msg.getText().contains(expectedMsg));
	}
	
	public void isFileNameDisplayed() {
		waitHelper.WaitForElement(this.uploadFileName, 4);
		assertTrue(uploadFileName.getText().contains(pdf1name));
	}
	
	public void isAnotherFileNameDisplayed() throws InterruptedException {
		waitHelper.WaitForElement(this.uploadFileName, 4);
		Thread.sleep(10000);
		assertTrue(uploadFileName.getText().contains(pdf2name));
	}
	
	public void isFileNameRemoved() throws InterruptedException {
		waitHelper.WaitForElement(this.parseCVBtn, 4);
		Assert.assertEquals(false, parseCVBtn.isEnabled());
	}
}
