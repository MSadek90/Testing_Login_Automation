Feature:Login Functionality


Scenario:The user can login with valid credentials

Given:the user navigates to login page
When:the user enters a valid username in the username filed
     and enters a valid password in the password field
     and clicks on the login button

Then:the user should be navigated to the home page





Scenario:The user can not login with Invalid username

Given:the user navigates to the login page
When:the user enters an Invalid username in the username field
     and enters a valid password in the password field
     and clicks on login button

Then:the user should be navigated to the home page





Examples:

| username | password |
| Admin    | admin123 |
| Admin2   | admin123 |
