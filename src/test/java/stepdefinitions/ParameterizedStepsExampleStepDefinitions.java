package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class ParameterizedStepsExampleStepDefinitions {

    //cucumber edition

    private int int1, int2, sonuc;


    @Given("İlk sayi {int}")
    public void ilkSayi(int sayi) {
        int1 = sayi;
        System.out.println("int1 = " + int1);
    }

    @Given("ikinci sayi {int}")
    public void ikinciSayi(int sayi) {
        int2 = sayi;
        System.out.println("int2 = " + int2);
    }

    @When("Bu sayıları {word} operatörüne sokarsam")
    public void buSayılarıOperatörüneSokarsam(String operator) {
        switch (operator) {
            case "+":
                sonuc = int1 + int2;
                break;
            case "-":
                sonuc = int1 - int2;
                break;

            case "*":
                sonuc = int1 * int2;
                break;

            case "/":
                sonuc = int1 / int2;
                break;
        }
        System.out.println("sonuc = " + sonuc);
    }

    @Then("sonuç {int} olmalıdır")
    public void sonucOlmalıdır(int sayi) {
        Assert.assertEquals(sayi, sonuc);
    }



    //regEx edition
    @Given("^Ismim \"(\\w+)\"$")
    public void ismim(String isim){
        System.out.println("isim = " + isim);
    }













}
