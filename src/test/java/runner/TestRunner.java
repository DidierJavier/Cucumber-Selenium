package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(
        //snippets = CucumberOptions.SnippetType.CAMELCASE,
        features = {"src/test/java/features/test.feature", "src/test/java/features/escenarios.feature"},
        glue = {"seleniumgluecode"},
        plugin = { "json:test/report/cucumber_report.json"},
        snippets = SnippetType.CAMELCASE,
        tags = {"@browser", "~@probando"}
)

public class TestRunner {

    @AfterClass
    public static void finish(){
        try{
            System.out.println("Generando reporte");
            String[] cmd = {"cmd.exe", "/c", "npm run report"};
            Runtime.getRuntime().exec(cmd);
            System.out.println("Reporte generado satisfactoriamente");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
