Feature: Register
  @Register
  Scenario: User should create account successfully
    Given I am on homepage
    When I click on register link
    And I enters following users details
      | bhav1 | patel | bha11@gmail.com | 123456 | 123456 |
      | gaur | patel | gaur@gmail.com | 123456 | 123456 |
      | de   | patel | d1e@gmail.com  | 123456 | 123456 |
