Feature: This case was prepared for Akakce

  Background: Use Login Process Firstly
    Given Open Application
    When Close the popUP
    And Click on the hesabim button
    And Enter the valid email and password
    And Click on the girisYap button
    Then Verify that the user should be logged in successfully

  @Regression
  Scenario: The user should be able to add product into the watch list by searching a word
    Given Click on the Element
      | searchPage |
    And SendKeys to the Element
      | searchBox | iphone 11 |
    And Click on the Element
      | iphone11 |
    And Choose product in the result list randomly and click *urune git butonu*
    And Click on the *takip butonu* to add the product into the watch list
    And Click on the Element
      | takipListesiButonu |
    Then Verify that the selected *iphone11* in the watch list

  @Smoke @Regression
  Scenario: The user should be able to unfollow all items in the watch list
    Given Click on the *Takip Listesi* button
    And Empty watch list if there are any products on the list
    Then Verify that the watchlist is empty