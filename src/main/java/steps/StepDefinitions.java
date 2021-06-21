package steps;

import acessar_navegadores.AcessarNavegadores;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import element_locators.ElementLocators;
import page_object.AdicionarProdutoCarrinhoPage;
import page_object.EditarDadosPessoaisPage;
import page_object.HomePage;

public class StepDefinitions {

    public static String massaCsv = null;

    //EfetuarLogin
    @Given("^que eu tenha acessado o site atraves da \"([^\"]*)\"$")
    public void que_eu_tenha_acessado_o_site_atraves_da(String url) throws Throwable {
        AcessarNavegadores.abrirChrome(url);
    }

    @When("^eu clico no icone entrar$")
    public void eu_clico_no_icone_entrar() throws Throwable {
        HomePage.acessarLogin(ElementLocators.entrarBtn);
    }

    @Then("^o sistema apresenta uma nova tela com opcoes de login, facebook, twitter, apple ou com email e senha$")
    public void o_sistema_apresenta_uma_nova_tela_com_opcoes_de_login_facebook_twitter_apple_ou_com_email_e_senha() throws Throwable {
    }

    @Then("^eu seleciono o arquivo de massa \"([^\"]*)\"$")
    public void eu_seleciono_o_arquivo_de_massa(String massa) throws Throwable {
        massaCsv = massa;
    }

    @Then("^eu insiro as informacoes USUARIO_VALIDO$")
    public void eu_insiro_as_informacoes_USUARIO_VALIDO() throws Throwable {
        HomePage.informarLogin(ElementLocators.emailTextfield, ElementLocators.senhaTextField);
    }

    @Then("^eu clico na opcao entrar$")
    public void eu_clico_na_opcao_entrar() throws Throwable {
        HomePage.efetuarLogin(ElementLocators.logarBtn);
    }

    @Then("^o sistema valida as informacoes$")
    public void o_sistema_valida_as_informacoes() throws Throwable {
    }

    @Then("^me direciona para home com o usuario ja logado$")
    public void me_direciona_para_home_com_o_usuario_ja_logado() throws Throwable {
    }

    //Adicionar produto ao carrinho
    @Given("^que eu tenha efetuado login no site da dafiti$")
    public void que_eu_tenha_efetuado_login_no_site_da_dafiti() throws Throwable {
    }

    @Then("^eu insiro as informacoes PRODUTO_PESQUISADO$")
    public void eu_insiro_as_informacoes_PRODUTO_PESQUISADO() throws Throwable {
        AdicionarProdutoCarrinhoPage.informarProduto(ElementLocators.buscaTextfield);
    }

    @Then("^eu clico na lupa para efetuar a pesquisa$")
    public void eu_clico_na_lupa_para_efetuar_a_pesquisa() throws Throwable {
        AdicionarProdutoCarrinhoPage.buscarProduto(ElementLocators.lupaIcon);
    }

    @Then("^o sistema apresenta na mesma pagina um ou mais produtos, valor, botao comprar$")
    public void o_sistema_apresenta_na_mesma_pagina_um_ou_mais_produtos_valor_botao_comprar() throws Throwable {
    }

    @Then("^eu clico no produto desejado e no botao comprar$")
    public void eu_clico_no_produto_desejado_e_no_botao_comprar() throws Throwable {
        AdicionarProdutoCarrinhoPage.enviarCarrinho(ElementLocators.comprarBtn, ElementLocators.produto, ElementLocators.tamanhoSelect, ElementLocators.tamanhoEscolhe, ElementLocators.continuaBtn);
    }

    @Then("^o sistema adiciona o produto ao carrinho para eu decidir sobre a compra posteriormente$")
    public void o_sistema_adiciona_o_produto_ao_carrinho_para_eu_decidir_sobre_a_compra_posteriormente() throws Throwable {
    }

    //Editar Dados Pessoais

    @When("^eu clico no icone do usuario logado$")
    public void eu_clico_no_icone_do_usuario_logado() throws Throwable {
        EditarDadosPessoaisPage.minhaContaAcesso(ElementLocators.userLogado);
    }

    @Then("^o sistema apresenta um modal com opcoes, Inicio, Meus pedidos, Trocas e Devolucoes, Meus Favoritos, Informacoes de conta, Meus Enderecos, Cartoes e Vales e Sair$")
    public void o_sistema_apresenta_um_modal_com_opcoes_Inicio_Meus_pedidos_Trocas_e_Devolucoes_Meus_Favoritos_Informacoes_de_conta_Meus_Enderecos_Cartoes_e_Vales_e_Sair() throws Throwable {
    }

    @Then("^eu clico no link Informacoes de conta do modal$")
    public void eu_clico_no_link_Informacoes_de_conta_do_modal() throws Throwable {
        EditarDadosPessoaisPage.minhaConta(ElementLocators.infoContaLink);
    }

    @Then("^o sistema apresenta uma nova tela com os dados pessoais$")
    public void o_sistema_apresenta_uma_nova_tela_com_os_dados_pessoais() throws Throwable {
    }

    @Then("^eu clico no link editar informacoes$")
    public void eu_clico_no_link_editar_informacoes() throws Throwable {
        EditarDadosPessoaisPage.habilitarAlterarDados(ElementLocators.editarBtn, ElementLocators.concordaBtn);
    }

    @Then("^o sistema habilita os campos para edicao dos dados pessoais$")
    public void o_sistema_habilita_os_campos_para_edicao_dos_dados_pessoais() throws Throwable {
    }

    @Then("^eu efetuo as alteracoes do sexo e ano de nascimento$")
    public void eu_efetuo_as_alteracoes_do_sexo_e_ano_de_nascimento() throws Throwable {
        EditarDadosPessoaisPage.alterarSexo(ElementLocators.sexoSelect, ElementLocators.aguardeGenerico, ElementLocators.sexoEscolhe);
        EditarDadosPessoaisPage.alterarDataNasc(ElementLocators.yearSelect, ElementLocators.yearEscolhe);
    }

    @Then("^eu clico no botao salvar alteracoes$")
    public void eu_clico_no_botao_salvar_alteracoes() throws Throwable {
        EditarDadosPessoaisPage.atualizarDados(ElementLocators.salvarBtn);
    }

    @Then("^o sistema apresenta um popup solicitando senha para confirmar alteracoes$")
    public void o_sistema_apresenta_um_popup_solicitando_senha_para_confirmar_alteracoes() throws Throwable {
    }

    @Then("^eu insiro as informacoes SENHA$")
    public void eu_insiro_as_informacoes_SENHA() throws Throwable {
        EditarDadosPessoaisPage.informaSenha(ElementLocators.confirmaSenha);
    }

    @Then("^eu clico no botao salvar$")
    public void eu_clico_no_botao_salvar() throws Throwable {
        EditarDadosPessoaisPage.confirmaDados(ElementLocators.confirmaBtn);
    }

    @Then("^o sistema valida as alteracoes e atualiza na base de dados$")
    public void o_sistema_valida_as_alteracoes_e_atualiza_na_base_de_dados() throws Throwable {
//        AcessarNavegadores.fecharBrowser();
    }
}