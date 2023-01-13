package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features/07_Hooks.feature"},
        glue = {"stepdefinitions","hooks"},//hangi dosyalar lazımsa onların adını ekliyoruz
        plugin = {"html:target/cucumber-reports.html",
                  "json:target/json-reports/cucumber-json.json",
                "junit:target/cucumber-xml.xml",
                "pretty"//daha güzel bir görüntü..renkli...
        },
        monochrome = false //true olursa tüm rapor beyaz font oluyor. false olursa pretty yaptığımız gibi renkli font..
)
public class ReportRunner {

}
