package com.DrParser.testRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;


@CucumberOptions(
		
		features = { 
		"src/test/resources/features/navigation/backToTopBtn.feature",
		"src/test/resources/features/navigation/contactUsNow.feature",
		"src/test/resources/features/navigation/navigation.feature",
		"src/test/resources/features/navigation/pagination.feature",
		"src/test/resources/features/Demo DrParser/demoParser.feature",
		"src/test/resources/features/Blog/searchFunction.feature",
		"src/test/resources/features/subcribe/subcribe.feature",
		"src/test/resources/features/Blog/navigationBlog.feature",
		"src/test/resources/features/Careers/Position.feature"
			}  , 
		glue = { "com/DrParser/stepdefinitions" }, 
		plugin = {"pretty",
		 "html:target/cucumber-reports/cucumber.html", "json:target/cucumber-reports/CucumberTestReport.json", "rerun:rerun/failed_scenarios.txt" },
		monochrome = true, //display the console output in a proper readable format
		dryRun = false)//to check the mapping is proper between feature file and step def file
//		tags = ("@Testing"))
//		tags = ("@SmokeTest, @RegressionTest"))

 public class TestRunner { //extends AbstractTestNGCucumberTests {
	
	private TestNGCucumberRunner testNGCucumberRunner;
	   
	@BeforeClass(alwaysRun = true)
	public void setUpClass() {
		testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
	}
	
	@Test(groups = "cucumber", description = "Runs cucmber Features", dataProvider = "features")
	public void feature(CucumberFeatureWrapper cucumberFeature) {
		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
	}

	@DataProvider
	public Object[][] features() {
		return testNGCucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void testDownClass() {
		testNGCucumberRunner.finish();
	}

}
