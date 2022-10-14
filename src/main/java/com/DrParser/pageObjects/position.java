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
	
	@SuppressWarnings("unlikely-arg-type")
	public void compareCapacity () throws InterruptedException {
		
		List<positionObj> listOfPosition = new ArrayList<>();
		
		for (int i = 0; i < PositionList.size(); i++) {	
			
		String positionname = PositionList.get(i).findElement(By.cssSelector("strong:nth-child(1)")).getText(); 					

		WebElement positionnameLnk= driver.findElement(By.cssSelector("strong:nth-child(1)"));
		
		String positioNo = PositionList.get(i).findElement(By.cssSelector("span:nth-child(2)")).getText();	
		int positionNumber = Integer.parseInt(positioNo);	
						
		WebElement readMoreBtn= driver.findElement(By.xpath("(//a[@class='custom-btn btn-apply'][contains(.,'READ MORE')])"));
		
		positionObj p = new positionObj(positionname, positionnameLnk, positionNumber, readMoreBtn);
		listOfPosition.add(p);	
		}
		
//		for (positionObj po:listOfPosition) {	
//			expect_name = po.getPositionName();
//			System.out.println(expect_name);
//			expect_no = po.getPositionNo();
//			System.out.println(expect_no);
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			waitHelper.WaitForElement(po.getWebElement2(), 3);
//			js.executeScript("arguments[0].click()", po.getWebElement2());
////			assertTrue(actual_positionName.getText().toUpperCase().equals(expect_name));
//			System.out.println(actual_positionName.getText().toUpperCase());
//			System.out.println(actual_positionNo.getText());
////			assertTrue(actual_positionNo.getText().equals(expect_no));
//			driver.navigate().back();
//			continue;
//			}
		System.out.println(listOfPosition.size());
		for (int i=0; i<listOfPosition.size(); i++){
			expect_name = listOfPosition.get(2).getPositionName();
			System.out.println(expect_name);
			expect_no = listOfPosition.get(2).getPositionNo();
			System.out.println(expect_no);
			Actions act= new Actions(driver);
		    act.moveToElement(listOfPosition.get(2).getWebElement2()).click().build().perform();
			System.out.println(actual_positionName.getText().toUpperCase());
			System.out.println(actual_positionNo.getText());
//			driver.navigate().back();
			break;
        }
			}

}
