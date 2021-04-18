Feature:Employee List
Scenario: User successfully access the Employee List when he clicks on Employee List
Given User is on Home Page of OrangeHRM application
When user clicks on PIM Module
And user clicks on Employee List
Then User is successfully access the Employee List field

Scenario: User is successfully search the employee 
Given User is on Employee List field
When User provides the required details
|Chenzira Chuki|0204|Full-Time Permanent|Aaliyah Haq|QA Engineer|Quality Assurance|
And click on Search button
Then user information is displayed
