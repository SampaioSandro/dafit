@EfetuarLogin
Feature:  Efetuar login no site dafiti

  Scenario Outline: Efetuar login em uma conta ja existente com informacoes validas
    Given que eu tenha acessado o site atraves da "<url>"
    When  eu clico no icone entrar
    Then  o sistema apresenta uma nova tela com opcoes de login, facebook, twitter, apple ou com email e senha
    Then  eu seleciono o arquivo de massa "efetuarlogin"
    Then  eu insiro as informacoes <cenario>
    Then  eu clico na opcao entrar
    Then  o sistema valida as informacoes
    And   me direciona para home com o usuario ja logado

    Examples:
      | url                       |cenario        |
      | https://www.dafiti.com.br |USUARIO_VALIDO |
