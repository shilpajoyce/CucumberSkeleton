	Feature: Login
 
 	Scenario Outline: user can do the successful login
	 Given user is on the login page
 	 When  user provides username as <uname> and password as <pwd>
 	 Then  user rendered to TestMeApp home page
 	 
 	 Examples:
 	 | uname     | pwd           |
	 | "lalitha" | "password123" |