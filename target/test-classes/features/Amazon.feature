Feature: Amazon Search functionality

  Scenario: Positive Scenario for Amazon Search
    When I navigate to Amazon homepage
    And I search for iphone 13 case
    Then I should get more than 20 results
    And I validate the search result number


