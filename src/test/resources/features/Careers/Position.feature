
Feature: Being careers page, user can access to position page



  Scenario: TC_54 Verify user can access position page when click on its name
    Given Be on the Careers page
    When Click on name of position link
    Then I am navigated to page of respectively position 
    
    Scenario: TC_55 Verify user can access position page when click on its name
    Given Be on the Careers page
    When Click on Read more button
    Then I am navigated to the page of respectively position 


