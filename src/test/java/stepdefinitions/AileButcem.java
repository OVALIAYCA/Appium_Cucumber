package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;


public class AileButcem {

    AndroidDriver<AndroidElement> driver = Driver.getAndroidDriver();
    AileButcemPage aileButcemPage = new AileButcemPage();


    @Given("ilk ekran ayarlarini {int} {int} {int} {int} {int} {int} {int} {int} yapin ve ardindan {string} login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(int for1, int for2, int xPress, int yPress, int waitAction, int xMoveTo, int yMoveTo, int treadSleep, String girisText) {

        aileButcemPage.firstScreenDynamic(for1, for2, xPress, yPress,  waitAction, xMoveTo,  yMoveTo, treadSleep, girisText);

    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string} giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String email, String password, String girisYap) {

        aileButcemPage.emailBox.sendKeys(ConfigReader.getProperty(email));
        aileButcemPage.passwordBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.scrollWithUiScrollable(girisYap);


    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {

        Assert.assertTrue(aileButcemPage.successLoginText.isDisplayed());

    }
    @Given("sol kisimdaki menuden {string} bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(String hesabim) {


        aileButcemPage.ucCizgiTiklama();
        ReusableMethods.scrollWithUiScrollable(hesabim);


    }
    @Given("hesabim sayfasindaki bilgileri degistirerek {string} {string} {string} {string} {string} degisikleri kaydedin ve dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String name, String lastname, String city, String age, String job) {


        aileButcemPage.textBoxEnterData(ConfigReader.getProperty(name),ConfigReader.getProperty(lastname),ConfigReader.getProperty(city)
        ,ConfigReader.getProperty(age),ConfigReader.getProperty(job));
        aileButcemPage.textBoxKontrol(ConfigReader.getProperty(name),ConfigReader.getProperty(lastname),ConfigReader.getProperty(city)
                ,ConfigReader.getProperty(age),ConfigReader.getProperty(job));

    }

    @Given("kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {

        Driver.quitAppiumDriver();


    }


    @Given("anasayfadaki arti {int} {int} {int} butonuna tiklayin")
    public void anasayfadaki_arti_butonuna_tiklayin(int x, int y, int wait) {

        ReusableMethods.coordinateClick(x,y,wait);



    }
    @Given("{string} bolumune tiklayin")
    public void gelir_ekle_bolumune_tiklayin(String incomeText) {

        ReusableMethods.scrollWithUiScrollable(incomeText);

    }



    @Given("Gelir Ekle sayfasinda aciklama kismina {string} deger girilir")
    public void gelir_ekle_sayfasinda_aciklama_kismina_deger_girilir(String ilkKutu) {

        aileButcemPage.aciklamaKutusu.sendKeys(ilkKutu);

    }
    @Given("Gelir Ekle sayfasinda {string} Gelir tipi {string} secilir")
    public void gelir_ekle_sayfasinda_gelir_tipi_secilir(String gelirTipiButonu,String GelirTipi) {
        ReusableMethods.scrollWithUiScrollable(gelirTipiButonu);
        ReusableMethods.hardWait(1);
        ReusableMethods.scrollWithUiScrollable(GelirTipi);
    }
    @Given("Gelir Ekle sayfasinda {string} Kategori {string} secilir")
    public void gelir_ekle_sayfasinda_kategori_secilir(String kategori,String kategoriTuru) {
        ReusableMethods.scrollWithUiScrollable(kategori);
        ReusableMethods.hardWait(1);
        ReusableMethods.scrollWithUiScrollable(kategoriTuru);
        ReusableMethods.hardWait(1);


    }
    @Given("Gelir Ekle sayfasinda Tarih belirlemesi {int} {int} {int} {int} {int} {int} {int} {int} ve gun secimi {string} {int} {int} {int} yapilir")
    public void gelir_ekle_sayfasinda_tarih_belirlemesi_yapilir(int for1,int forSart,int x1,int y1,int wait,int x2,int y2,int bekleme,String gun,int tiklamax1,int tiklamax2,int bekleme2) throws InterruptedException {
        // aileButcemPage.tarihKutusu.click(); // 409,1246
        aileButcemPage.setTarihKutusu(tiklamax1,tiklamax2,bekleme2);
        aileButcemPage.tarihEkranKaydirmaMethodu(for1,forSart,x1,y1,wait,x2,y2,bekleme);
        ReusableMethods.scrollWithUiScrollable(gun);
        aileButcemPage.okButonu.click(); // 975,1377

    }
    @Given("Gelir Ekle sayfasinda Tutar {string} bilgisi girilir")
    public void gelir_ekle_sayfasinda_tutar_bilgisi_girilir(String tutar) {

        aileButcemPage.tutarKutusu.sendKeys(tutar);

    }
    @Given("{string} Butonuna text uzerinden Tiklanir")
    public void kaydet_butonuna_tiklanir(String text) {


        ReusableMethods.scrollWithUiScrollable(text);



    }
    @Given("{string}, {string}, {string}, {string}, {string}, {int} {int} ve tutari belirleyin ve kaydedin")
    public void aciklama_gelir_tip_kategori_tarih_ve_tutari_belirleyin_ve_kaydedin(String ilkGelir, String gelirTipi) {

        ReusableMethods.scrollWithUiScrollable(ilkGelir);
        ReusableMethods.scrollWithUiScrollable(gelirTipi);


    }
    @Given("basariyla eklendigini dogrulayin")
    public void basariyla_eklendigini_dogrulayin() {

        Assert.assertTrue(aileButcemPage.gelirEklemeCheck.isDisplayed());
    }


}
