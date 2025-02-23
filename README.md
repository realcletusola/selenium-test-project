# Selenium Automation Test Project

## Note: 
This project is actively maintained and will be regularly updated with new test cases and improvements as the application evolves.


## Table of Contents
1. [Introduction](#introduction)
2. [Technologies Used](#technologies-used)
3. [Test Projects](#test-projects)
   - [Test Project 1: Keyboard and mouse input test](#test-project-1-keyboard-and-mouse-input-test)
   - [Test Project 2: AutoComplete Test](#test-project-2-autocomplete-test)
   - [Test Project 3: Scroll To Element Test](#test-project-3-scroll-to-element-test)
   - [Test Project 4: Switch to active window test](#test-project-4-switch-to-active-window-test)
   - [Test Project 5: Switch to alert](#test-project-5-switch-to-alert)
   - [Test Project 6: Execute Javascript](#test-project-6-execute-javascript)
   - [Test Project 7: Drag and Drop](#test-project-7-drag-and-drop)
   - [Test Project 8: Radio Button](#test-project-8-radio-button-test)
   - [Test Project 9: Date Picker](#test-project-9-date-picker)
   - [Test Project 10: Drop Down Menu](#test-project-10-drop-down-menu)
   - [Test Project 11: File Upload](#test-project-11-file-upload)
   - [Test Project 12: Implicit Wait](#test-project-12-implicit-wait)
   - [Test Project 13: Explicit Wait](#test-project-13-explicit-wait)
   - [Test Project 14: Form Test](#test-project-14-form-test)
   - [Test Project 15: Form Test 2](#test-project-15-form-test-2)
   <!-- - [Test Project 3: Search Functionality Test](#test-project-3-search-functionality-test) -->
4. [Setup and Installation](#setup-and-installation)
5. [Usage](#usage)
6. [Contributing](#contributing)
7. [Future Updates](#future-updates)
8. [License](#license)

---

## Introduction
This project is a collection of automated functional and regression tests developed using **Selenium WebDriver**, **JUnit**, and **Maven**. It is designed to test the core functionalities of a web application, ensuring the stability and reliability of critical features. The tests are executed in a browser environment controlled by **Chromedriver**, simulating real user interactions.

This project is actively maintained and will be regularly updated with new test cases and improvements as the application evolves.

## Technologies Used
- **Java**: Primary programming language.
- **Selenium WebDriver**: Used for browser automation.
- **JUnit**: Framework for writing and running unit tests.
- **Maven**: Build automation tool.
- **Chromedriver**: WebDriver implementation for automating Chrome browser.

## Test Projects
1. **KeyBoard and Mouse Input Test**
   - Automates a name form field.

2. **Autocomplete Test**
   - Automates form address form, taking advantage of the autocomple functionality.

3. **Scroll To Element Test**
   - Use of Actions to move to new elements

4. **Switch To Active Window Test**
   - Open new window 

5. **Switch To Alert**
   - Click alert button

6. **Execute Javascript**
   - Use Javascript script to perform operation on a button

7. **Drag and Drop**
   - Use selenium to drag and drop objects on a web page

8. **Radio Button Test**
   - Test multiple radio buttons and check boxes using 3 different approach

9. **Date Picker**
   - Automate date selection

10. **Drop Down Menu**
   - Select item from a dropdwon menu

11. **File Upload**
   - Upload files

12. **Implicit Wait**
   - Using Implicit Wait

13. **Explicit Wait**
   - Using Explicit Wait

14. **Form Test**
   - Fill a complete form

15. **Form Test 2**
   - Use explicit wait to get success result after submitting a form

<!-- 3. **Search Functionality Test**
   - Tests the search feature with various keywords.
   - Validates the accuracy of displayed results. -->

More test projects will be added as the project progresses.

## Setup and Installation
1. Clone the repository:
   ```sh
   git clone https://github.com/realcletusola/selenium-test-project.git
   cd selenium-test-project
   ```

## Install Maven dependencies
    mvn clean install

## Run tests
    mvn test

## Run a particular test 
    mvn -Dtest=TestClassName test 

## Contributing 
Contributions are welcome! Feel free to fork the repository, make improvements, and submit a pull request.

## Future Updates
1. Additional test scenarios for enchanced coverage.
2. Improved error handling and reporting.
3. Integration with CI/CD pipelines for automated test execution.

## License 
    This project is licensed under the MIT License.