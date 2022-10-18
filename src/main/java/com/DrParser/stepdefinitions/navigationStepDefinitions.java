package com.DrParser.stepdefinitions;

import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.DrParser.helper.WaitHelper;
import com.DrParser.pageObjects.navigationmenu;
import com.DrParser.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class navigationStepDefinitions extends TestBase {


	navigationmenu Navigation = new navigationmenu(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^Being on the page$")
	public void being_on_the_page() throws Throwable {
	    driver.navigate().to(Constants.base_URL);
	}

	@When("^hover on Services navigation$")
	public void hover_on_Services_navigation() throws Throwable {
		Navigation.hoverservicesNav();   
	    
	}

	@When("^Select Artificial Intelligence for Services$")
	public void select_Artificial_Intelligence_for_Services() throws Throwable {
		Navigation.clickartiInteNav();
	}

	@Then("^Being on Artificial Intelligence page$")
	public void being_on_Artificial_Intelligence_page() throws Throwable {
		Navigation.isBeingArtificialIntelligencePage();
	}
	
	@When("^Select Business Intelligence for Services$")
	public void select_Business_Intelligence_for_Services() throws Throwable {
		Navigation.clickbusinessInteNav();
	}

	@Then("^Being on Business Intelligence page$")
	public void being_on_Business_Intelligence_page() throws Throwable {
		Navigation.isBeingBusinessIntelligencePage();
	}

	@When("^Select Data Engineering for Services$")
	public void select_Data_Engineering_for_Services() throws Throwable {
		Navigation.clickdataEngineerNav();
	}
	
	@Then("^Being on Data Engineering page$")
	public void being_on_Data_Engineering_page() throws Throwable {
		Navigation.isBeingDataEngineeringPage();
	}

	@When("^Select Data Science and Analytics Solutions for Services$")
	public void select_Data_Science_and_Analytics_Solutions_for_Services() throws Throwable {
		Navigation.clickdataScienceNav();
	}

	@Then("^Being on Data Science and Analytics Solutions page$")
	public void being_on_Data_Science_and_Analytics_Solutions_page() throws Throwable {
		Navigation.isBeingDataScienceAndAnalyticsSolutionsPage();
	}

	@When("^Click on Company navigation$")
	public void click_on_Company_navigation() throws Throwable {
		Navigation.clickcompanyNav();
	}

	@Then("^Being on Company page$")
	public void being_on_Company_page() throws Throwable {
		Thread.sleep(2000);
		Navigation.isBeingCompanyPage();
	}

	@When("^Click on Blog navigation$")
	public void click_on_Blog_navigation() throws Throwable {
		Navigation.clickblogNav();
	}

	@Then("^Being on Blog page$")
	public void being_on_Blog_page() throws Throwable {
		Navigation.clickblogNav();
	}

	@When("^Click on Careers navigation$")
	public void click_on_Careers_navigation() throws Throwable {
		Navigation.clickcareersNav();
	}

	@Then("^Being on Careers page$")
	public void being_on_Careers_page() throws Throwable {
		Navigation.isBeingCareersPage();
	}

	@When("^hover on Products navigation$")
	public void hover_on_Products_navigation() throws Throwable {
		Navigation.hoverProductsNav();
	}

	@When("^Select DrParser for Services$")
	public void Select_drparser_for_Services() throws Throwable {
		Navigation.clickdrParserNav();
	}
	
	@Then("^Being on DrParser page$")
	public void being_on_DrParser_page() throws Throwable {
		Navigation.isBeingDrParserPage();
	}

	@When("^Click on Contact navigation$")
	public void click_on_Contact_navigation() throws Throwable {
		Navigation.clickcontactNav();
	}

	@Then("^Being on Contact page$")
	public void being_on_Contact_page() throws Throwable {
		Navigation.isBeingContactPage();
	}
	
	@When("^Click Artificial Intelligence link on services section$")
	public void click_Artificial_Intelligence_link_on_services_section() throws Throwable {
		Navigation.clickartiInteLnk();
	}

	@When("^Click Business Intelligence link on services section$")
	public void click_Business_Intelligence_link_on_services_section() throws Throwable {
		Navigation.clickbusinessInteLnk();
	}

	@When("^Click Data Engineering link on services section$")
	public void click_Data_Engineering_link_on_services_section() throws Throwable {
		Navigation.clickdataEngineerLnk();
	}

	@When("^Click Data Science and Analytics Solutions link on services section$")
	public void click_Data_Science_and_Analytics_Solutions_link_on_services_section() throws Throwable {
		Navigation.clickdataScienceLnk();
	}
	
	@When("^Click on Our benefits button$")
	public void click_on_Our_benefits_button() throws Throwable {
	   Navigation.clickOurBenefitsBtn();
	}

	@When("^Click on Open Positions button$")
	public void click_on_Open_Positions_button() throws Throwable {
	   Navigation.clickOpenPositionsBtn();
	}
	
	@Then("^Being Benefits page$")
	public void being_Benefits_page() throws Throwable {
	    Navigation.isBeingBenefitsPage();
	}
    
	@When("^Click on Check out our packages button$")
	public void click_on_Check_out_our_packages_button() throws Throwable {
		Navigation.clickCheckOutPackagesBtn();
	}
	
	@Then("^Being price package of DrParser page$")
	public void being_price_package_of_DrParser_page() throws Throwable {
		Navigation.isBeingPricingPage();
	}
	
	
}

