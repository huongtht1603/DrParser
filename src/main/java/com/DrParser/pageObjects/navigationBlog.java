package com.DrParser.pageObjects;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.DrParser.helper.AbstractPage;
import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;

public class navigationBlog extends AbstractPage{
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[2]/article/article/div[2]/a/p")
	public WebElement readMoreLnk;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[2]/article/article/div[2]/h2")
	public WebElement nameOfPost;
	
	@FindBy(css = ".article-header__metadata__title")
	public WebElement act_nameOfPost;
	
	@FindBy(xpath = "//*[@id='gatsby-focus-wrapper']/main/section/section[2]/div[1]/div[2]/div/div")
	public List <WebElement> PostList;
	
	
	@FindBy(xpath = "//*[@id='gatsby-focus-wrapper']/main/section/section[2]/div/div[2]/div")
	public List <WebElement> listInTab;
	
	@FindBy(xpath = "//*[@id='gatsby-focus-wrapper']/main/section/section[2]/div/div[2]/div/div")
	public List <WebElement> list2InTab;
	
	@FindBy(xpath ="//*[@id='gatsby-focus-wrapper']/main/section/section[2]/article/article/div[2]/div/a/p")
	public WebElement newPost_topic;
	
	
	@FindBy(xpath ="//*[@id='gatsby-focus-wrapper']/main/section/div/ul/li[3]/a")
	public WebElement Pagination2;
	
	
	@FindBy(xpath ="//a[@rel='next']")
	public WebElement next_Pagination;
	
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[2]/div[1]/div[1]/ul/a[1]/li")
	public WebElement allTab;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[2]/div[1]/div[1]/ul/a[2]/li")
	public WebElement AITab;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[2]/div[1]/div[1]/ul/a[3]/li")
	public WebElement DATab;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[2]/div[1]/div[1]/ul/a[4]/li")
	public WebElement DLTab;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[2]/div[1]/div[1]/ul/a[5]/li")
	public WebElement MLTab;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/footer/div/div[1]/div/div[2]/a")
	public WebElement contactUsNowBtn;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section/section[1]/div/div/div/div/div/h1")
	public WebElement Header;
	
	WaitHelper waitHelper;

	String expect_name;

	public navigationBlog(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
	}

	public void ScrollDown() throws InterruptedException {
		waitHelper.WaitForElement(this.AITab, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",AITab);
	    Thread.sleep(1000);
	}
	
	public void clickAITab() throws InterruptedException {
		Thread.sleep(2000);
		waitHelper.WaitForElement(this.AITab, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",AITab);
	}
	
	public void clickDATab() throws InterruptedException {
		Thread.sleep(2000);
		waitHelper.WaitForElement(this.DATab, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",DATab);
		js.executeScript("arguments[0].click();",DATab);
	}
	
	public void clickDLTab() throws InterruptedException {
		Thread.sleep(2000);
		waitHelper.WaitForElement(this.DLTab, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",DLTab);
		js.executeScript("arguments[0].click();",DLTab);
	}
	
	public void clickMLTab() throws InterruptedException {
		Thread.sleep(2000);
		waitHelper.WaitForElement(this.MLTab, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",MLTab);
		js.executeScript("arguments[0].click();",MLTab);
	}
	
	public String getNameOfPost() {
		String name= nameOfPost.getText().toLowerCase();
		return name;
	}
	
	public String getActualNameOfPost() {
		String name= act_nameOfPost.getText().toLowerCase();
		return name;
	}
	
	public void clickReadMoreLnk() throws InterruptedException {
		waitHelper.WaitForElement(this.readMoreLnk, 3);
		this.readMoreLnk.click();
	    Thread.sleep(3000);
	}
	
	public void clickPostNameAndComparePostName(String i) throws InterruptedException {
		if (Integer.parseInt(i)<PostList.size()+1){
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",allTab);
		String expect_name = driver.findElement(By.xpath("//div[" + i + "]/div/div[2]/div[2]/h3/a")).getText().toLowerCase();
		driver.findElement(By.xpath("//div[" + i + "]/div/div[2]/div[2]/h3/a")).click();
		Thread.sleep(1000);
		String actual_name = driver.findElement(By.cssSelector(".article-header__metadata__title")).getText().toLowerCase();
		assertTrue(actual_name.contains(expect_name));
		}
		}

	public void clickNextPagination() throws InterruptedException {
		waitHelper.WaitForElement(this.next_Pagination, 3);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",next_Pagination);
		 if(next_Pagination.isEnabled()) {
		Thread.sleep(2000);
		 js.executeScript("arguments[0].click();",next_Pagination);
		 }
	}
	
	public void listPost() {
		
	}
	
	public int sumAITopics() {
		int AITopicsNo =0;
		if (newPost_topic.getText().equals("ARTIFICIAL INTELLIGENCE")) {
			AITopicsNo = 1;
		}
		List<postObj> listOfPost = new ArrayList<>();
		
		for (int i = 0; i < PostList.size(); i++) {		
		String postname = PostList.get(i).findElement(By.xpath("div/div/h3/a")).getText(); 	
		String postTopic = PostList.get(i).findElement(By.xpath("div/div/a/p")).getText();	
		if (postTopic.equals("ARTIFICIAL INTELLIGENCE")) {
			AITopicsNo++;
		}
		
		postObj p = new postObj(postname, postTopic);
		listOfPost.add(p);	
	}
		return AITopicsNo;
	}
	
	public int sumMLTopics() {
		int MLTopicsNo =0;
		if (newPost_topic.getText().equals("MACHINE LEARNING")) {
			MLTopicsNo = 1;
		}

		List<postObj> listOfPost = new ArrayList<>();
		
		for (int i = 0; i < PostList.size(); i++) {		
		String postname = PostList.get(i).findElement(By.xpath("div/div/h3/a")).getText(); 	
		
		String postTopic = PostList.get(i).findElement(By.xpath("div/div/a/p")).getText();	
		if (postTopic.equals("MACHINE LEARNING")) {
			MLTopicsNo++;
		}
		
		postObj p = new postObj(postname, postTopic);
		listOfPost.add(p);	
	}
		return MLTopicsNo;
	}
	
	public int sumDATopics() {
		int DATopicsNo =0;
		if (newPost_topic.getText().equals("DATA SCIENCE AND ANALYTICS")) {
			DATopicsNo = 1;
		}

		List<postObj> listOfPost = new ArrayList<>();
		
		for (int i = 0; i < PostList.size(); i++) {		
		String postname = PostList.get(i).findElement(By.xpath("div/div/h3/a")).getText(); 	
		
		String postTopic = PostList.get(i).findElement(By.xpath("div/div/a/p")).getText();	
		if (postTopic.equals("DATA SCIENCE AND ANALYTICS")) {
			DATopicsNo++;
		}
		
		postObj p = new postObj(postname, postTopic);
		listOfPost.add(p);	
	}
		return DATopicsNo;
	}
	
	public int sumDLTopics() {
		int DLTopicsNo =0;
		if (newPost_topic.getText().equals("DEEP LEARNING")) {
			DLTopicsNo = 1;
		}

		List<postObj> listOfPost = new ArrayList<>();
		
		for (int i = 0; i < PostList.size(); i++) {		
		String postname = PostList.get(i).findElement(By.xpath("div/div/h3/a")).getText(); 	
		
		String postTopic = PostList.get(i).findElement(By.xpath("div/div/a/p")).getText();	
		if (postTopic.equals("DEEP LEARNING")) {
			DLTopicsNo++;
		}
		
		postObj p = new postObj(postname, postTopic);
		listOfPost.add(p);	
	}
		return DLTopicsNo;
	}
	
	
	public int listInTabSize() throws InterruptedException{
		int size = listInTab.size();
		if (size == 9) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView(true);",next_Pagination);
			 js.executeScript("arguments[0].click();",next_Pagination);
			 Thread.sleep(2000);
			 int size2 = list2InTab.size();
			 return (9 + size2);
		}
		else return size;
	}
	
	public void isRedirectToTopicTabCorrectly() {
		assertTrue(Header.isDisplayed());
	}
		
}
	

	
