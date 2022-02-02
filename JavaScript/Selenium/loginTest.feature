
Feature: TesteLogin

    Scenario: TestandoLogin
    Given o usuario na tela de login
    When ele digita o <usuario> e a <senha> correta e clica em entrar
    Then ele deve entrar na aplicacao
    Example: 
    |usuario        |senha         |
    |"standard_user"|"secret_sauce"|