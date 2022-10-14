package com.DrParser.stepdefinitions;

import static org.testng.Assert.assertTrue;

import com.DrParser.helper.Constants;
import com.DrParser.helper.WaitHelper;
import com.DrParser.pageObjects.navigationmenu;
import com.DrParser.pageObjects.navigationBlog;
import com.DrParser.testBase.TestBase;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class navigationBlogStepDefinitions extends TestBase {


	navigationmenu Navigation = new navigationmenu(driver);
	navigationBlog navigationBlog = new navigationBlog(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	String expected_nameOfPost, act_nameOfPost;
	int AI1, DA1, DL1, ML1, AI2, DA2, DL2, ML2, AI3, DA3, DL3, ML3;
	
    int AI_total,DA_total, DL_total, ML_total;
	
	@Given("^Being on blog page$")
	public void being_on_blog_page() throws Throwable {
		driver.navigate().to(Constants.blog_URL);
		Navigation.clickblogNav();
	}

	@When("^Click on Read More link$")
	public void click_on_Read_More_link() throws Throwable {
		expected_nameOfPost= navigationBlog.getNameOfPost();
	    navigationBlog.clickReadMoreLnk();
	}

	@Then("^I navigated to page of respectively post$")
	public void i_navigated_to_page_of_respectively_post() throws Throwable {
		act_nameOfPost= navigationBlog.getActualNameOfPost();
		System.out.println(act_nameOfPost);
		System.out.println(expected_nameOfPost);
		assertTrue(act_nameOfPost.contains(expected_nameOfPost));
	}

	@When("^Click on \"([^\"]*)\" post link and then I redirected to page of respectively post$")
	public void click_on_post_link(String arg1) throws Throwable {
		navigationBlog.clickPostNameAndComparePostName(arg1);
	}
	
	@When("^navigate to blog page$")
	public void navigate_to_blog_page() throws Throwable {
		driver.navigate().back();
	}
	
	@Given("^click on next pagination$")
	public void click_on_next_pagination() throws Throwable {
	    navigationBlog.clickNextPagination();
	}
	
	@When("^count number of post with respontively topics$")
	public void count_number_of_post_with_respontively_topics() throws Throwable {
		navigationBlog.ScrollDown();
	    AI1 = navigationBlog.sumAITopics();
	    DA1 = navigationBlog.sumDATopics();
	    DL1 = navigationBlog.sumDLTopics();
	    ML1 = navigationBlog.sumMLTopics();
	    navigationBlog.clickNextPagination();
	    AI2 = navigationBlog.sumAITopics();
	    DA2 = navigationBlog.sumDATopics();
	    DL2 = navigationBlog.sumDLTopics();
	    ML2 = navigationBlog.sumMLTopics();
	    navigationBlog.clickNextPagination();
	    AI3 = navigationBlog.sumAITopics();
	    DA3 = navigationBlog.sumDATopics();
	    DL3 = navigationBlog.sumDLTopics();
	    ML3 = navigationBlog.sumMLTopics();
	    AI_total = AI1 + AI2 + AI3;
	    DA_total = DA1 + DA2 + DA3;
	    DL_total = DL1 + DL2 + DL3;
	    ML_total = ML1 + ML2 + ML3; 
	}

	@Then("^Click on AI topic tab and compare results$")
	public void click_on_AI_topic_tab_and_compare_results() throws Throwable {
	    navigationBlog.clickAITab();
	    navigationBlog.isRedirectToTopicTabCorrectly();
	    assertTrue(AI_total == navigationBlog.listInTabSize());	 
	}
	
	@Then("^Click on DA topic tab and compare results$")
	public void click_on_DA_topic_tab_and_compare_results() throws Throwable {
	    navigationBlog.clickDATab();
	    navigationBlog.isRedirectToTopicTabCorrectly();
	    assertTrue(DA_total == navigationBlog.listInTabSize());	 	
	}
	
	@Then("^Click on DL topic tab and compare results$")
	public void click_on_DL_topic_tab_and_compare_results() throws Throwable {
	    navigationBlog.clickDLTab();
	    navigationBlog.isRedirectToTopicTabCorrectly();
	    assertTrue(DL_total == navigationBlog.listInTabSize());	 
	}
	
	@Then("^Click on ML topic tab and compare results$")
	public void click_on_ML_topic_tab_and_compare_results() throws Throwable {
	    navigationBlog.clickMLTab();
	    navigationBlog.isRedirectToTopicTabCorrectly();
	    assertTrue(ML_total == navigationBlog.listInTabSize());	
	}
	
}
