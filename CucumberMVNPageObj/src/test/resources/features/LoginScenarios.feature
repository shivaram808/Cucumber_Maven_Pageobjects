Feature: TS RTC Login Scenarios

  @Login
  Scenario: Validate TS RTC user login
    Given Login to TS RTC website using valid username and password
    Then TSRTC Home page should be displayed

	@MyAccount
  Scenario: Update details in my account
    Given Login to TS RTC website using valid username and password
    Then TSRTC Home page should be displayed
    When I Click on My Account page
    And I update Issuing Authority as "XYZ"
    Then I should see successfully updated message
