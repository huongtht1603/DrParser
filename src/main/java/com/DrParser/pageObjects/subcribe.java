package com.DrParser.pageObjects;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.DrParser.helper.AbstractPage;
import com.DrParser.helper.WaitHelper;

public class subcribe extends AbstractPage{
	
	private WebDriver driver;
	
	@FindBy(xpath="//*[@id='gatsby-focus-wrapper']/main/section[1]/div/div[2]/div[3]")
	public WebElement contactUsBtn;
	
	@FindBy(xpath="//*[@id='contact']/div[1]")
	public WebElement firstNameField;
	
	@FindBy(xpath="//*[@id='contact']/div[2]")
	public WebElement lastNameField;
	
	@FindBy(xpath="//*[@id='contact']/div[3]")
	public WebElement emailField;
	
	@FindBy(xpath="//*[@id='contact']/div[4]")
	public WebElement phoneNumberField;
	
	@FindBy(xpath="//*[@id='contact']/div[5]")
	public WebElement companyField;
	
	@FindBy(xpath="//*[@id='contact']/div[6]")
	public WebElement countryField;
	
	@FindBy(xpath="//*[@id='contact']/div[7]")
	public WebElement titleField;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div[3]/button[1]")
	public WebElement cancelBtn;
	
	@FindBy(xpath="/html/body/div[2]/div[3]/div/div[3]/button[2]")
	public WebElement subcribeBtn;
	
	@FindBy(xpath="//*[@id='input1-helper-text']")
	public WebElement msg1;
	
	@FindBy(xpath="//*[@id='input2-helper-text']")
	public WebElement msg2;
	
	@FindBy(xpath="//*[@id='input3-helper-text']")
	public WebElement msg3;
	
	@FindBy(xpath="//*[@id='input4-helper-text']")
	public WebElement msg4;
	
	
	public void isTakenToPackagesPage() {
		waitHelper.WaitForElement(this.contactUsBtn, 4);
		assertTrue(contactUsBtn.isDisplayed());
	}
	
	
	
	
	public void clickContactUsBtn() {
		waitHelper.WaitForElement(this.contactUsBtn, 4);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",contactUsBtn);
		js.executeScript("arguments[0].click();",contactUsBtn);
	}

	
	public static void setClipBoard( String file) {
		StringSelection obj= new StringSelection(file);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(obj, null);
	}
	
	public void paste() throws AWTException{
		Robot rb= new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

	}
	
	public void pressTabKey() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
	}
	
	public void pressEscapeKey() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();
	}
	
	public String invalid_1stname = "78bill";
	public String invalid_lastname = "bill^^##";
	
	public void enterFirstName() throws AWTException {
		waitHelper.WaitForElement(this.firstNameField, 4);
		pressTabKey();
		setClipBoard(invalid_1stname);
		paste();
	}
	
	public void enterLastName() throws AWTException {
		waitHelper.WaitForElement(this.firstNameField, 4);
		pressTabKey();
		pressTabKey();
		setClipBoard(invalid_lastname);
		paste();
	}
	

	public String invalid_email0 = "huongtht1603gmail.com";
	public String invalid_email1 = "huongtht1603gmailcom";
	public String invalid_email2 = "huongtht1603gmail";
	public String invalid_email3 = "huongtht1603@gmail..com";
	public String invalid_email4 = "huongtht1603@gmail.com.";
	
	public void enterEmail() throws AWTException {
		waitHelper.WaitForElement(this.emailField, 4);
		pressTabKey();
		pressTabKey();
		pressTabKey();
		setClipBoard(invalid_email0);
		paste();
	}
	
	public void enterEmail1() throws AWTException {
		waitHelper.WaitForElement(this.emailField, 4);
		pressTabKey();
		pressTabKey();
		pressTabKey();
		setClipBoard(invalid_email1);
		paste();
	}
	
	public void enterEmail2() throws AWTException {
		waitHelper.WaitForElement(this.emailField, 4);
		pressTabKey();
		pressTabKey();
		pressTabKey();
		setClipBoard(invalid_email2);
		paste();
	}
	
	public void enterEmail3() throws AWTException {
		waitHelper.WaitForElement(this.emailField, 4);
		pressTabKey();
		pressTabKey();
		pressTabKey();
		setClipBoard(invalid_email3);
		paste();
	}
	
	public void enterEmail4() throws AWTException {
		waitHelper.WaitForElement(this.emailField, 4);
		pressTabKey();
		pressTabKey();
		pressTabKey();
		setClipBoard(invalid_email4);
		paste();
	}
	
	public String invalid_phoneNo0 = "222";
	public String invalid_phoneNo1 = "+849842228602352652";
	public String invalid_phoneNo2 = "abc%%^^&&";
	
	public void enterPhoneNumber() throws AWTException {
		waitHelper.WaitForElement(this.emailField, 4);
		pressTabKey();
		pressTabKey();
		pressTabKey();
		pressTabKey();
		setClipBoard(invalid_phoneNo0);
		paste();
	}
	
	public void enterPhoneNumber1() throws AWTException {
		waitHelper.WaitForElement(this.emailField, 4);
		pressTabKey();
		pressTabKey();
		pressTabKey();
		pressTabKey();
		setClipBoard(invalid_phoneNo1);
		paste();
	}
	
	public void enterPhoneNumber2() throws AWTException {
		waitHelper.WaitForElement(this.emailField, 4);
		pressTabKey();
		pressTabKey();
		pressTabKey();
		pressTabKey();
		setClipBoard(invalid_phoneNo2);
		paste();
	}
	
	public void enterCompanyName(String input) {
		waitHelper.WaitForElement(this.companyField, 4);
		companyField.sendKeys(input);
	}
	
	public void enterCounTryName(String input) {
		waitHelper.WaitForElement(this.countryField, 4);
		countryField.sendKeys(input);
	}
	
	
	public void enterTitle(String input) {
		waitHelper.WaitForElement(this.titleField, 4);
		titleField.sendKeys(input);
	}
	
	
	public void selectCountry() throws InterruptedException {

		Select mSelect = new Select(countryField);

		int count = countryField.findElements(By.xpath("option")).size();

		int random = ThreadLocalRandom.current().nextInt(1, count + 1);	
		mSelect.selectByIndex(random - 1);

	}
	
	public void clickCancelBtn() {
		waitHelper.WaitForElement(this.cancelBtn, 4);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",cancelBtn);
		js.executeScript("arguments[0].click();",cancelBtn);
	}
	
	public void clickSubcribeBtn() {
		waitHelper.WaitForElement(this.subcribeBtn, 4);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",subcribeBtn);
		js.executeScript("arguments[0].click();",subcribeBtn);
	}
	

	public String getMsg1() {
		String actual_msg1 = msg1.getText();
		return actual_msg1;
	}
	
	public String getMsg2() {
		String actual_msg2 = msg2.getText();
		return actual_msg2;
	}
	
	public String getMsg3() {
		String actual_msg3 = msg3.getText();
		return actual_msg3;
	}
	
	public String getMsg4() {
		String actual_msg4 = msg4.getText();
		return actual_msg4;
	}
	
	WaitHelper waitHelper;

	public subcribe(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		
	}

}
