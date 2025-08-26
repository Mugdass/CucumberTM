@withdraw
Feature: Withdraw Functionality
  I want to use this withdraw feature on my bank account

  Scenario Outline: To validate the withdraw functionality
    Given I have the same bank account with <init> amount
    When I withdraw <some> amount from my account.
    Then I again verify the expected <balance> in my account.

    Examples: 
      | init | some | balance |
      |  400 |   99 |     301 |
      | 1000 |  821 |     179 |
