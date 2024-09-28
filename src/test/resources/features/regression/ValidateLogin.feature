Feature: To validate login for Adactin hotel app

@regression
Scenario: To validate login using valid credentails 

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text "reyaz0806" in textbox using xpath "//input[@name='username']"
And user enters text "reyaz123" in textbox using xpath "//input[@name='password']"
And user clicks on button using xpath "//input[@name='login']"
Then user validates title to be "Adactin.com - Search Hotel"
