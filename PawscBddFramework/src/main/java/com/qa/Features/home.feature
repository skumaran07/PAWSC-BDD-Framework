#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Verify that home pages displaying properly

  Background: 
    Given open the browser
    When username and password for login
    Then Select Site inforamtion under Sites

  Scenario: Verify that left navigation is working or not
    Then validate home page title
    Then Check Site search button is displaying in landing page
    Then close browser
    
    Scenario: Verify the create site page
    Then Select Ambridge-Action from dataset
    Then Validate create site title
    Then close browser
    
    ##Scenario: Verify that Site Summary is working or not
    ##Then Click Site Summary under Site
    ##Then Enter Customer No and Select Dataset
    
