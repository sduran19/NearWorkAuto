package co.com.poli.nearworkauto.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/features",
        glue = "co.com.poli.nearworkauto.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class UserRunner {
}
