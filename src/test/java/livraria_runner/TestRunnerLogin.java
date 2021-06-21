package livraria_runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        format = {"pretty", "html:target/cucumber-html-report"},
        features = "classpath:features",
        tags = "@EfetuarLogin",           // Esta OK
//        tags = "@AdicionarProduto",       // Esta OK
//        tags = "@EditarDadosPessoais",       // Esta OK
        glue = "classpath:steps"
//        glue = "src/main/java/steps"
//        dryRun = false
)

public class TestRunnerLogin {
}
