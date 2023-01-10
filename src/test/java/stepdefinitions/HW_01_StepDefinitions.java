package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HW_01_SearchPage;
import utilities.Driver;

public class HW_01_StepDefinitions {
    @Given("Kullanıcı google sayfasına gider")
    public void kullanıcıGoogleSayfasınaGider() {
        Driver.getDriver().get("https://www.google.com/");

    }

    @When("Kullanıcı Cucumber kelimesini arar")
    public void kullanıcıCucumberKelimesiniArar() {
        HW_01_SearchPage sp = new HW_01_SearchPage(Driver.getDriver());
        sp.searchFor("Cucumber");
    }

    @Then("Kullanıcı açılan sayfanın title'ında Cucumber kelimesinin geçtğini doğrular")
    public void kullanıcıAçılanSayfanınTitleIndaCucumberKelimesininGeçtğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Cucumber"));

        Driver.closeDriver();
    }
}
