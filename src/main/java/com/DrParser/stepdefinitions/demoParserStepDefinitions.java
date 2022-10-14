package com.DrParser.stepdefinitions;

import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;
import com.DrParser.pageObjects.navigationmenu;
import com.DrParser.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.DrParser.pageObjects.demoParser;

public class demoParserStepDefinitions extends TestBase  {

	demoParser demoParser = new demoParser(driver);
	navigationmenu Navigation = new navigationmenu(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
	@Given("^Being on page$")
	public void being_on_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
	}

	@When("^hovering on Products navigation$")
	public void hovering_on_Products_navigation() throws Throwable {
		Navigation.hoverProductsNav();
	}

	@When("^Selecting DrParser for Services$")
	public void selecting_DrParser_for_Services() throws Throwable {
		Navigation.clickdrParserNav();
	}

	@When("^Click on Demo DrParser button$")
	public void click_on_Demo_DrParser_button() throws Throwable {
		demoParser.clickDemoBtn();
	}
	
	
	@When("^browser a file from computer$")
	public void browser_a_file_from_computer() throws Throwable {
		demoParser.uploadPdfCV();
	}
	
	@When("^Click on parse CV button$")
	public void Click_on_parse_CV_button() throws Throwable {
		demoParser.clickParseCVBtn();
	}

	@Then("^I see output as below$")
	public void i_see_output_as_below() throws Throwable {
		demoParser.isParseCompletely();
	}
	
	@When("^browser a non pdf file from computer$")
	public void browser_a_non_pdf_file_from_computer() throws Throwable {
		demoParser.uploadNonPdfCV();
	}
	
	@Then("^I see an error message displayed$")
	public void i_see_an_error_message_displayed() throws Throwable {
		demoParser.isMessageDisplayed();
	}
	
	@Then("^I see the name of the selected file$")
	public void i_see_the_name_of_the_selected_file() throws Throwable {
		demoParser.isFileNameDisplayed();
	}

	@When("^browser another file from computer$")
	public void browser_another_file_from_computer() throws Throwable {
		demoParser.uploadAnotherPdfCV();
	}

	@Then("^I see the name of the newest selected file$")
	public void i_see_the_name_of_the_newest_selected_file() throws Throwable {
		demoParser.isAnotherFileNameDisplayed();
	}
	
	@When("^Click on Start over link$")
	public void click_on_Start_over_link() throws Throwable {
		demoParser.clickstartOverLnk();
	}

	@Then("^I see the name of the selected file is removed$")
	public void i_see_the_name_of_the_selected_file_is_removed() throws Throwable {
		demoParser.isFileNameRemoved();
	}
	
	
	
	
}
