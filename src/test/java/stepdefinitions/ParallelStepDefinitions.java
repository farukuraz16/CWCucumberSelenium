package stepdefinitions;

import io.cucumber.java.en.Given;

public class ParallelStepDefinitions {
    @Given("Thread ID yi yazdir")
    public void threadIDYiYazdir() {
        System.out.println("Thread ID= "+ Thread.currentThread().getId());
    }
}
