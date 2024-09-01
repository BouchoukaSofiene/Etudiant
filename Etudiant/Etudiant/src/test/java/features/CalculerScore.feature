Feature: Calculer score
  Scenario: Etudiant veut calculer son score pour l'option finance
    Given Un etudiant ayant une moyenne
    When Un etudiant veut savoir son score pour l'option
    Then Le système calcule le score pour l'option finance

  Scenario: Etudiant veut calculer son score pour l'option actuariat
    Given Un etudiant ayant une moyenne
    When Un etudiant veut savoir son score pour l'option
    Then Le système calcule le score pour l'option actuariat

  Scenario: Etudiant veut calculer son score pour l'option java
    Given Un etudiant ayant une moyenne
    When Un etudiant veut savoir son score pour l'option
    Then Le système calcule le score pour l'option java
