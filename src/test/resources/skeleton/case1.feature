Feature: Test Registration 
  To test the functionality of Registration in TestMeApp

  Scenario Outline: Registration process
    Given User opens TestMeApp
    When Enters uname as <username>
    And Enter the fn as <firstname>
    And Enter the ln as <lastname>
    And Enter the pass as <Password>
    And Enter the cpass as <ConfirmPassword>
    And Select gender
    And Enter the email as <Email>
    And Enter mob as <MobileNumber>
    And Enter dob as <Dob>
    And Enter the address as <add>
    And Enter ans as <Answer>
		Then Click on Register

    Examples: 
      | username  | firstname | lastname | Password | ConfirmPassword | Email 			 | MobileNumber | Dob 					| add  							   | Answer  |
      |	shil456		|	shilpa		| joyce		 | shilpa12 | shilpa12				| sh@gmail.com | 9445406265	  | 03/23/1998		| "Alandur Chennai"    | London  |