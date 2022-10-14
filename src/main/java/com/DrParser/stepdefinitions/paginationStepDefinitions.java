package com.DrParser.stepdefinitions;

import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;
import com.DrParser.pageObjects.pagination;
import com.DrParser.pageObjects.navigationmenu;
import com.DrParser.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class paginationStepDefinitions  extends TestBase  {

	pagination pagination = new pagination(driver);
	navigationmenu Navigation = new navigationmenu(driver);
	WaitHelper waitHelper = new WaitHelper(driver);

	@Given("^Be on the Packages page$")
	public void be_on_the_Packages_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverProductsNav();
		Navigation.clickdrParserNav();
		Navigation.clickCheckOutPackagesBtn();
	}
	
	@Given("^Be on the DrParser product page$")
	public void be_on_the_DrParser_product_page() throws Throwable {
		driver.navigate().to(Constants.base_URL);
		Navigation.hoverProductsNav();
		Navigation.clickdrParserNav();
	}

	@When("^Click on all expand paginations$")
	public void click_on_expand_pagination() throws Throwable {
		pagination.clickPagination1();
		pagination.clickPagination2();
		pagination.clickPagination3();
		pagination.clickPagination4();
		pagination.clickPagination5();
		pagination.clickPagination6();
	}

	@Then("^Detail of this section will be expanded$")
	public void detail_of_this_section_will_be_expanded() throws Throwable {
		pagination.isContent1Displayed();
		pagination.isContent2Displayed();
		pagination.isContent3Displayed();
		pagination.isContent4Displayed();
		pagination.isContent5Displayed();		
		pagination.isContent6Displayed();
	}

	@When("^Click on all collapse paginations$")
	public void click_on_collapse_pagination() throws Throwable {
		pagination.clickPagination1();
		pagination.clickPagination2();
		pagination.clickPagination3();
		pagination.clickPagination4();
		pagination.clickPagination5();
		pagination.clickPagination6();
	}

	@Then("^Detail of this section will be collapsed$")
	public void detail_of_this_section_will_be_collapsed() throws Throwable {
		pagination.isContent1NotDisplayed();
		pagination.isContent2NotDisplayed();
		pagination.isContent3NotDisplayed();
		pagination.isContent4NotDisplayed();
		pagination.isContent5NotDisplayed();
		pagination.isContent5NotDisplayed();
	}

}
