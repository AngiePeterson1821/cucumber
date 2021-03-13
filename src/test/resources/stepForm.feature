Feature: Test Automation for step through form
  Background:
    Given Browser Navigate to: "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/#/forms/wizard/step_one"

  Scenario: Fill out first step
  When I get to the page I will fill out, "First Name"
  Then I will fill out, "Last Name"
  Then I will click next
  And I will wait for page load
  When I get to the second page I will enter address, "13 Elm St"
  Then I will fill out city, "SLC"
  Then I will fill out state, "UT"
  And I will fill out zip, "84088"
  Then I will click on next button
    And I will wait for page load again
  When I check First Name, I see "First Name"
  When I check Last name, I see "Last Name"
#  When I check address, I see "13 Elm St SLC, UT 84088"















#    Examples:
#      | FirstName | LastName |
#      | test      | test1    |
#      | test      | test2    |
#      | test      | test3    |
