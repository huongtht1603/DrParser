package com.DrParser.stepdefinitions;

import static org.testng.Assert.assertTrue;

import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;
import com.DrParser.pageObjects.navigationmenu;
import com.DrParser.pageObjects.subcribe;
import com.DrParser.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class subcribeStepDefinitions extends TestBase {


	navigationmenu Navigation = new navigationmenu(driver);
	subcribe Subcribe = new subcribe(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	
	@Given("^Be on a Packages page$")
	public void be_on_a_Packages_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverProductsNav();
		Navigation.clickdrParserNav();
		Navigation.clickCheckOutPackagesBtn();
	}

	@When("^click on contact us button$")
	public void click_on_contact_us_button() throws Throwable {
	    Subcribe.clickContactUsBtn();
	}

	@When("^Entering invalid data to first name field$")
	public void entering_invalid_data_to_first_name_field() throws Throwable {
		Subcribe.enterFirstName();
	}
	
	@When("^Entering invalid data to last name field$")
	public void entering_to_last_name_field() throws Throwable {
		Subcribe.enterLastName();
	}

	@Then("^I see error message as \"([^\"]*)\"$")
	public void i_see_error_message_as(String arg1) throws Throwable {
		assertTrue(Subcribe.getMsg1().equals(arg1));
	}
	
	@Then("^I see an error message as \"([^\"]*)\"$")
	public void i_see_an_error_message_as(String arg1) throws Throwable {
		assertTrue(Subcribe.getMsg2().equals(arg1));
	}
	
	@When("^Entering invalid data to email field$")
	public void entering_to_email_field() throws Throwable {
		Subcribe.enterEmail();
	}
	
	@When("^Entering invalid data to an email field$")
	public void entering_to_an_email_field() throws Throwable {
		Subcribe.enterEmail1();
	}
	
	@When("^Entering invalid data to the email field$")
	public void entering_to_the_email_field() throws Throwable {
		Subcribe.enterEmail2();
	}
	
	@Then("^I see an error message \"([^\"]*)\" displayed$")
	public void i_see_an_error_message_displayed(String arg1) throws Throwable {
		assertTrue(Subcribe.getMsg3().equals(arg1));
	}
	
	@When("^Entering an invalid data to email field$")
	public void entering_an_invalid_data_to_email_field() throws Throwable {
		Subcribe.enterEmail3();
	}
	
	@When("^Entering the invalid data to email field$")
	public void entering_the_invalid_email_to_email_field() throws Throwable {
		Subcribe.enterEmail4();
	}
	
	@When("^Entering the invalid data to phone number field$")
	public void entering_the_invalid_data_to_phone_number_field() throws Throwable {
		Subcribe.enterPhoneNumber();
	}

	@When("^Entering the invalid data to an phone number field$")
	public void entering_the_invalid_data_to_an_phone_number_field() throws Throwable {
		Subcribe.enterPhoneNumber1();
	}

	@When("^Entering the invalid data to the phone number field$")
	public void entering_the_invalid_data_to_the_phone_number_field() throws Throwable {
		Subcribe.enterPhoneNumber2();
	}
	
	@Then("^I see an error message as \"([^\"]*)\" displayed$")
	public void i_see_an_error_message_as_displayed(String arg1) throws Throwable {
		Thread.sleep(1000);
		assertTrue(Subcribe.getMsg4().equals(arg1));
	}
	
	@When("^Click on cancel button$")
	public void click_on_cancel_button() throws Throwable {
	    Subcribe.clickCancelBtn();
	}

	@Then("^I am taken back to packages pages$")
	public void i_am_taken_back_to_packages_pages() throws Throwable {
		Subcribe.isTakenToPackagesPage();
	}

	@When("^Press on Escape key$")
	public void press_on_Escape_key() throws Throwable {
		Subcribe.pressEscapeKey();
	}

	@When("^Click on outside popup$")
	public void click_on_outside_popup() throws Throwable {
	    Subcribe.clickContactUsBtn();
	}

}
