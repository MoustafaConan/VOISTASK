# taskSelenuim

This is a repo of the Vodafone VOIS GUI task

using Maven, Data Driven Test, Page object model , TestNG  

**INTRO **

This project is implemented using Page Object Model,under this model, for each web page in the application, there should be a corresponding Page Class This Page class will identify the WebElements of that web page and also contains Page methods which perform operations on those WebElements.There is a clean separation between test code and page specific code. for each web page there is a corresponding test page that can perform assertions on the website page.

This is a maven project you must download maven from marketplace to use it 

Steps to use the project:
1. Download maven from marketplace
2. clone the project or download it 
3. make sure that you install all jar file using maven dependencies 

This project is implemented using Data-Driven Testing
You can Edit test data of these test cases from testData.properites from src/Data/testData.properites

Test Scenario: 

1) Open https://www.google.com

2) Type and search for “Vodafone”

3) Scroll down and go to the next page

4) Count the number of results displayed on the second page (ignore any maps, videos, or images. Just count the normal search results, they are usually around 10 displayed.)

5) Scroll down and go to the next page

6) Validate if the number of results on page 2 is equal to page 3 or not

7) Close the browser window
8) Open Report displays the test results