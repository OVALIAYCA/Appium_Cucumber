package stepdefinitions;

import io.cucumber.java.en.Given;
import utils.BrowserDriver;

public class browserDeneme {



    @Given("Kullanici belirledigi url e {string} gider")
    public void kullanici_belirledigi_url_e_gider(String url) {

        BrowserDriver.getBrowserDriver().get(url);

    }

}
