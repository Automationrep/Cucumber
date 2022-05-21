Feature: search and place the order for products

Scenario Outline: search experince for product search in both home and offers page
Given user is on greenkart landing page
When user search with shortname <name> and extracted the product
Then user searched for shortname <name> in offers page
And validate the product name in offer page matches with landing page

Examples:
| name|
| Tom |


Scenario: data table practice
Given enter username in search
When below details are entered
|uname|password|email@test.com|
Then details displayed sucessfully
@Sanity
Scenario: regex practice
Given To check user account
When details are entered
And username entered is "abc" and password as "xyz"
Then Sucessfull message should come