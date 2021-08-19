#Autor: Juan E. Daza

  @stories
  Feature: uTest Register
    As a user I want to join utest.com

  @scenario1
  Scenario Outline: Complete SignUp form in utest.com
    Given than Jake wants to join utest.com by signing up in their landing page
    When he starts filling the information required for the SignUp
      |firstName  |lastName  |emailAddress  |city  |postalCode  |country  |computerOS  |osVersion  |osLanguage  |mobileDeviceBrand  |mobileDeviceModel  |mobileDeviceOS  |utestPassword  |
      |<firstName>|<lastName>|<emailAddress>|<city>|<postalCode>|<country>|<computerOS>|<osVersion>|<osLanguage>|<mobileDeviceBrand>|<mobileDeviceModel>|<mobileDeviceOS>|<utestPassword>|
    Then he is able to login with his newly created account
      |emailAddress  |utestPassword  |confirmationText  |
      |<emailAddress>|<utestPassword>|<confirmationText>|
    Examples:
      |firstName  |lastName  |emailAddress            |city  |postalCode  |country  |computerOS  |osVersion  |osLanguage  |mobileDeviceBrand  |mobileDeviceModel  |mobileDeviceOS  |utestPassword  |confirmationText|
      |Jake       |Bell      |JakeExample5@hotmail.com|Bogotá|111156      |Colombia |Windows     |10         |Spanish     |Samsung            |Galaxy A21s        |Android 10      |JakeBell1969?  |We're so excited for you to get started on uTest, but first you need to confirm your email address.|
