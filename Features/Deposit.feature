@deposit
Feature: Deposit Functionality
  I want to use this deposit feature on my bank account

  Scenario Outline: To validate the deposit functionality
    Given I have a bank account with <init> amount
    When I deposit <some> amount to my account.
    Then I verify the expected <balance> in my account.

    Examples: 
      | init | some | balance |
      |  400 |   50 |     450 |
      | 1000 | 2000 |    3000 |
