

@login
Feature: WebJumpTest

    Background:
        Given User access page

    @login-CT001 @smoke @regression
    Scenario: Click Button
        When user clicks on button one
        Then user clicks on button two
        And user clicks on button three

    @login-CT001 @smoke @regression
    Scenario: Select Box and Options
        When user clicks on select box
        Then user clicks on option one
        And user find text sit

    @login-CT001 @smoke @regression
    Scenario: Field up the form
        When fill out all the fields
        Then user locate php
        And user locate no image


    @login-CT001 @smoke @regression
    Scenario: Changed Frame Buttons
        When user switch frame buttons
        Then user switch frame fields


#    @qualquercoisa
#    Scenario Outline: CTE001 - Login exception
#        When I fill in the login form with the data email "<email>" and password "<password>"
#        Then the error message "<errorMessage>" should appear in the page
#        Examples:
#            | email   | password | errorMessage               |
#            |         |          | Invalid email or password. |