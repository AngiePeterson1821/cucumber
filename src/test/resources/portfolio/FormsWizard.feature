Feature: Test Automation for Forms
  Scenario Outline: Fillout wizard
#

    When I navigate to the Form Wizard
    Then I verify I am on the Form Wizard Page
    Then  I will type in "<First Name>"
    Then  will fill out, "<Last Name>"
    Then  will click next
    And I will wait for the page to load
    When  get to the second page I will enter "<Street Address>"
    Then  I will fill out "<City>"
    Then  I will fill out the "<State>"
    And  will fill out the "<Zip>"
    Then I will click on the next button
    And I will wait for the page to load again
#    When check First Name, I see "First Name"
#    When check Last name, I see "Last Name"

    Examples:
      |First Name  | Last Name | Street Address| City|State|Zip  |
      |Test1       | Last1     | 13 Elm St     |SLC  | UT  |84088|
      |Test2       | Last2     | 13 Elm St A   |SLC  | UT  |84088|
      |Test3       | Last3     | 13 Elm St B   |SLC  | UT  |84088|
      |Test4       | Last4     | 13 Elm St C   |SLC  | UT  |84088|
