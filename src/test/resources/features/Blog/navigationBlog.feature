
Feature: As blog page, User can navigate to respectively page


  Scenario: TC_43 Verify user can access the newest blog post when clicking on "Read More" link
  
    Given Being on blog page
    When Click on Read More link
    Then I navigated to page of respectively post 
    When navigate to blog page
    And click on next pagination
    When Click on Read More link
    Then I navigated to page of respectively post 
    When navigate to blog page
    And click on next pagination
    When Click on Read More link
    Then I navigated to page of respectively post 
    
    
    Scenario: TC_47a Verify user can access post page if clicking on its name link on first page
  
    Given Being on blog page
    When Click on "1" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "2" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "3" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "4" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "5" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "6" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "7" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "8" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "9" post link and then I redirected to page of respectively post
    

Scenario: TC_47b Verify user can access post page if clicking on its name link on second page
  
    Given Being on blog page
    And click on next pagination
    When Click on "1" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "2" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "3" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "4" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "5" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "6" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "7" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "8" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "9" post link and then I redirected to page of respectively post
    
      
Scenario: TC_47c Verify user can access post page if clicking on its name link on third page
  
    Given Being on blog page
    And click on next pagination
    And click on next pagination
    When Click on "1" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "2" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "3" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "4" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "5" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "6" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "7" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "8" post link and then I redirected to page of respectively post
    And navigate to blog page
    When Click on "9" post link and then I redirected to page of respectively post
    
 @Testing 
Scenario: TC_48 Verify user can access every service section by clicking on service tag

		Given Being on blog page
		When count number of post with respontively topics
		Then Click on AI topic tab and compare results
		Then Click on DA topic tab and compare results
		Then Click on DL topic tab and compare results
		Then Click on ML topic tab and compare results

  
     


