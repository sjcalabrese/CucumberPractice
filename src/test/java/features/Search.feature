#Author: erotavlas103@gmail.com

Feature: Search and place order for vegetables
  User should be able to order vegetables

  @SeleniumTest
  Scenario: Search for items and validate results
    Given User is on GreenKart landing page
    When User searched for Cucumber vegetable
    Then "Cucumber" results are displayed
    
	@SeleniumTest
	  Scenario Outline: Search for items and then move to checkout page
	    Given User is on GreenKart landing page
	    When User searched for <Name> vegetable
	    And Added items to cart
	    And Proceed to checkout
    	Then Verify selected <Name> items are displayed in check out page
    	
    	Examples:
    	|Name			|
    	|Brinjal	|
    	|Beetroot |

  