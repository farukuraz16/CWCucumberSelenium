package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Before methodu calisti");
    }

    @After
    public void teardown(){
        System.out.println("Afret methodu çalıştı");
        Driver.closeDriver();
    }

}
