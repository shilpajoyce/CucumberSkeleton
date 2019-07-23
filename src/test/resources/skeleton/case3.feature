
	Feature: TestMeApp test Search
 	Testing search of TestMeApp

  Scenario Outline: Search TestMeApp functionality
   Given user opens the login page in TestMe App
	 When User enter username as <uname> and password as <pass>
   And click Submit button
	 And search for product
	 Then verify Search


    Examples: 
      |   uname   |   pass        |
      | "lalitha" | "password123" | 
