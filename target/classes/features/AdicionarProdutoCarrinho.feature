@AdicionarProduto
Feature:  Adicionar produtos ao carrinho

  Background:
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

  Scenario Outline: Adicionar produtos ao carrinho
    Given que eu tenha efetuado login no site da dafiti
    When  eu seleciono o arquivo de massa "adicionarprodutocarrinho"
    Then  eu insiro as informacoes <cenario>
    And   eu clico na lupa para efetuar a pesquisa
    Then  o sistema apresenta na mesma pagina um ou mais produtos, valor, botao comprar
    Then  eu clico no produto desejado e no botao comprar
    Then  o sistema adiciona o produto ao carrinho para eu decidir sobre a compra posteriormente

    Examples:
      | cenario            |
      | PRODUTO_PESQUISADO |