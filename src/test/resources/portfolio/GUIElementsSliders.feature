Feature: I'm demonstrating working with elements
  Background: Navigate to the Sliders page
    Given I navigate to Sliders page

    Scenario: Testing Sliders
      When Sliders. I navigate to sliders page I check that the header says, "SLIDERS"
      Then I move slider from "20" to "1"