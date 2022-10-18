package com.DrParser.pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrParser.helper.AbstractPage;
import com.DrParser.helper.WaitHelper;

public class position extends AbstractPage{
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section[1]/div[3]/div/div[2]/a")
	public WebElement readMoreLnk;
	
	@FindBy(xpath = "//*[@id='gatsby-focus-wrapper']/main/section[1]/div/div")
	public List <WebElement> PositionList;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/div[1]/div/div/h1")
	public WebElement actual_positionName;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/div[1]/div/div/div/span[2]")
	public WebElement actual_positionNo;
	
	
	
	WaitHelper waitHelper;

	public String expect_name;
	public int expect_no;
	
	
	public position(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}
	
	public void Scrolldown() {
		waitHelper.WaitForElement(this.readMoreLnk, 3);
		Actions act= new Actions(driver);
	    act.moveToElement(readMoreLnk).build().perform();

	}
	
	public void clickPositionAndCompareResult() throws InterruptedException {
		int size = PositionList.size();
		for (int i=1; i<size+1; i++) { 
		String expect_PositionName = driver.findElement(By.xpath("//div[" + i + "]/div/div[1]/div/a/strong")).getText().toLowerCase();
		String expect_PositionNo = driver.findElement(By.xpath("//div[" + i + "]/div/div[1]/p/span[2]")).getText();	
		driver.findElement(By.xpath("//div[" + i + "]/div/div[1]/div/a/strong")).click();
		Thread.sleep(1000);
		String actual_PositionName = actual_positionName.getText().toLowerCase();
		String actual_PositionNo = actual_positionNo.getText();
		assertTrue(actual_PositionName.contains(expect_PositionName));
		assertTrue(actual_PositionNo.contains(expect_PositionNo));
		driver.navigate().back();
		}
	}
	
	public void clickReadMoreAndCompareResult() throws InterruptedException {
		int size = PositionList.size();
		for (int i=1; i<size+1; i++) { 
		String expect_PositionName = driver.findElement(By.xpath("//div[" + i + "]/div/div[1]/div/a/strong")).getText().toLowerCase();
		String expect_PositionNo = driver.findElement(By.xpath("//div[" + i + "]/div/div[1]/p/span[2]")).getText();	
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();",driver.findElement(By.xpath("//*[@id='gatsby-focus-wrapper']/main/section[1]/div[" + i + "]/div/div[2]/a")));

		Thread.sleep(1000);
		String actual_PositionName = actual_positionName.getText().toLowerCase();
		String actual_PositionNo = actual_positionNo.getText();
		assertTrue(actual_PositionName.contains(expect_PositionName));
		assertTrue(actual_PositionNo.contains(expect_PositionNo));
		driver.navigate().back();	
		}
	}

}
