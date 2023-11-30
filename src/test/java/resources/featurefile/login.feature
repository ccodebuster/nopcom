Feature: Login Test
  As user I want to login into nop commerce website

  @smoke
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I am on homepage I see login link
    When I click on login link
    And I am login page
    Then I should navigate to login page successfully

  #@Smoke @sanity @bug
  Scenario: User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "ccd@gmail.com"
    And I enter password "123456"
    And I click on login button
    Then I should login successfully

  @test
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email             | password | errorMessage                                                                                |
      | code@gmail.com    | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | buster@gmail.com  | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | codebus@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | codebus@gmail.com |          | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |


