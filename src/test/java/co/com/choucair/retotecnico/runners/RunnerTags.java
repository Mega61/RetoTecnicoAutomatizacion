package co.com.choucair.retotecnico.runners;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/uTestRegister.feature",
        tags = "@stories",
        glue = "co/com/choucair/retotecnico.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTags {

}
