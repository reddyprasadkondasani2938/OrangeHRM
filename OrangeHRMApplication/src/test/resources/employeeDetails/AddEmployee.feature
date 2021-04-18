Feature:Add Employee
Scenario: User successfully access the Add Employee Field when he click on add employee
Given User is on HomePage of OrangeHRM application
When User clicks on PIM Module
And  clicks on Add Employee 
Then User successfully access the Add Employee field



 Scenario:User is successfully add Employee Details with login details
 Given user is on the Add Employee Field
 When User enters the Firstname  and lastname 
 |reddy|prasad|
 And user selected the Login Details Checkbox
 And User enters Username  and password and confirmpassword 
 |kttttqiynmmmnbriiqbm|pass1283|pass1283|
 And select the Status
 And click on Save button
 Then User navigate to My Info field
 
 Scenario: User is getting error message when he did not enter Username
 Given user is on the Add Employee Field
 When users enters all the required fields
 |reddy|prasad|password123|password123|
 But user did not enter Username field
 Then error message displayed below the username field
 
 Scenario: Failure in adding employee details when the user did not enter password
 Given user is on the Add Employee Field
 When User enters all required fields
 |reddy|prasad|username1|
 But user did not enter the password
 Then Error message displayed on password field
 
 Scenario: User gets error message when he did not enter the firstname
 Given user is on the Add Employee Field
 When User did not enter the firstname
 And user clicks on Save Button
 Then error message displayed below the firstname field
 
 Scenario: User gets error message when he did not enter lastname
 Given user is on the Add Employee Field
 When User enter the firstname
 But user did not the lastname
 Then error message displayed below the lastname field
 
 Scenario: User gets error when he enter username less than five characters
 Given user is on the Add Employee Field
 When User enters all required field
 |reddy|prasad|password123|password123|
 But user entered the username less than five characters 
 |redd|
 Then error message displayed
 
 Scenario:User gets error message when he entered password less than eight characters
 Given user is on the Add Employee Field
 When User entered all required fields
 |reddy|prasad|username|
 But user enters the password less than eight characters
 |passwo|
 Then error message will be displayed