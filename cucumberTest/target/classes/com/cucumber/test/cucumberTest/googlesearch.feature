
@smoke
Feature: I want to google search something

Scenario: Google search for a string
Given I am on google homepage
And I type in a search with the keyword google
When I click on search
Then I get my results
