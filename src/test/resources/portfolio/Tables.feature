Feature: Test Automation for BasicTables
  Background:
    Given Basic Tables. Navigate to Basic Tables
  Scenario: Verify Table content
    When Basic Tables. I check if I'm on the Basic Tables page
    Then Basic Tables. Verify the content of the table
      |#|	First Name|	Last Name| Username|
      |1| Mark        |	Otto     | @mdo    |
      |2| Jacob	      |Thornton  | @fat    |
      |3| Larry	      |the Bird	 | @twitter|