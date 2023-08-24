Feature: Watch List Functionality

  Background: Use Login Process Firstly
    Given Open Application
    When Close the popUP
    And Click on the hesabim button
    And Enter the valid email and password
    And Click on the girisYap button
    Then Verify that the user should be logged in successfully

  @Regression
  Scenario: The user should be able to add product into the watch list successfully
    Given Click on the Element
      | anaSayfa          |
      | leftClick         |
      | elektronik        |
      | bilgisayarDonanim |
      | bilgisayarlar     |
      | dizustuBilgisayar |
      | laptopVeNotebook  |
    And Perform scroll for element
    And Get the first Product name
    And Click on the Element
      | takipEtIconu       |
      | takipListesiButonu |
    Then Verify that the product in the watch list
