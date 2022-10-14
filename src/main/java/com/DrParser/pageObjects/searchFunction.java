package com.DrParser.pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.DrParser.helper.AbstractPage;
import com.DrParser.helper.WaitHelper;

public class searchFunction extends AbstractPage{
	
	private WebDriver driver;
	
	@FindBy(id="search-value")
	public WebElement searchBtn;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[2]/div[1]/div[2]/div/div/div/div/h3/a")
	public List<WebElement> result;
	
	public void enterKeyword(String input) {
		waitHelper.WaitForElement(this.searchBtn, 4);
		searchBtn.click();
		searchBtn.sendKeys(input);
	}
	
	public void isResultCorrectly() {
		for (int i = 0; i < result.size(); i++) {
	        Assert.assertTrue(result.get(i).getText().contains("Python"), "Search result validation failed at instance [ + i + ].");
	}
	}
	
	public void isNoResultDisplayed() {
		int size = result.size();
		Assert.assertEquals(size, 0);
	}
	
	WaitHelper waitHelper;

	public searchFunction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

}
