@Entrevistas
Feature: Test the 3it-recruitment app functionalities

    Scenario: As a user I add a new interview
        Given the user navigates to entrevistas page
        And click on crear entrevista button
        When the user enter a interview
        And click on crear button
        Then the user is able to add the interview to the list

    Scenario: As a user I edit a created interview
        When click on editar entrevista button
        And the user edit a interview
        And click on editar button again
        Then the user is able to add the edited interview to the list

    