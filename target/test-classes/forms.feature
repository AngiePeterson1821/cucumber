Feature: Test Automation for page forms
Background:
  Given Navigate to: "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/#/forms/components"


Scenario: Fill out Basic Form
  When  I will click on the email address field and enter keys, "test@test.com"
#  Then I will click on password field and enter keys, "password1"
#  Then I will upload a file:  "C:\Users\Angie.Reynolds\Desktop\blkout.jpg"
#  And I will click on the submit button
#
#Scenario: Fill out field in Form Elements component
#  When I will click on the Input with Success Icon field and enter keys, "success field"
#  Then I will check the Input with Warning field and enter keys, "input warning"
#  Then I will check the Input with Error field and enter keys, "input error"
#
#Scenario: Click on dropdown box from Selects component
#  When I will click on the Default select drop down
#  Then I will click on option three from scroll
#
#Scenario: Click on buttons in Custom Check Boxes and Radio Component
#  When I see page I will click option three from Radio option
#  Then I will click option three in Inline Radio
#  Then I will click option three in Check Box
#  And I will click option three in Inline Check Box