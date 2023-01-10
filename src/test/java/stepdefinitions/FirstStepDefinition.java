package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepDefinition {
    @Given("Ilk feature için cucumber indirdim")
    public void ılk_feature_için_cucumber_indirdim() {
        System.out.println("Given step i çalıştı");
    }
    @When("Senaryomu çalıştırıdığımda")
    public void senaryomu_çalıştırıdığımda() {
        System.out.println("When step i çalıştı");

    }
    @Then("senaryom çalıştığında konsolda görmeliyim")
    public void senaryom_çalıştığında_konsolda_görmeliyim() {
        System.out.println("Then step i çalıştı");

    }
}
