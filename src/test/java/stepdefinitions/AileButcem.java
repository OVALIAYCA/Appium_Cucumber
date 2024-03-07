package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import pages.AileButcemPage;
import utils.Driver;
import utils.ReusableMethods;

public class AileButcem {

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    AileButcemPage aileButcemPage = new AileButcemPage();


    @Given("ilk ekran ayarlarini {int} {int} {int} {int} {int} {int} {int} {int} yapin ve ardindan {string} login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(int for1, int for2, int xPress, int yPress, int waitAction, int xMoveTo, int yMoveTo, int treadSleep, String girisText) {
        {
            ReusableMethods.hardWait(2);
            for (int i = for1; i < for2 ; i++) {
                ReusableMethods.scrollScreen(xPress,yPress,waitAction,xMoveTo,yMoveTo,treadSleep);
            }

            ReusableMethods.scrollWithUiScrollable(girisText);
        }

    }
    @Given("mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin() {






    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {



    }
    @Given("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() {



    }
    @Given("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin() {



    }
    @Given("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {



    }
}
