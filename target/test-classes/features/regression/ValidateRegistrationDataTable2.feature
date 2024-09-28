Feature: To validate Registration functionality in Adactin hotel app

@wip2809a @regression
Scenario:  To validate Registration functionality using valid data

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks on link using xpath "//a[text()='New User Register Here']"
And user enters details in registration form using map
| username|password|confirm password| full name | email | captcha |
| ravi2809 | ravi123 | ravi123 | ravi kumar | ravi@gmail.com|india|