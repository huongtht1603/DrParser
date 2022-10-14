Feature: As a user I can be redirected to expected page when clicking on navigation

	Scenario: TC_04 Verify system can navigate user to Artificial Intelligence page by clicking on  Artificial Intelligence navigation
	  	Given Being on the page
	  	When hover on Services navigation
	  	And Select Artificial Intelligence for Services
	    Then Being on Artificial Intelligence page
	    
	Scenario: TC_05 Verify system can navigate user to Business Intelligence page by clicking on Business Intelligence navigation
	  	Given Being on the page
	  	When hover on Services navigation
	  	And Select Business Intelligence for Services
	    Then Being on Business Intelligence page

	Scenario: TC_06 Verify system can navigate user to Data Engineering page by clicking on Data Engineering navigation
	  	Given Being on the page
	  	When hover on Services navigation
	  	And Select Data Engineering for Services
	    Then Being on Data Engineering page
	    
	Scenario: TC_07 Verify system can navigate user to Data Science And Analytics Solutions page by clicking on Data Science And Analytics Solutions navigation
	  	Given Being on the page
	  	When hover on Services navigation
	  	And Select Data Science and Analytics Solutions for Services
	    Then Being on Data Science and Analytics Solutions page

		Scenario: TC_08 Verify system can navigate user to Artificial Intelligence page by clicking on its name On services
	  	Given Being on the page
	  	When Click Artificial Intelligence link on services section
	    Then Being on Artificial Intelligence page

	Scenario: TC_09 Verify system can navigate user to Business Intelligence page by clicking on its name On services
	  	Given Being on the page
	  	When Click Business Intelligence link on services section
	    Then Being on Business Intelligence page

	Scenario: TC_10 Verify system can navigate user to Data Engineering page by clicking on its name On services
	  	Given Being on the page
	  	When Click Data Engineering link on services section
	    Then Being on Data Engineering page

	Scenario: TC_11 Verify system can navigate user to Data Science And Analytics Solutions page by clicking on its name On services
	  	Given Being on the page
	  	When Click Data Science and Analytics Solutions link on services section
	    Then Being on Data Science and Analytics Solutions page
	    
		Scenario: TC_12 Verify user is navigated to Company page when clicking on Company navigation
	  	Given Being on the page
	  	When Click on Company navigation
	    Then Being on Company page
	
		Scenario: TC_13 Verify user is navigated to Blog page when clicking on Blog navigation
	  	Given Being on the page
	  	When Click on Blog navigation
	    Then Being on Blog page
	    
	  Scenario: TC_14 Verify user is navigated to Careers page when clicking on Careers navigation
	  	Given Being on the page
	  	When Click on Careers navigation
	    Then Being on Careers page
	    
	   	Scenario: TC_15 Verify system can navigate user to Dr Parser product page by selecting "Dr Parser" for Products
	  	Given Being on the page
	  	When hover on Products navigation
	  	And Select DrParser for Services
	    Then Being on DrParser page
	    
	   Scenario: TC_16 Verify user is navigated to Contact page when clicking on Contact navigation
	  	Given Being on the page
	  	When Click on Contact navigation
	    Then Being on Contact page
	

	
