@web

  Feature: verify weather
    Background:
      Given I am on darksky home page

   @verify
    Scenario: Verify valid login from admin login page
      When I click on day section on the home page
      Then I  verify the lowest and highest tem on home page