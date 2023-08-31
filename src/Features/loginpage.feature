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
@Regression
Feature: Login page feature
  I want to use this template for my Login page feature file
  
Back ground: pre condition
Given I am the user of an application

  @test-1
  Scenario: To validate valid Login scenario
    
    When User enter valid Username
    And User enter valid Password
    And User click on Login button
    Then User should be able to login successfully

  @test-2
  Scenario: To validate Invalid Login scenario
    
    When User enter Invalid Username
    And User enter Invalid Password
    And User click on Login button
    Then User should not be able to login successfully
    
    
    