package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.GoogleSearchPage;
import utilities.Driver;

public class ParameterizedStepsDefinitions {
    @When("kullanıcı {string} arattığında")
    public void kullanıcıArattığında(String key) {
        GoogleSearchPage sp = new GoogleSearchPage(Driver.getDriver());
        sp.searchFor(key);

    }

    @Then("kullanıcı titleda {string} görmelidir")
    public void kullanıcıTitledaGörmelidir(String key) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(key));

        Driver.closeDriver();

    }
}
