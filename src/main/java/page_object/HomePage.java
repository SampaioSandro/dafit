package page_object;

import acessar_navegadores.AcessarNavegadores;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import page_utils.ObterDadosCSV;

import java.io.IOException;
import java.util.HashMap;

public class HomePage extends AcessarNavegadores  {

    private static HashMap<String, Object> hash_map;

    public static void acessarLogin(By entrarBtn) {

        WebDriverWait wait = new WebDriverWait(driver, 33);

//        WebElement aguarde = wait.until(ExpectedConditions.visibilityOfElementLocated(aguardeGenerico));

        WebElement entra = wait.until(ExpectedConditions.visibilityOfElementLocated((entrarBtn)));
        entra.click();

    }

    public static void informarLogin(By emailTextfield, By senhaTextField) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 33);
        hash_map = ObterDadosCSV.obterDadosCSV();

        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(emailTextfield));
        email.sendKeys((CharSequence) hash_map.get("email"));

        WebElement senha = wait.until(ExpectedConditions.visibilityOfElementLocated(senhaTextField));
        senha.sendKeys((CharSequence) hash_map.get("senha"));

    }

    public static void efetuarLogin(By logarBtn) throws IOException {

        WebDriverWait wait = new WebDriverWait(driver, 33);

        WebElement entrar = wait.until(ExpectedConditions.visibilityOfElementLocated((logarBtn)));
        entrar.click();
    }
}