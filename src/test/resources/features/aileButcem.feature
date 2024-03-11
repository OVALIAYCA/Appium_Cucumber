

Feature: Kullanici aile butcem gorevlerini gerceklestirir

  Background:

    * ilk ekran ayarlarini 0 6 946 1005 750 150 1005 500 yapin ve ardindan "Giriş Yap" login sayfasina ulasin
    * "email" ve "password" bilgilerini girerek kullanici bilgileriyle "Giriş Yap" giris yapin
    * uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin

  @ab
  Scenario Outline: Kullanici verilen gorevler uzerinden test gorevlerini yerine getirir

  * sol kisimdaki menuden "Hesabım" bolumune gidin

  * hesabim sayfasindaki bilgileri degistirerek "<name>" "<lastname>" "<city>" "<age>" "<job>" degisikleri kaydedin ve dogrulayin

  * kullanici uygulamayi kapatir



      Examples:
        | name  | lastname  | city  | age  | job  |
        | name1 | lastname1 | city1 | age1 | job1 |
        | name2 | lastname2 | city2 | age2 | job2 |
        | name3 | lastname3 | city3 | age3 | job3 |


  Scenario:

    * anasayfadaki arti 533 1677 0 butonuna tiklayin
    * "Gelir Ekle" bolumune tiklayin
    * Gelir Ekle sayfasinda aciklama kismina "Ilk gelir degeri " deger girilir
    * Gelir Ekle sayfasinda "Gelir Tipi" Gelir tipi "Düzensiz" secilir
    * Gelir Ekle sayfasinda "Kategori" Kategori "Serbest Gelir" secilir
    * Gelir Ekle sayfasinda Tarih belirlemesi 0 1 771 1056 500 270 1056 1000 ve gun secimi "25" yapilir
    * Gelir Ekle sayfasinda Tutar "10000" bilgisi girilir
    * "Kaydet" Butonuna text uzerinden Tiklanir
    * basariyla eklendigini dogrulayin
    * kullanici uygulamayi kapatir

  @ab
  Scenario:
    * anasayfadaki arti 533 1677 0 butonuna tiklayin
    * "Gelir Ekle" Butonuna text uzerinden Tiklanir
    * Gelir Ekle sayfasinda aciklama kismina "Ikinci gelir degeri " deger girilir
    * Gelir Ekle sayfasinda "Gelir Tipi" Gelir tipi "Düzenli" secilir
    * Gelir Ekle sayfasinda "Gelir Periyodu" Gelir tipi "Aylık" secilir
    * Gelir Ekle sayfasinda "Kategori" Kategori "Maaş Geliri" secilir
    * Gelir Ekle sayfasinda Tarih belirlemesi 0 2 771 1056 500 270 1056 1000 ve gun secimi "15" 975 1377 1000 yapilir
    * Gelir Ekle sayfasinda Tutar "8000" bilgisi girilir
    * "Kaydet" Butonuna text uzerinden Tiklanir
    * basariyla eklendigini dogrulayin
    * kullanici uygulamayi kapatir










