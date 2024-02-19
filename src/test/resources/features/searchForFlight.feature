Feature: Search for flight at ryanair

  Scenario: Use search form from start page
    Given is a start page with a flight search form
    When the passenger accept all cookies
    And the passenger selects Cologne as departure
    And the passenger selects "Palma de Mallorca" as destination
    And the passenger clicks the search button
    Then a result page is loaded and contains text "Dresden"
    And a result page is loaded and contains text "Palma de Mallorca"