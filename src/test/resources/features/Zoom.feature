Feature: Zoom Functionality

  @smoke
  Scenario: Verify Zoom with Ebay
    Given user opens ebay application
    And search with keyword "Laptop"
    And click on the first item
    And verify zoom functionality