Feature: Test Automation for forms

  Background: Navigate to the Data Tables Page
    Given I navigate to Form Drag and Drop Page

  Scenario: Drag and Drop Files
    When FormDrag. I get the the Mask page I verify the header, "DropZone"
    Then I drag and drop files from OS
