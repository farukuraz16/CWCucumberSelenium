package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class GoogleStepDefinitions {
    @Given("Kullanıcı google sayfasındadır")
    public void kullanıcıGoogleSayfasındadır() {

        Driver.getDriver().get("https://www.google.com/");
    }

    @When("Kullanıcı samsung kelimesini arar")
    public void kullanıcıSamsungKelimesiniArar() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("samsung");
    }

    @Then("Kullanıcı sayfada samsung kelimesi geçtğini doğrular")
    public void kullanıcıSayfadaSamsungKelimesiGeçtğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

    Driver.closeDriver();
    }

    @Then("Kullanıcı samsung kelimesinin geçtğini doğrular")
    public void kullanıcıSamsungKelimesininGeçtğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("samsung"));

        Driver.closeDriver();

    }

    @When("Kullanıcı cucumber kelimesini arar")
    public void kullanıcıCucumberKelimesiniArar() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("cucumber");
    }

    @Then("Kullanıcı cucumber kelimesinin geçtğini doğrular")
    public void kullanıcıCucumberKelimesininGeçtğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("cucumber"));

        Driver.closeDriver();

    }

    @When("Kullanıcı selenium kelimesini arar")
    public void kullanıcıSeleniumKelimesiniArar() {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor("selenium");
    }

    @Then("Kullanıcı selenium kelimesinin geçtğini doğrular")
    public void kullanıcıSeleniumKelimesininGeçtğiniDoğrular() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("selenium"));

        Driver.closeDriver();

    }
}
