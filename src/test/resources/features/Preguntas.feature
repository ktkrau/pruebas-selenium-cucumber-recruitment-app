@Preguntas
Feature: Test the 3it-recruitment app functionalities

    Scenario: As a user I add a new question
        Given the user navigates to preguntas page
        And click on añadir pregunta button
        When the user enter a question
        And click on crear button
        Then the user is able to add the question to the list

    Scenario: As a user I edit a created question
        When click on editar pregunta button
        And the user edit a question
        And click on editar button
        Then the user is able to add the edited question to the list

    Scenario: As a user I delete a question
        When click on eliminar pregunta button
        Then the question is not on the table