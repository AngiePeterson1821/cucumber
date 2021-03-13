Feature: I'm demonstrating ow I'm working with WebElements
  Background: Navigate to the A&N page
    Given I navigate to alerts and notifications

  Scenario: Add/Read notification
    When I navigate to the Alerts page I check the Header Text
    Then I send keys to the New Notification dialog box, "test"
    And I check notification box for response
    Then I clear field to generate error message
    And I check error message
