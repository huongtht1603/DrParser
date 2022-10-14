Feature: As a user I can search blog with keyword


	Scenario: TC_45 Verify search function of blog page when providing valid keyword

	  	Given Being on the blog page
	    And Enter "Python" to searchbox
	  	Then I see results related to keyword
	  	

  Scenario Outline: TC_46 Verify search function of blog page when providing invalid keyword
  		Given Being on the blog page
	    And Entering <keyword> to searchbox
	  	Then I see no result displayed

    Examples: 
      | keyword  |
      | abc125   |
      | abc!@^&  |
      | Pythons  |
      