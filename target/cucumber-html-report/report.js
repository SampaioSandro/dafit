$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/EditarDadosPessoais.feature");
formatter.feature({
  "line": 2,
  "name": "Editar dados pessoais",
  "description": "",
  "id": "editar-dados-pessoais",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@EditarDadosPessoais"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Efetuar login em uma conta ja existente com informacoes validas",
  "description": "",
  "id": "editar-dados-pessoais;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "que eu tenha acessado o site atraves da \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "eu clico no icone entrar",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "o sistema apresenta uma nova tela com opcoes de login, facebook, twitter, apple ou com email e senha",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "eu seleciono o arquivo de massa \"efetuarlogin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "eu insiro as informacoes \u003ccenario\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "eu clico na opcao entrar",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "o sistema valida as informacoes",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "me direciona para home com o usuario ja logado",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "editar-dados-pessoais;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas;",
  "rows": [
    {
      "cells": [
        "url",
        "cenario"
      ],
      "line": 15,
      "id": "editar-dados-pessoais;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas;;1"
    },
    {
      "cells": [
        "https://www.dafiti.com.br",
        "USUARIO_VALIDO"
      ],
      "line": 16,
      "id": "editar-dados-pessoais;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Efetuar login em uma conta ja existente com informacoes validas",
  "description": "",
  "id": "editar-dados-pessoais;efetuar-login-em-uma-conta-ja-existente-com-informacoes-validas;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@EditarDadosPessoais"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "que eu tenha acessado o site atraves da \"https://www.dafiti.com.br\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "eu clico no icone entrar",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "o sistema apresenta uma nova tela com opcoes de login, facebook, twitter, apple ou com email e senha",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "eu seleciono o arquivo de massa \"efetuarlogin\"",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "eu insiro as informacoes USUARIO_VALIDO",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "eu clico na opcao entrar",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "o sistema valida as informacoes",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "me direciona para home com o usuario ja logado",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.dafiti.com.br",
      "offset": 41
    }
  ],
  "location": "StepDefinitions.que_eu_tenha_acessado_o_site_atraves_da(String)"
});
formatter.result({
  "duration": 3786107100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_no_icone_entrar()"
});
formatter.result({
  "duration": 1504189500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_apresenta_uma_nova_tela_com_opcoes_de_login_facebook_twitter_apple_ou_com_email_e_senha()"
});
formatter.result({
  "duration": 26100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "efetuarlogin",
      "offset": 33
    }
  ],
  "location": "StepDefinitions.eu_seleciono_o_arquivo_de_massa(String)"
});
formatter.result({
  "duration": 71100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_insiro_as_informacoes_USUARIO_VALIDO()"
});
formatter.result({
  "duration": 199140000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_na_opcao_entrar()"
});
formatter.result({
  "duration": 2094281300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_valida_as_informacoes()"
});
formatter.result({
  "duration": 22700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.me_direciona_para_home_com_o_usuario_ja_logado()"
});
formatter.result({
  "duration": 21500,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 18,
  "name": "Editar dados pessoais",
  "description": "",
  "id": "editar-dados-pessoais;editar-dados-pessoais",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 19,
  "name": "que eu tenha efetuado login no site da dafiti",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "eu clico no icone do usuario logado",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "o sistema apresenta um modal com opcoes, Inicio, Meus pedidos, Trocas e Devolucoes, Meus Favoritos, Informacoes de conta, Meus Enderecos, Cartoes e Vales e Sair",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "eu clico no link Informacoes de conta do modal",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "o sistema apresenta uma nova tela com os dados pessoais",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "eu clico no link editar informacoes",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "o sistema habilita os campos para edicao dos dados pessoais",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "eu efetuo as alteracoes do sexo e ano de nascimento",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "eu clico no botao salvar alteracoes",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "o sistema apresenta um popup solicitando senha para confirmar alteracoes",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "eu seleciono o arquivo de massa \"editardadospessoais\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "eu insiro as informacoes \u003ccenario1\u003e",
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "eu clico no botao salvar",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "o sistema valida as alteracoes e atualiza na base de dados",
  "keyword": "Then "
});
formatter.examples({
  "line": 34,
  "name": "",
  "description": "",
  "id": "editar-dados-pessoais;editar-dados-pessoais;",
  "rows": [
    {
      "cells": [
        "cenario1"
      ],
      "line": 35,
      "id": "editar-dados-pessoais;editar-dados-pessoais;;1"
    },
    {
      "cells": [
        "SENHA"
      ],
      "line": 36,
      "id": "editar-dados-pessoais;editar-dados-pessoais;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 36,
  "name": "Editar dados pessoais",
  "description": "",
  "id": "editar-dados-pessoais;editar-dados-pessoais;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@EditarDadosPessoais"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "que eu tenha efetuado login no site da dafiti",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "eu clico no icone do usuario logado",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "o sistema apresenta um modal com opcoes, Inicio, Meus pedidos, Trocas e Devolucoes, Meus Favoritos, Informacoes de conta, Meus Enderecos, Cartoes e Vales e Sair",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "eu clico no link Informacoes de conta do modal",
  "keyword": "Then "
});
formatter.step({
  "line": 23,
  "name": "o sistema apresenta uma nova tela com os dados pessoais",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "eu clico no link editar informacoes",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "o sistema habilita os campos para edicao dos dados pessoais",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "eu efetuo as alteracoes do sexo e ano de nascimento",
  "keyword": "Then "
});
formatter.step({
  "line": 27,
  "name": "eu clico no botao salvar alteracoes",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "o sistema apresenta um popup solicitando senha para confirmar alteracoes",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "eu seleciono o arquivo de massa \"editardadospessoais\"",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "eu insiro as informacoes SENHA",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 31,
  "name": "eu clico no botao salvar",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "o sistema valida as alteracoes e atualiza na base de dados",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.que_eu_tenha_efetuado_login_no_site_da_dafiti()"
});
formatter.result({
  "duration": 42900,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_no_icone_do_usuario_logado()"
});
formatter.result({
  "duration": 769213500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_apresenta_um_modal_com_opcoes_Inicio_Meus_pedidos_Trocas_e_Devolucoes_Meus_Favoritos_Informacoes_de_conta_Meus_Enderecos_Cartoes_e_Vales_e_Sair()"
});
formatter.result({
  "duration": 44300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_no_link_Informacoes_de_conta_do_modal()"
});
formatter.result({
  "duration": 151565600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_apresenta_uma_nova_tela_com_os_dados_pessoais()"
});
formatter.result({
  "duration": 29600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_no_link_editar_informacoes()"
});
formatter.result({
  "duration": 2164063000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_habilita_os_campos_para_edicao_dos_dados_pessoais()"
});
formatter.result({
  "duration": 20700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_efetuo_as_alteracoes_do_sexo_e_ano_de_nascimento()"
});
formatter.result({
  "duration": 881919500,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_no_botao_salvar_alteracoes()"
});
formatter.result({
  "duration": 147608100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_apresenta_um_popup_solicitando_senha_para_confirmar_alteracoes()"
});
formatter.result({
  "duration": 47000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "editardadospessoais",
      "offset": 33
    }
  ],
  "location": "StepDefinitions.eu_seleciono_o_arquivo_de_massa(String)"
});
formatter.result({
  "duration": 207700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_insiro_as_informacoes_SENHA()"
});
formatter.result({
  "duration": 745953800,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.eu_clico_no_botao_salvar()"
});
formatter.result({
  "duration": 98929600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.o_sistema_valida_as_alteracoes_e_atualiza_na_base_de_dados()"
});
formatter.result({
  "duration": 20600,
  "status": "passed"
});
});