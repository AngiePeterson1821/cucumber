Feature: I'm demonstrating working with elements

  Background: Navigate to the Form Mask Page
    Given FormMask. I navigate to the Form Mask Page

  Scenario: Fill out Form Mask
    When FormMask. Fill out valid values in date field, "12/02/1982"
    Then FormMask. Verify the text is as entered, "12/02/1982"