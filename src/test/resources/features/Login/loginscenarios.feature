Feature: Verify Login feature of letskodeit a demo site


    Scenario Outline: Test Login functionality with valid details
    Given I am on letskodeit home page
    When I click on login
    Then I should navigate to login page
    When I enter valid "<emailAddress>" and "<password>" credentials on  login page
    And I click on Submit button
    Then I should be login successfully
    When I click on logout
    Then I should get logout successfully


    Examples: Valid data
      | emailAddress            | password   |
      | jitin.doriya@thepsi.com | ocoolzhere |