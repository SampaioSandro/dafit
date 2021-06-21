@EditarDadosPessoais
Feature:  Editar dados pessoais

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

  Scenario Outline: Editar dados pessoais
    Given que eu tenha efetuado login no site da dafiti
    When  eu clico no icone do usuario logado
    Then  o sistema apresenta um modal com opcoes, Inicio, Meus pedidos, Trocas e Devolucoes, Meus Favoritos, Informacoes de conta, Meus Enderecos, Cartoes e Vales e Sair
    Then  eu clico no link Informacoes de conta do modal
    Then  o sistema apresenta uma nova tela com os dados pessoais
    Then  eu clico no link editar informacoes
    Then  o sistema habilita os campos para edicao dos dados pessoais
    Then  eu efetuo as alteracoes do sexo e ano de nascimento
    And   eu clico no botao salvar alteracoes
    Then  o sistema apresenta um popup solicitando senha para confirmar alteracoes
    Then  eu seleciono o arquivo de massa "editardadospessoais"
    Then  eu insiro as informacoes <cenario1>
    And   eu clico no botao salvar
    Then  o sistema valida as alteracoes e atualiza na base de dados

    Examples:
      | cenario1    |
      | SENHA       |