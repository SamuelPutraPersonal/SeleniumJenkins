Feature: Google Search

  Scenario: Search for a term
    Given I open the Google homepage
    When I search for "Selenium Jenkins"
    Then I should see results related to "Selenium Jenkins"
