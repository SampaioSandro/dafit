package element_locators;

import org.openqa.selenium.By;

public class ElementLocators {

    //EfetuarLogin
    public static By entrarBtn = By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/div[1]/a[1]"); // utilizado também no Efetuar Login e AlterarEnderecoEntrega
    public static By emailTextfield  = By.id("LoginForm_email");
    public static By senhaTextField  = By.id("LoginForm_password");
    public static By logarBtn        = By.id("customer-account-login");

    //AdicionarProdutoCarrinho
    public static By buscaTextfield  = By.name("q");
    public static By lupaIcon        = By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/div[2]/div/form/div[1]/button");
    public static By produto         = By.xpath("/html/body/div[3]/div[5]/div[3]/div[3]/div/div[2]/div[2]/div[1]/a/img");
    public static By tamanhoSelect   = By.xpath("/html/body/div[3]/div[4]/div[3]/div[2]/div[2]/div[2]/form/div[2]/i");
    public static By tamanhoEscolhe  = By.xpath("/html/body/div[3]/div[4]/div[3]/div[2]/div[2]/div[2]/form/div[2]/ul/li[6]");
    public static By comprarBtn      = By.xpath("/html/body/div[3]/div[4]/div[3]/div[2]/div[2]/div[2]/form/button");

    //Editar dados Pessoais
    public static By userLogado      = By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/div[3]/div[1]/div[1]/a[2]");

    public static By infoContaLink   = By.xpath("/html/body/div[4]/div[1]/div[2]/div/div/div[3]/div[1]/div[2]/div/ul/li[6]/a");
    public static By editarBtn       = By.id("myaccount_edit_info");
    public static By continuaBtn     = By.xpath("/html/body/div[3]/div[2]/div/div/button");
    public static By concordaBtn     = By.xpath("/html/body/div[4]/div[2]/div/div/button");
    public static By sexoSelect      = By.xpath("/html/body/div[4]/div[3]/div[3]/div[2]/div[2]/form/dl/div[4]/dd/div/i");
    public static By sexoEscolhe     = By.xpath("/html/body/div[4]/div[3]/div[3]/div[2]/div[2]/form/dl/div[4]/dd/div/ul/li[2]");
    public static By yearSelect      = By.xpath("/html/body/div[4]/div[3]/div[3]/div[2]/div[2]/form/dl/div[6]/dd/div/div[3]/div/i");
    public static By yearEscolhe     = By.xpath("/html/body/div[4]/div[3]/div[3]/div[2]/div[2]/form/dl/div[6]/dd/div/div[3]/div/ul/li[42]");
    public static By salvarBtn       = By.id("myaccount-submit-edit");
    public static By confirmaSenha   = By.id("CheckPasswordForm_password");
    public static By confirmaBtn     = By.id("myaccount-confirm-password-submit");

    //Genérico
    public static By aguardeGenerico = By.xpath("/html/body/div[4]/div[3]/div[3]/div[2]/div[2]/div/div/div/div/div[1]/button/span[1]");
//    public static By aguardeGenerico = By.xpath("/html/body/div[3]/div[8]/div[1]/div[5]/div/div[3]/a[2]/img");
}
