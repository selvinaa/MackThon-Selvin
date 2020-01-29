@homePageWebApache

Feature: Home page Apache Testing
  @verifytitle
  Scenario: Verify title of Home Page
    Given User opens home page
    And User opens Apache Pag
    Then Verifies title is "Apache Tutorials for Beginners"

