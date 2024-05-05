Feature: Login Suite

  @smoke
  Scenario: Login successfully sauce demo
    When login with "standard_user" username and "secret_sauce" password on login page
    Then verify user logged in