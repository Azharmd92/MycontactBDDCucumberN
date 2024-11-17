
Feature: Signup
  
  Scenario: MycontactForm Entering Signup details
    Given  user open chrome browser
    When user open URL"https://www.mycontactform.com/index.php"
    When user click on SignUp Link
    When user enter name as "shoaib"
    When user enter email as "azhar@gmail.com"
    When user enter username as "shoain123"
    When user enter password as "ShoaibTD"
    When user enter Password2 as "ShoaibTD"
    Then click on checkBox