package com.DrParser.stepdefinitions;

import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;
import com.DrParser.pageObjects.navigationmenu;
import com.DrParser.pageObjects.searchFunction;
import com.DrParser.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class searchFunctionStepDefinitions extends TestBase {


	navigationmenu Navigation = new navigationmenu(driver);
	searchFunction searchFunction = new searchFunction(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^Being on a page$")
	public void being_on_a_page() throws Throwable {
	    driver.navigate().to(Constants.base_URL);
	}

	@When("^Click on the Blog navigation$")
	public void click_on_the_Blog_navigation() throws Throwable {
		Navigation.clickblogNav();
	}

	@Then("^Being on the Blog page$")
	public void being_on_the_Blog_page() throws Throwable {
		Navigation.clickblogNav();
	}
	
	@When("^Enter \"([^\"]*)\" to searchbox$")
	public void enter_to_searchbox(String arg1) throws Throwable {
	    searchFunction.enterKeyword(arg1);
	}

	@Then("^I see results related to keyword$")
	public void i_see_results_related_to_keyword() throws Throwable {
		searchFunction.isResultCorrectly();
	}

	@Then("^I see no result displayed$")
	public void I_see_no_result_displayed() throws Throwable {
		searchFunction.isResultCorrectly();
	}

	@When("^Entering (.+) to searchbox$")
	public void entering_to_searchbox(String keyword) throws Throwable {
		searchFunction.enterKeyword(keyword);
	}


}
