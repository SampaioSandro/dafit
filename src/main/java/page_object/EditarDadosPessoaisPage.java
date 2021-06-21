package page_object;

import acessar_navegadores.AcessarNavegadores;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_utils.ObterDadosCSV;

import java.io.IOException;
import java.util.HashMap;

public class EditarDadosPessoaisPage extends AcessarNavegadores {

    private static HashMap<String, Object> hash_map;

    public static void minhaContaAcesso(By userLogado) {

        WebDriverWait wait = new WebDriverWait(driver, 33);

        WebElement usuario = wait.until(ExpectedConditions.visibilityOfElementLocated((userLogado)));
        usuario.click();

    }

    public static void minhaConta(By infoContaLink) {

        WebDriverWait wait = new WebDriverWait(driver, 11);

        WebElement minhaContaL = wait.until(ExpectedConditions.visibilityOfElementLocated((infoContaLink)));
        minhaContaL.click();

//        JavascriptExecutor java = (JavascriptExecutor) driver;
//        java.executeScript(String.valueOf(infoContaLink));
    }

    public static void habilitarAlterarDados(By editarBtn, By concordaBtn) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 33);

//        WebElement aguarde = wait.until(ExpectedConditions.visibilityOfElementLocated(aguardeGenerico));

        WebElement concorda = wait.until(ExpectedConditions.visibilityOfElementLocated((concordaBtn)));
        concorda.click();

        WebElement editar = wait.until(ExpectedConditions.visibilityOfElementLocated((editarBtn)));
        editar.click();
    }

    public static void alterarSexo(By sexoSelect, By aguardeGenerico, By sexoEscolhe) throws IOException, InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, 31);

        WebElement aguarde = wait.until(ExpectedConditions.visibilityOfElementLocated(aguardeGenerico));

        WebElement sexoSel = wait.until(ExpectedConditions.visibilityOfElementLocated((sexoSelect)));
        sexoSel.click();

        WebElement sexoEsc = wait.until(ExpectedConditions.visibilityOfElementLocated((sexoEscolhe)));
        sexoEsc.click();

    }

    public static void alterarDataNasc(By yearSelect, By yearEscolhe)throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 11);

        WebElement nasc = wait.until(ExpectedConditions.visibilityOfElementLocated((yearSelect)));
        nasc.click();

        WebElement year = wait.until(ExpectedConditions.elementToBeClickable((yearEscolhe)));
        year.click();

    }

    public static void atualizarDados(By salvarBtn) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 11);

        WebElement salvar = wait.until(ExpectedConditions.visibilityOfElementLocated((salvarBtn)));
        salvar.click();

    }

    public static void informaSenha(By confirmaSenha) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 11);
        hash_map = ObterDadosCSV.obterDadosCSV();

        WebElement senha = wait.until(ExpectedConditions.visibilityOfElementLocated((confirmaSenha)));
        senha.sendKeys((CharSequence) hash_map.get("senha"));

    }

    public static void confirmaDados(By confirmaBtn) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 11);

        WebElement salvar = wait.until(ExpectedConditions.visibilityOfElementLocated((confirmaBtn)));
        salvar.click();

    }

}