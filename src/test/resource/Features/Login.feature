
Feature: Login Action
  
  Scenario: MycontactForm Successfull Login with valid  Credential
    Given user open chrome browser
    When user open URL"https://www.mycontactform.com/index.php"
    When user enter username as "azhar123" and password as "AzharTD"
    Then click the login button 
    And click the logout button
    Then close browser
    
    Scenario Outline: Login Data Driven
    Given user open chrome browser
    When user open URL"https://www.mycontactform.com/index.php"
    When user enter username as "<username>" and password as "<password>"
    Then click the login button 
    And click the logout button
    Then close browser
    
    Examples:
       | username | password |
       | azhar123 | AzharTD |
       | azhar234 | azhar@123 |
       
       
       