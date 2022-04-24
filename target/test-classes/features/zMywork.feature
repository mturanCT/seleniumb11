Feature: find the deals for laptops

  Scenario:  Search for laptop deals
      When i navigate to the Slick deals home page
      Then enter search box laptops
      And there are 15 deals on the first page
