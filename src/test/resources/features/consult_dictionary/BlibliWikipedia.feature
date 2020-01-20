Feature: Searching Blibli on duckduckgo

  Scenario: Searching Blibli Wikipedia page on duckduckgo
    Given User open duckduckgo homepage
    When User type "blibli.com wikipedia" on the search box
    And User click the Wikipedia link
    Then User should be able to see "Blibli.com adalah salah satu situs web perdagangan elektronik di Indonesia."