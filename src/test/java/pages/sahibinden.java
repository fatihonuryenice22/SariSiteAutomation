package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;
import java.time.Duration;

public class sahibinden {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;
    By vasitabutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Vasıta\")");
    By motosikletbutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Motosiklet\")");
    By yamahabutonu = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Yamaha\")");
    By istenilenmotor = MobileBy.AndroidUIAutomator("new UiSelector().text(\"X-Max 250 ABS\")");
    By filtrelesecenegi = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Filtrele\")");
    By adres = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Adres\")");
    By sehir = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Tüm İller\")");
    By ankara = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Ankara\")");
    By izmir = MobileBy.AndroidUIAutomator("new UiSelector().text(\"İzmir\")");
    By tmm = MobileBy.AndroidUIAutomator("new UiSelector().text(\"TAMAM\")");
    By yil = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Yıl\")");
    By yilenaz = MobileBy.AndroidUIAutomator("new UiSelector().text(\"En az\")");
    By yilencok = MobileBy.AndroidUIAutomator("new UiSelector().text(\"En çok\")");
    By sonuclarigoster = MobileBy.AndroidUIAutomator("new UiSelector().text(\"SONUÇLARI GÖSTER\")");
    By sirala = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sırala\")");
    By endusukfiyat = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Fiyata göre (Önce en düşük)\")");
    By konumIzinVerme  = MobileBy.AndroidUIAutomator("new UiSelector().text(\"İzin Verme\")");

    public void swipeDownUntilTextVisible(String targetText) {
        String uiSelector = "new UiSelector().textMatches(\"" + targetText + "\")";
        String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(" + uiSelector + ");";

        driver.findElement(MobileBy.AndroidUIAutomator(command));
    }



    public sahibinden(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
        this.elementHelper= new ElementHelper(driver);
    }

    public void vasitaOptionTiklama() {
        driver.findElement(vasitabutonu).click();

    }

    public void motosikletOptionTiklama() {
        driver.findElement(motosikletbutonu).click();
    }

    public void yamahaMarkasiTiklama() {
        swipeDownUntilTextVisible("Yamaha");
        driver.findElement(yamahabutonu).click();
    }

    public void xmaxmodelTiklama() {
        swipeDownUntilTextVisible("X-Max 250 ABS");
        driver.findElement(istenilenmotor).click();
    }

    public void filtreleriUygulama() {
    driver.findElement(konumIzinVerme).click();
        driver.findElement(filtrelesecenegi).click();

        driver.findElement(adres).click();

        driver.findElement(sehir).click();
        driver.findElement(izmir).click();
        driver.findElement(ankara).click();
        driver.findElement(tmm).click();
        driver.findElement(tmm).click();
        driver.findElement(yil).click();
        driver.findElement(yilenaz).sendKeys("2019");
        driver.findElement(yilencok).sendKeys("2024");
        driver.findElement(tmm).click();
        driver.findElement(sonuclarigoster).click();
        driver.findElement(sirala).click();
        driver.findElement(endusukfiyat).click();
        try{
            Thread.sleep(10000);
        }
        catch(InterruptedException ie){
        }
    }

    public void ilanlariListelemeyeTiklama() {

    }
}
