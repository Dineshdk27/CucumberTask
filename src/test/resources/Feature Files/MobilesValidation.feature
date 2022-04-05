#Author: yourCompany.email@your.domain.com
@mobile
Feature: MobilesValidations
  I want to use this template for my feature file

  Background: 
    And Skiping the login alert

  @mob
  Scenario: defalut Values
    When user searches
    And user clicks the mobile
    And windowhandlings
    And enter pincode
    Then validate the mobiles
    And closing browser

  @mob1d
  Scenario: Data Table Values
    When user search by one d map
      | 1 | iPhone  |
      | 2 | onePlus |
      | 3 | vivo    |
    And user clicks the mobile
    And windowhandlings
    And enter pincode
    Then validate the mobiles
    And closing browser

  Scenario Outline: Data Table value
    When user searches "<phones>"
    And user clicks the mobile
    And windowhandlings
    And enter pincode
    Then validate the mobiles
    And closing browser

    Examples: 
      | phones |
      | realme |
      | vivo   |
