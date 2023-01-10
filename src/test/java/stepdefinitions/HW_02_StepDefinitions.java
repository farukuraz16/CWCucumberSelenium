package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.HW_02_SearchPage;
import utilities.Driver;

public class HW_02_StepDefinitions {
    @Given("Kullanıcı Google'a  gider")
    public void kullanıcıGoogleAGider() {
        Driver.getDriver().get("https://www.google.com/");
    }

    @When("Kullanıcı Selenium kelimesini arar")
    public void kullanıcıSeleniumKelimesiniArar() {
        HW_02_SearchPage sp = new HW_02_SearchPage(Driver.getDriver());
        sp.searchFor("selenium");
    }

    @Then("Kullanıcı açılan sayfanın title'ında Selenium kelimesinin geçtğini doğrular")
    public void kullanıcıAçılanSayfanınTitleIndaSeleniumKelimesininGeçtğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));

        Driver.closeDriver();
    }
}
