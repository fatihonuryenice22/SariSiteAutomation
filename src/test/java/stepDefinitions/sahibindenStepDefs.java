package stepDefinitions;

import io.cucumber.java.en.When;
import pages.sahibinden;
import util.DriverFactory;

public class sahibindenStepDefs {

    sahibinden sahibinden = new sahibinden(DriverFactory.getDriver());

    @When("vasita secenegi tiklanir")
    public void vasitaSecenegiTiklanir() {
        sahibinden.vasitaOptionTiklama();
    }

    @When("motosiklet secimi yapilir")
    public void motosikletSecimiYapilir() {
        sahibinden.motosikletOptionTiklama();
    }

    @When("yamaha markasi bulunur")
    public void yamahaMarkasiBulunur() {
        sahibinden.yamahaMarkasiTiklama();
    }

    @When("istenen model secilir")
    public void istenenModelSecilir() {
        sahibinden.xmaxmodelTiklama();
    }

    @When("gerekli filtreleme yapilir")
    public void gerekliFiltrelemeYapilir() {
        sahibinden.filtreleriUygulama();
    }

    @When("ilanlar listelenir")
    public void ilanlarListelenir() {
        sahibinden.ilanlariListelemeyeTiklama();
    }
}
