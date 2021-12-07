

Feature: Application Login
  I want to use this template for my feature file
  
  
  @Sanity
  Scenario: Home page degault login
    Given User is on landing page
    When User logs in to application with "jin" and "1234"
    Then Home page is displayed
    And Cards are displayed
    
    @Sanity
    Scenario: Home page degault login
    Given User is on landing page
    When User logs in to application with "john" and "4321"
    Then Home page is displayed
    And Cards are not  displayed
    @MobileTest
    Scenario: Home page degault login
    Given User is on landing page
    When User signs up with following details
    | jenny | abcd | jenny@abcd.com | austrailia | 1234567897 |
    Then Home page is displayed
    And Cards are not  displayed
    @MobileTest
    Scenario Outline: Home page parameterized Login
    Given User is on landing page
    When User logs into application with <Username> and <password> 
    Then Home page is displayed
    And Cards are not  displayed
    
    Examples:
    |Username |password|
    |user1    |pass1	 |
    |user2		|pass2	 |
    |user3		|pass3	 |