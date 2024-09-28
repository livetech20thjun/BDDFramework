Feature: To validate login for Adactin hotel app

@regression
Scenario Outline: To validate login using  different combinations of credentails 

Given user starts "chrome" browser
And user launch app using url "https://adactinhotelapp.com/"
When user enters text '<username>' in textbox using xpath "//input[@name='username']"
And user enters text '<password>' in textbox using xpath "//input[@name='password']"
And user clicks on button using xpath "//input[@name='login']"
Then user validates title to be '<expected Title>'

Examples:

| username | password | expected Title |
| reyaz0806 | reyaz123 | Adactin.com - Search Hotel |
| reyaz0806 | reyaz456 | Adactin.com - Hotel Reservation System |
| reyaz1212 | reyaz123 | Adactin.com - Hotel Reservation System |
| reyaz1212 | reyaz456 | Adactin.com - Hotel Reservation System |
