Feature: Sauce Demo Functionalities
  This nis to automate sauce demo functionalities

  # go to website
  #type user name and password
  #click signin
  #verivy logged in successfully
  #this is an example i\of a test case denied as a user step
  Scenario: Sauce demo valid login
    Given user is on the login page
    When user enters a valid user name and valid password
    And user clicks on the signin button
    Then user is logged successfully
