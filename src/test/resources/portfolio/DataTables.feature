Feature: I'm demonstrating how I'm working with WebElements
  Background: Navigate to the Data Tables Page
    Given I navigate to Data Tables Page

    Scenario Outline: Check page
      When I check if I'm on the Data Tables page
      Then I will check the list of elements in the header
      When I pick "<Rows>" elements in Records Per Page dropdown
      And I will see "<Rows>" records on the page
      Examples:
        |Rows|
        |10  |
        |25  |
        |50  |
        |100 |