Feature: As a user I can access demo of DrParser

Scenario: TC_76 Verify user can upload CV by clicking on Browser
	  	Given Being on page
	  	When hovering on Products navigation
	  	And Selecting DrParser for Services
	  	And Click on Demo DrParser button
	  	And browser a file from computer
	  	Then I see the name of the selected file
	  	

	Scenario: TC_77 Verify a proper error message should be shown in case if the user tries to upload the file which is not allowed.
	  	Given Being on page
	  	When hovering on Products navigation
	  	And Selecting DrParser for Services
	  	And Click on Demo DrParser button
	  	And browser a non pdf file from computer
	  	And Click on parse CV button
	  	Then I see an error message displayed
	  	
	  	 
Scenario: TC_81 Verify the newest selected file will be uploaded if the user tries to upload another file
	  	Given Being on page
	  	When hovering on Products navigation
	  	And Selecting DrParser for Services
	  	And Click on Demo DrParser button
	  	And browser a file from computer
	  	Then I see the name of the selected file
	  	When browser another file from computer
	  	Then I see the name of the newest selected file

Scenario: TC_83 Verify selected file will be removed when user clicking on "Start over?" link
	  	Given Being on page
	  	When hovering on Products navigation
	  	And Selecting DrParser for Services
	  	And Click on Demo DrParser button
	  	And browser a file from computer
	  	Then I see the name of the selected file
	  	When Click on Start over link
	  	Then I see the name of the selected file is removed

Scenario: TC_85 Verify system can parse CV with CV format
	  	Given Being on page
	  	When hovering on Products navigation
	  	And Selecting DrParser for Services
	  	And Click on Demo DrParser button
	  	And browser a file from computer
	  	And Click on parse CV button
	  	Then I see output as below