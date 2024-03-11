package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {

    public AileButcemPage(){
        PageFactory.initElements((WebDriver) Driver.getAndroidDriver(),this);

    }

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement emailBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public  WebElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    public WebElement successLoginText;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement nameBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement lastnameBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public WebElement cityBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public WebElement ageBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public WebElement jobBox;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public WebElement aciklamaKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public WebElement tutarKutusu;

    @FindBy(xpath = "(//*[@class='android.view.ViewGroup'])[12]")
    public WebElement tarihKutusu;

    @FindBy(id = "android:id/button1")
    public WebElement okButonu;

    @FindBy(xpath = "//*[@text='Gelir eklendi.']")
    public WebElement gelirEklemeCheck;


    public void firstScreenSettings() throws InterruptedException {
        for (int i=0; i<6; i++){

            ReusableMethods.scrollScreen(946,1005,750,150,1005,500);

        }
        ReusableMethods.scrollWithUiScrollable("Giriş Yap");
    }

    public void firstScreenDynamic(int for1, int for2, int xPress, int yPress, int waitAction, int xMoveTo, int yMoveTo, int treadSleep, String girisText)
    {

        ReusableMethods.hardWait(4);
        {
            for (int i = for1; i < for2 ; i++) {
                ReusableMethods.scrollScreen(xPress,yPress,waitAction,xMoveTo,yMoveTo,treadSleep);
            }

            ReusableMethods.scrollWithUiScrollable(girisText);
        }
    }

    public void ucCizgiTiklama (){

        ReusableMethods.hardWait(4);
        ReusableMethods.coordinateClick(113,135,500);

    }

    public void informationDelete(){

        nameBox.clear();
        lastnameBox.clear();
        cityBox.clear();
        ageBox.clear();
        jobBox.clear();

    }

    public void textBoxEnterData(String name, String lastname, String city, String age, String job){

        informationDelete();
        ReusableMethods.hardWait(2);
        nameBox.sendKeys(name);
        lastnameBox.sendKeys(lastname);
        cityBox.sendKeys(city);
        ageBox.sendKeys(age);
        jobBox.sendKeys(job);

        ReusableMethods.scrollWithUiScrollable("Kaydet");

    }

    public void textBoxKontrol(String name,String lastname,String city,String age,String job){
        Assert.assertTrue(nameBox.getText().contains(name));
        Assert.assertTrue(lastnameBox.getText().contains(lastname));
        Assert.assertTrue(cityBox.getText().contains(city));
        Assert.assertTrue(ageBox.getText().contains(age));
        Assert.assertTrue(jobBox.getText().contains(job));
    }

    public void tarihEkranKaydirmaMethodu(int for1,int forSart,int x1,int y1,int wait,int x2,int y2,int bekleme) throws InterruptedException {
        for (int i = for1; i < forSart; i++) {
            ReusableMethods.scrollScreen(x1, y1, wait, x2, y2, bekleme);

        }

    }


    public void setTarihKutusu(int x1,int y1,int beklemeSuresi) throws InterruptedException {
        ReusableMethods.coordinateClick(x1,y1,beklemeSuresi);

    }





}
