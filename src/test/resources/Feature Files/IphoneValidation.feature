#Author:company.name@your.domain.com
@dslr
Feature: Iphone Validation
  I want to use this template for my feature file

  Background: 
    Given Skip the login alert

  @cam
  Scenario: Hardcoded Values
    When user search
    And users clicks the mobile
    And windowhandling
    And enter the pincode
    Then I validate the mobiles
    And close browser

  @cam1
  Scenario: Data Table Values
    When user search by one d list
      | Sony Alpha |  | iPhone |  | SamSung |
    And users clicks the mobile
    And windowhandling
    And enter the pincode
    Then I validate the mobiles
    And close browser
