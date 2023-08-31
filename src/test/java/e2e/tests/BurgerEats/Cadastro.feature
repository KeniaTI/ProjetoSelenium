@BugerEats @Cadastro
Feature: Cadastro

  Scenario: Cadastrar no site Buger Eats

    Given o usuário esteja no site Buger Eats
    When clicar no botão cadastre-se
    And preencher os campos com dados válidos
    Then deve ser exibida uma mensagem de confirmação de cadastro


                       |