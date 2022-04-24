Feature: Ebay search functionality

  Scenario: Search for Imac 2020
    Given user is on ebay homepage
    When user searches for imac 2020
    Then user sees results about iMac only
    And there are more than 3 pages of results
