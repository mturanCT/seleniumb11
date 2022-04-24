Feature: Testing google functionalities

  Scenario: Happy path google search functionality
    Given I navigate to google.com
    When I search for Techtorial
    Then I get more than 10 links on the google page




