package com.DrParser.stepdefinitions;

import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;
import com.DrParser.pageObjects.backToTop;
import com.DrParser.pageObjects.demoParser;
import com.DrParser.pageObjects.navigationmenu;
import com.DrParser.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class backToTopStepDefinitions extends TestBase  {

	demoParser demoParser = new demoParser(driver);
	navigationmenu Navigation = new navigationmenu(driver);
	backToTop backToTop = new backToTop(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@Given("^Be on Artificial Intelligence page$")
	public void being_on_the_Artificial_Intelligence_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverservicesNav(); 
		Navigation.clickartiInteNav();
	}
	
	@Given("^Be on homepage$")
	public void be_on_homepage() throws Throwable {
		driver.navigate().to(Constants.base_URL);
	}

	@Then("^I am taken to the top of homepage$")
	public void i_am_taken_to_the_top_of_homepage() throws Throwable {
		backToTop.isTopOfHomePage();
	}
	
	@When("^Click on back to top button$")
	public void click_on_back_to_top_button() throws Throwable {
	    backToTop.clickBackToTopBtn();
	}

	@Then("^I am taken to the top of the Artificial Intelligence page$")
	public void i_am_taken_to_the_top_of_the_Artificial_Intelligence_page() throws Throwable {
		backToTop.isTopOfArtificialIntelligencePage();
	}
	
	@Given("^Be on Business Intelligence page$")
	public void being_on_the_Business_Intelligence_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverservicesNav(); 
		Navigation.clickbusinessInteNav();
	}
	
	@Then("^I am taken to the top of the Business Intelligence page$")
	public void i_am_taken_to_the_top_of_the_Business_Intelligence_page() throws Throwable {
		backToTop.isTopOfBusinessIntelligencePage();
	}
	
	@Given("^Be on Data Engineering page$")
	public void being_on_the_Data_Engineering_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverservicesNav(); 
		Navigation.clickdataEngineerNav();
	}
	
	@Then("^I am taken to the top of the Data Engineering page$")
	public void i_am_taken_to_the_top_of_the_Data_Engineering_page() throws Throwable {
		backToTop.isTopOfDataEngineeringPage();
	}
	
	@Given("^Be on Data Science and Analytics Solutions page$")
	public void being_on_the_Data_Science_and_Analytics_Solutions_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverservicesNav(); 
		Navigation.clickdataScienceNav();
	}
	
	@Then("^I am taken to the top of the Data Science and Analytics Solutions page$")
	public void i_am_taken_to_the_top_of_the_Data_Science_and_Analytics_Solutions_page() throws Throwable {
		backToTop.isTopOfDataSciencePage();
	}
	
	@Given("^Be on Company page$")
	public void being_on_the_Company_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcompanyNav();
	}
	
	@Then("^I am taken to the top of the Company page$")
	public void i_am_taken_to_the_top_of_the_Company_page() throws Throwable {
		backToTop.isTopOfCompanyPage();
	}
	
	@Given("^Be on Blog page$")
	public void being_on_the_Blog_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickblogNav();
	}
	
	@Then("^I am taken to the top of the Blog page$")
	public void i_am_taken_to_the_top_of_the_Blog_page() throws Throwable {
		backToTop.isTopOfBlogPage();
	}
	
	@Given("^Be on Careers page$")
	public void being_on_the_Careers_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcareersNav();
	}
	
	@Then("^I am taken to the top of the Careers page$")
	public void i_am_taken_to_the_top_of_the_Careers_page() throws Throwable {
		backToTop.isTopOfCareersPage();
	}

	@Given("^Be on DrParser product page$")
	public void being_on_the_DrParser_product_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverProductsNav();
		Navigation.clickdrParserNav();
	}
	
	@Then("^I am taken to the top of the DrParser product page$")
	public void i_am_taken_to_the_top_of_the_DrParser_product__page() throws Throwable {
		backToTop.isTopOfDrParserproductPage();
	}
	
	@Given("^Be on Demo DrParser product page$")
	public void being_on_the_Demo_DrParser_product_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverProductsNav();
		Navigation.clickdrParserNav();
		demoParser.clickDemoBtn();
		Thread.sleep(5000);
	}
	
	@Then("^I am taken to the top of the Demo DrParser product page$")
	public void i_am_taken_to_the_top_of_the_Demo_DrParser_product__page() throws Throwable {
		backToTop.isTopOfDemoDrParserproductPage();
	}
	

	@Given("^Be on Packages page$")
	public void be_on_Packages_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverProductsNav();
		Navigation.clickdrParserNav();
		Navigation.clickCheckOutPackagesBtn();
	}
	
	@Then("^I am taken to the top of the Packages page$")
	public void i_am_taken_to_the_top_of_the_Packages__page() throws Throwable {
		backToTop.isTopOfPackagesPage();
	}
	
	@Given("^Be on Contact page$")
	public void be_on_Contact_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcontactNav();
	}
	
	@Then("^I am taken to the top of the Contact page$")
	public void i_am_taken_to_the_top_of_the_Contact__page() throws Throwable {
		backToTop.isTopOfContactPage();
	}

	@Given("^Be on Employee benefits page$")
	public void be_on_the_Employee_benefits_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcareersNav();
		Navigation.clickOurBenefitsBtn();
	}
	
	@Then("^I am taken to the top of the Employee benefits page$")
	public void i_am_taken_to_the_top_of_the_Employee_benefits__page() throws Throwable {
		backToTop.isTopOfEmployeeBenefitsPage();
	}
	
	@Given("^Be on Position page$")
	public void be_on_the_Positions_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcareersNav();
		Navigation.clickReadMorePositionBtn();
	}
	
	@Then("^I am taken to the top of the Position page$")
	public void i_am_taken_to_the_top_of_the_Position__page() throws Throwable {
		backToTop.isTopOfPositionPage();
	}

	
	
}
