Feature: Calculadora básica
  Scenario: Suma de dos valores
    Given una calculadora encendida
    When sumo 7 y 5
    Then el resultado es 12

  Scenario: Resta de dos valores
    Given una calculadora encendida
    When resto 10 y 3
    Then el resultado es 7

  Scenario: Multiplicación de dos valores
    Given una calculadora encendida
    When multiplico 6 y 4
    Then el resultado es 24

  Scenario: División de dos valores
    Given una calculadora encendida
    When divido 20 y 5
    Then el resultado es 4
