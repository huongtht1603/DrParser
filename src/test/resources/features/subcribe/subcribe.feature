
Feature: As a user, I can subcribe my information

	  Scenario: TC_103a Verify user can not subscribe his contact when providing numbers/ special characters to firstname fields
  		Given Be on a Packages page
  		When click on contact us button
	    And Entering invalid data to first name field
	  	Then I see error message as "Please enter plain text only"
	  	
	 	Scenario: TC_103b Verify user can not subscribe his contact when providing numbers/ special characters to lastname fields
  		Given Be on a Packages page
  		When click on contact us button
	    And Entering invalid data to last name field
	  	Then I see an error message as "Please enter plain text only"

	  Scenario: TC_104 Verify user can not subscribe his contact when providing invalid email format (missed @)
	    Given Be on a Packages page
  		When click on contact us button
	    And Entering invalid data to email field
	  	Then I see an error message "Invalid email format" displayed
	  	
	  Scenario: TC_105a Verify user can not subscribe his contact when providing invalid email format (missed '.' and domain)
	    Given Be on a Packages page
  		When click on contact us button
	    And Entering invalid data to an email field
	  	Then I see an error message "Invalid email format" displayed
	  	
	  Scenario: TC_105b Verify user can not subscribe his contact when providing invalid email format (missed '.' and domain)
	    Given Be on a Packages page
  		When click on contact us button
	    And Entering invalid data to the email field
	  	Then I see an error message "Invalid email format" displayed
	  	
	  Scenario: TC_106a Verify user can not subscribe his contact when providing email with 2 dots
	    Given Be on a Packages page
  		When click on contact us button
	    And Entering an invalid data to email field
	  	Then I see an error message "Invalid email format" displayed
	  	
	  Scenario: TC_106b Verify user can not subscribe his contact when providing email with 2 dots
	    Given Be on a Packages page
  		When click on contact us button
	    And Entering the invalid data to email field
	  	Then I see an error message "Invalid email format" displayed

	  Scenario: TC_108a Verify user can not subscribe his contact when providing invalid phone
	    Given Be on a Packages page
  		When click on contact us button
	    And Entering the invalid data to phone number field
	  	Then I see an error message as "Invalid phone number format" displayed
	  	
	  Scenario: TC_108b Verify user can not subscribe his contact when providing invalid phone
	    Given Be on a Packages page
  		When click on contact us button
	    And Entering the invalid data to an phone number field
	  	Then I see an error message as "Invalid phone number format" displayed
	  	
	  Scenario: TC_108c Verify user can not subscribe his contact when providing invalid phone
	    Given Be on a Packages page
  		When click on contact us button
	    And Entering the invalid data to the phone number field
	  	Then I see an error message as "Invalid phone number format" displayed

	  Scenario: TC_108c Verify user can not subscribe his contact when providing invalid phone
	    Given Be on a Packages page
  		When click on contact us button
  		And Entering the invalid data to the phone number field
	  	Then I see an error message as "Invalid phone number format" displayed

	  
	 	Scenario: TC_112a Verify user can cancel filling contact by clicking on "Cancel" button
	    Given Be on a Packages page
  		When click on contact us button
	    And Click on cancel button
	  	Then I am taken back to packages pages
	
	  Scenario: TC_112b Verify user can cancel filling contact by clicking on "Cancel" button
	    Given Be on a Packages page
  		When click on contact us button
  		And Press on Escape key
	  	Then I am taken back to packages pages

	  		
	  Scenario: TC_112c Verify user can cancel filling contact by clicking on "Cancel" button
	    Given Be on a Packages page
  		When click on contact us button
  		And Click on outside popup
	  	Then I am taken back to packages pages
	  	
