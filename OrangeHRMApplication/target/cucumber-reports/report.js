$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("employeeDetails/AddEmployee.feature");
formatter.feature({
  "line": 1,
  "name": "Add Employee",
  "description": "",
  "id": "add-employee",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User successfully access the Add Employee Field when he click on add employee",
  "description": "",
  "id": "add-employee;user-successfully-access-the-add-employee-field-when-he-click-on-add-employee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on HomePage of OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User clicks on PIM Module",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "clicks on Add Employee",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User successfully access the Add Employee field",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeestepdef.user_is_on_HomePage_of_OrangeHRM_application()"
});
formatter.result({
  "duration": 16583539200,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_clicks_on_PIM_Module()"
});
formatter.result({
  "duration": 3282082600,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.clicks_on_Add_Employee()"
});
formatter.result({
  "duration": 2905252500,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_successfully_access_the_Add_Employee_field()"
});
formatter.result({
  "duration": 1481000600,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "User is successfully add Employee Details with login details",
  "description": "",
  "id": "add-employee;user-is-successfully-add-employee-details-with-login-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "user is on the Add Employee Field",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "User enters the Firstname  and lastname",
  "rows": [
    {
      "cells": [
        "reddy",
        "prasad"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user selected the Login Details Checkbox",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters Username  and password and confirmpassword",
  "rows": [
    {
      "cells": [
        "kttttqiynmmmbriiqbm",
        "pass1283",
        "pass1283"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select the Status",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "click on Save button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User navigate to My Info field",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeestepdef.user_is_on_the_Add_Employee_Field()"
});
formatter.result({
  "duration": 20952308900,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_enters_the_Firstname_and_lastname(DataTable)"
});
formatter.result({
  "duration": 524199200,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_selected_the_Login_Details_Checkbox()"
});
formatter.result({
  "duration": 177495400,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_enters_Username_and_password_and_confirmpassword(DataTable)"
});
formatter.result({
  "duration": 487160100,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.select_the_Status()"
});
formatter.result({
  "duration": 128877100,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.click_on_Save_button()"
});
formatter.result({
  "duration": 113201600,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_navigate_to_My_Info_field()"
});
formatter.result({
  "duration": 6956297600,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "User is getting error message when he did not enter Username",
  "description": "",
  "id": "add-employee;user-is-getting-error-message-when-he-did-not-enter-username",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 22,
  "name": "user is on the Add Employee Field",
  "keyword": "Given "
});
formatter.step({
  "line": 23,
  "name": "users enters all the required fields",
  "rows": [
    {
      "cells": [
        "reddy",
        "prasad",
        "password123",
        "password123"
      ],
      "line": 24
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "user did not enter Username field",
  "keyword": "But "
});
formatter.step({
  "line": 26,
  "name": "error message displayed below the username field",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeestepdef.user_is_on_the_Add_Employee_Field()"
});
formatter.result({
  "duration": 19437950500,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.users_enters_all_the_required_fields(DataTable)"
});
formatter.result({
  "duration": 966020700,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_did_not_enter_Username_field()"
});
formatter.result({
  "duration": 253880600,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.error_message_displayed_below_the_username_field()"
});
formatter.result({
  "duration": 1309390000,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Failure in adding employee details when the user did not enter password",
  "description": "",
  "id": "add-employee;failure-in-adding-employee-details-when-the-user-did-not-enter-password",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "user is on the Add Employee Field",
  "keyword": "Given "
});
formatter.step({
  "line": 30,
  "name": "User enters all required fields",
  "rows": [
    {
      "cells": [
        "reddy",
        "prasad",
        "username1"
      ],
      "line": 31
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "user did not enter the password",
  "keyword": "But "
});
formatter.step({
  "line": 33,
  "name": "Error message displayed on password field",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeestepdef.user_is_on_the_Add_Employee_Field()"
});
formatter.result({
  "duration": 18542406600,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_enters_all_required_fields(DataTable)"
});
formatter.result({
  "duration": 716361000,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_did_not_enter_the_password()"
});
formatter.result({
  "duration": 292234500,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.error_message_displayed_on_password_field()"
});
formatter.result({
  "duration": 1307029100,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "User gets error message when he did not enter the firstname",
  "description": "",
  "id": "add-employee;user-gets-error-message-when-he-did-not-enter-the-firstname",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 36,
  "name": "user is on the Add Employee Field",
  "keyword": "Given "
});
formatter.step({
  "line": 37,
  "name": "User did not enter the firstname",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "user clicks on Save Button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "error message displayed below the firstname field",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeestepdef.user_is_on_the_Add_Employee_Field()"
});
formatter.result({
  "duration": 22970823700,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_did_not_enter_the_firstname()"
});
formatter.result({
  "duration": 148682200,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_clicks_on_Save_Button()"
});
formatter.result({
  "duration": 143213500,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.error_message_displayed_below_the_firstname_field()"
});
formatter.result({
  "duration": 1292736000,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "User gets error message when he did not enter lastname",
  "description": "",
  "id": "add-employee;user-gets-error-message-when-he-did-not-enter-lastname",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 42,
  "name": "user is on the Add Employee Field",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "User enter the firstname",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "user did not the lastname",
  "keyword": "But "
});
formatter.step({
  "line": 45,
  "name": "error message displayed below the lastname field",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeestepdef.user_is_on_the_Add_Employee_Field()"
});
formatter.result({
  "duration": 22422816300,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_enter_the_firstname()"
});
formatter.result({
  "duration": 189708900,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_did_not_the_lastname()"
});
formatter.result({
  "duration": 103886400,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.error_message_displayed_below_the_lastname_field()"
});
formatter.result({
  "duration": 1399941700,
  "status": "passed"
});
formatter.scenario({
  "line": 47,
  "name": "User gets error when he enter username less than five characters",
  "description": "",
  "id": "add-employee;user-gets-error-when-he-enter-username-less-than-five-characters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 48,
  "name": "user is on the Add Employee Field",
  "keyword": "Given "
});
formatter.step({
  "line": 49,
  "name": "User enters all required field",
  "rows": [
    {
      "cells": [
        "reddy",
        "prasad",
        "password123",
        "password123"
      ],
      "line": 50
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user entered the username less than five characters",
  "rows": [
    {
      "cells": [
        "redd"
      ],
      "line": 52
    }
  ],
  "keyword": "But "
});
formatter.step({
  "line": 53,
  "name": "error message displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeestepdef.user_is_on_the_Add_Employee_Field()"
});
formatter.result({
  "duration": 19979543500,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_enters_all_required_field(DataTable)"
});
formatter.result({
  "duration": 728166800,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_entered_the_username_less_than_five_characters(DataTable)"
});
formatter.result({
  "duration": 147253400,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.error_message_displayed()"
});
formatter.result({
  "duration": 1460415800,
  "status": "passed"
});
formatter.scenario({
  "line": 55,
  "name": "User gets error message when he entered password less than eight characters",
  "description": "",
  "id": "add-employee;user-gets-error-message-when-he-entered-password-less-than-eight-characters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 56,
  "name": "user is on the Add Employee Field",
  "keyword": "Given "
});
formatter.step({
  "line": 57,
  "name": "User entered all required fields",
  "rows": [
    {
      "cells": [
        "reddy",
        "prasad",
        "username"
      ],
      "line": 58
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 59,
  "name": "user enters the password less than eight characters",
  "rows": [
    {
      "cells": [
        "passwo"
      ],
      "line": 60
    }
  ],
  "keyword": "But "
});
formatter.step({
  "line": 61,
  "name": "error message will be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddEmployeestepdef.user_is_on_the_Add_Employee_Field()"
});
formatter.result({
  "duration": 19610492600,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_entered_all_required_fields(DataTable)"
});
formatter.result({
  "duration": 591660100,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.user_enters_the_password_less_than_eight_characters(DataTable)"
});
formatter.result({
  "duration": 140557300,
  "status": "passed"
});
formatter.match({
  "location": "AddEmployeestepdef.error_message_will_be_displayed()"
});
formatter.result({
  "duration": 1550804300,
  "status": "passed"
});
formatter.uri("employeeDetails/EmployeeList.feature");
formatter.feature({
  "line": 1,
  "name": "Employee List",
  "description": "",
  "id": "employee-list",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User successfully access the Employee List when he clicks on Employee List",
  "description": "",
  "id": "employee-list;user-successfully-access-the-employee-list-when-he-clicks-on-employee-list",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User is on Home Page of OrangeHRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user clicks on PIM Module",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user clicks on Employee List",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User is successfully access the Employee List field",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeList.user_is_on_Home_Page_of_OrangeHRM_application()"
});
formatter.result({
  "duration": 11966525600,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeList.user_clicks_on_PIM_Module()"
});
formatter.result({
  "duration": 2779558200,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeList.user_clicks_on_Employee_List()"
});
formatter.result({
  "duration": 1201373200,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeList.user_is_successfully_access_the_Employee_List_field()"
});
formatter.result({
  "duration": 1665922300,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User is successfully search the employee",
  "description": "",
  "id": "employee-list;user-is-successfully-search-the-employee",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "User is on Employee List field",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "User provides the required details",
  "rows": [
    {
      "cells": [
        "Chenzira Chuki",
        "0204",
        "Full-Time Permanent",
        "Aaliyah Haq",
        "QA Engineer",
        "Quality Assurance"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on Search button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user information is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "EmployeeList.user_is_on_Employee_List_field()"
});
formatter.result({
  "duration": 18542731100,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeList.user_provides_the_required_details(DataTable)"
});
formatter.result({
  "duration": 495784700,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeList.click_on_Search_button()"
});
formatter.result({
  "duration": 702883500,
  "status": "passed"
});
formatter.match({
  "location": "EmployeeList.user_information_is_displayed()"
});
formatter.result({
  "duration": 1431473200,
  "status": "passed"
});
});