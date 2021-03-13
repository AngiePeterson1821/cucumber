Feature: Modals
Background:
Given I navigate to the Modals/Popups Page


  Scenario: Press and close modals
    When Modals. I verify modals header, "Modals & Popups"
    When Modals. I press on Default Modal it opens
    Then Modals. I verify modal text says, "One fine body…"
    Then Modals. I close modal
    Then Modals. I open Form Modal
    Then Modals. I verify Form Modal says, "Form Modal"
    And Modals. I fill out email field, "test@test.com"
    Then Modals. I enter my password, "password"
    And Modals. I click sign in
    Then Modals. I click on scrolling modal
    Then Modals. I verify the modal text says, "Scrolling Modal"
    And Modals. I close the modal
    Then Modals. I click leftPop
    Then Modals. I check left pop dialog box says, "Popover on left"
    Then Modals. I click on topPop
    And Modals. I click topPop dialog box and verify it says, "Popover on top"
    Then Modals. I click on bottomPop
    And Modals. I verify the bottomPop dialog box says, "Popover on Bottom"
    Then Modals. I click on rightPop
    And Modals. I verify the rightPop dialog box says, "Popover on Right"