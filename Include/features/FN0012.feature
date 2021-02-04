Feature: offline translation
Scenario: The application is able to translate without an internet connexion
    Given I don't have any internet connection and I have already downloaded French and English dictionnaries
    When I write a texte to translate in the home screen
    Then the application translate the text into English