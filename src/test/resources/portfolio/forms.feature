Feature: Test Automation for Forms
  Background: Navigate to the Data Tables Page
    Given I navigate to Form Component Page

  Scenario: Fill out Basic Form
    When  Forms. Fill out email address field, "test@test.com"
    Then Forms. Fill out password field, "password1"
    Then I will upload the file:  "\src\test\resources\data\blkout.jpg"
    And I will click submit

  Scenario: Fill out field in Form Elements component
    When Forms. I will enter keys in the Success Icon field , "success field"
    Then Forms. I enter keys in the Warning, "input warning"
    Then Forms. I will enter keys in the Error, "input error"

  Scenario: Click on dropdown box from Selects component
    When Forms. I will click on the Default select drop down
    Then Forms. I will click on option three from scroll

  Scenario: Click on buttons in Custom Check Boxes and Radio Component
    When Forms. I see page I will click option three from Radio option
    Then Forms. I will click option three in Inline Radio
    Then Forms. I will click option three in Check Box
    And Forms. I will click option three in Inline Check Box