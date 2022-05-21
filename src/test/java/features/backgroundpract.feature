Feature: Bcakground usage
Background:
Given validate the browser
When Browser is triggered
Then check browser is started

@Smoke
Scenario Outline: to enter multiple data
Given user open the url
When user enter <name> and password as <pwd>
Then login should be sucessfull and landing page is opened

Examples:

|name   | pwd  |
|uname1 | pwd1 |
|Uname2 | pwd2 |

