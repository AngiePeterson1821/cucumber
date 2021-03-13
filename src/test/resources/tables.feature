Feature: Test Tables
  Background:
   Given Navigate the browser to url: "http://authenticgoods.co/wrapbootstrap/themes/neuboard-v1.4.3/Angular_full_version/#/tables/data"

Scenario: Test Tables
  When I check if I'm on the tables page
  Then I check the list of elements in the Header
  And I print all the table
  Then I select ten from dropdown
  Then I select twenty-five from the dropdown
  Then I select fifty elements from the dropdown
  Then I select one hundred elements from the dropdown
  And then I search for: "Jennifer Chang"
  Then I print the results
  Then I clear field
  And I search for: "Edinburgh"
  And I print the search results
  And I print the count of rows
  Then I sort by Salary
  Then take picture and save it to the pathname: "C:\Users\Angie.Reynolds\Desktop\javaScreenShots\test0.jpg"