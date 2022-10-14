package com.DrParser.stepdefinitions;

import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;
import com.DrParser.pageObjects.navigationmenu;
import com.DrParser.pageObjects.position;
import com.DrParser.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class positionStepDefinitions  extends TestBase  {

	position position = new position(driver);
	navigationmenu Navigation = new navigationmenu(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@Given("^Be on the Careers page$")
	public void be_on_the_Careers_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.clickcareersNav();
	}

	@When("^Click on name of position link$")
	public void click_on_name_of_position_link() throws Throwable {
	    position.Scrolldown();
	}

	@Then("^I am navigated to page of respectively position$")
	public void i_am_navigated_to_page_of_respectively_position() throws Throwable {
	    position.compareCapacity();
	}
	
}
