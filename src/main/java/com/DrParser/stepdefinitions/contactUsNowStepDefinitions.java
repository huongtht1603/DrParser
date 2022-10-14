package com.DrParser.stepdefinitions;

import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;
import com.DrParser.pageObjects.demoParser;
import com.DrParser.pageObjects.navigationmenu;
import com.DrParser.pageObjects.contactUsNow;
import com.DrParser.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactUsNowStepDefinitions extends TestBase  {

	demoParser demoParser = new demoParser(driver);
	navigationmenu Navigation = new navigationmenu(driver);
	contactUsNow contactUsNow = new contactUsNow(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@Given("^Be on the page$")
	public void Be_on_the_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
	}
	
	@Given("^Being on the Artificial Intelligence page$")
	public void being_on_the_Artificial_Intelligence_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverservicesNav(); 
		Navigation.clickartiInteNav();
	}

	@When("^Click on Contact us Now button$")
	public void click_on_Contact_us_Now_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    contactUsNow.clickContactUsNowBtn();
	}

	@Then("^Being on the Contact page$")
	public void being_on_the_Contact_page() throws Throwable {
		Navigation.isBeingContactPage();
	}

	@Given("^Being on the Business Intelligence page$")
	public void being_on_the_Business_Intelligence_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverservicesNav(); 
		Navigation.clickbusinessInteNav();
	}

	@Given("^Being on the Data Engineering page$")
	public void being_on_the_Data_Engineering_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverservicesNav(); 
		Navigation.clickdataEngineerNav();
	}

	@Given("^Being on the Data Science and Analytics Solutions page$")
	public void being_on_the_Data_Science_and_Analytics_Solutions_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverservicesNav(); 
		Navigation.clickdataScienceNav();
	}
	
	@Given("^Being on the Company page$")
	public void being_on_the_Company_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcompanyNav();
		
	}

	@Given("^Being on the blog page$")
	public void being_on_the_blog_page() throws Throwable {
		driver.navigate().to(Constants.blog_URL);
		Navigation.clickblogNav();
		
	}

	@Given("^Being on the careers page$")
	public void being_on_the_careers_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcareersNav();
	}

	@Given("^Being on the contact page$")
	public void being_on_the_contact_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcontactNav();
	}

	@Given("^Being on the DrParser product page$")
	public void being_on_the_DrParser_product_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverProductsNav();
		Navigation.clickdrParserNav();
	}

	@Given("^Being on the Demo DrParser product page$")
	public void being_on_the_Demo_DrParser_product_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverProductsNav();
		Navigation.clickdrParserNav();
		demoParser.clickDemoBtn();
		Thread.sleep(5000);
	}

	@Given("^Being on the packages page$")
	public void being_on_the_packages_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverProductsNav();
		Navigation.clickdrParserNav();
		Navigation.clickCheckOutPackagesBtn();
	}

	@Given("^Being on the Employee benefits page$")
	public void being_on_the_Employee_benefits_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcareersNav();
		Navigation.clickOurBenefitsBtn();
	}

	@Given("^Being on the position page$")
	public void being_on_the_position_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcareersNav();
		Navigation.clickReadMorePositionBtn();
	}
}

