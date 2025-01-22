Feature: HRM Orange web page

  Scenario: Login with Orange HRM page
    Given I open the Orange HRM homepage
    When I add username and password
    Then Verify user can see the hrm logo
