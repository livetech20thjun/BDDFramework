Feature: To validate Registration functionality in Adactin hotel app

@wip2809 @regression
Scenario:  To validate Registration functionality using valid data

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user clicks on link using xpath "//a[text()='New User Register Here']"
And user enters text "ravi2809" in textbox using xpath "//input[@name='username']"
And user enters text "ravi123" in textbox using xpath "//input[@name='password']"
And user enters text "ravi123" in textbox using xpath "//input[@name='re_password']"
And user enters text "ravi kumar" in textbox using xpath "//input[@name='full_name']"
And user enters text "ravi@gmail.com" in textbox using xpath "//input[@name='email_add']"
And user enters text "india" in textbox using xpath "//input[@name='captcha']"
