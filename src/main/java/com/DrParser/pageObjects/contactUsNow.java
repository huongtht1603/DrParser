package com.DrParser.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrParser.helper.AbstractPage;
import com.DrParser.helper.WaitHelper;

public class contactUsNow extends AbstractPage{
	
	private WebDriver driver;
	WaitHelper waitHelper;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/footer/div/div[1]/div/div[2]/a")
	public WebElement contactUsNowBtn;
	
	public void clickContactUsNowBtn() throws InterruptedException {
		waitHelper.WaitForElement(this.contactUsNowBtn, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",contactUsNowBtn);
		 js.executeScript("arguments[0].click();",contactUsNowBtn);
		 Thread.sleep(3000);
	}

	public contactUsNow(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
}
