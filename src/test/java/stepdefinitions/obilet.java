package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.ObiletPage;
import utils.BrowserDriver;
import utils.ReusableMethods;

public class obilet {

    ObiletPage obiletPage = new ObiletPage();

    @Given("{string} sayfasina gidilir")
    public void https_www_obilet_com_en_sayfasina_gidilir(String url) {

        BrowserDriver.getBrowserDriver().get(url);

    }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() {

        obiletPage.menuButton.click();
        obiletPage.languageButton.click();
        ReusableMethods.hardWait(1);
        obiletPage.turkishLanguage.click();



    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() {

        obiletPage.menuButton.click();
        ReusableMethods.hardWait(1);
        obiletPage.currencySelect.click();
        ReusableMethods.hardWait(1);
        obiletPage.turkishLira.click();



    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {


        obiletPage.searchButton.click();




    }
    @Given("gelen bilet fiyatlarinin {string} oldugu dogrulanir")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulanir(String paraBirimi) {

        ReusableMethods.hardWait(5);
        Assert.assertTrue(obiletPage.priceTypeResult.getText().contains(paraBirimi));



    }


    @Given("kullanici browser i kapatir")
    public void kullanici_browser_i_kapatir() {

        BrowserDriver.quitAppiumDriver();



    }
}
