package page_object;

import acessar_navegadores.AcessarNavegadores;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_utils.ObterDadosCSV;

import java.io.IOException;
import java.util.HashMap;

public class AdicionarProdutoCarrinhoPage extends AcessarNavegadores  {

    private static HashMap<String, Object> hash_map;

    public static void informarProduto(By buscaTextfield) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 33);
        hash_map = ObterDadosCSV.obterDadosCSV();

//        WebElement aguarde = wait.until(ExpectedConditions.visibilityOfElementLocated(aguardeGenerico));

        WebElement produto = wait.until(ExpectedConditions.visibilityOfElementLocated(buscaTextfield));
        produto.sendKeys((CharSequence) hash_map.get("produto"));
    }

    public static void buscarProduto(By lupaIcon) {

        WebDriverWait wait = new WebDriverWait(driver, 11);

        WebElement entrar = wait.until(ExpectedConditions.visibilityOfElementLocated((lupaIcon)));
        entrar.click();

    }

    public static void enviarCarrinho(By comprarBtn, By produto, By tamanhoSelect, By tamanhoEscolhe, By continuaBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 33);

        WebElement continua = wait.until(ExpectedConditions.visibilityOfElementLocated((continuaBtn)));
        continua.click();

        WebElement prodDesejado = wait.until(ExpectedConditions.visibilityOfElementLocated((produto)));
        prodDesejado.click();

        WebElement selTamanho = wait.until(ExpectedConditions.visibilityOfElementLocated((tamanhoSelect)));
        selTamanho.click();

        WebElement escTamanho = wait.until(ExpectedConditions.visibilityOfElementLocated((tamanhoEscolhe)));
        escTamanho.click();



        WebElement comprar = wait.until(ExpectedConditions.visibilityOfElementLocated((comprarBtn)));
        comprar.click();

    }

}