package getLandEstate.stepDefinitons.uiStepDef;

import getLandEstate.utilities.ConfigReader;
import getLandEstate.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CPTourRequestsStepDef {

    @Given("Belirtilen URL'ye gidilir ve Login olunur")
    public void belirtilen_url_ye_gidilir_ve_login_olunur() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }
    @When("Login butonu tiklanir")
    public void login_butonu_tiklanir() {

    }
    @When("Back to Site butonu tiklanir")
    public void back_to_site_butonu_tiklanir() {

    }
    @Given("Properties butonu tiklanir")
    public void properties_butonu_tiklanir() {

    }
    @When("Herhangi bir ilana tiklanir")
    public void herhangi_bir_ilana_tiklanir() {

    }
    @When("Tour Date bolumune her hangi bir tarih girilir")
    public void tour_date_bolumune_her_hangi_bir_tarih_girilir() {

    }
    @When("Tour Time bolumune her hangi bir saat girilir")
    public void tour_time_bolumune_her_hangi_bir_saat_girilir() {

    }
    @When("Submit a tour request butonuna tiklanir")
    public void submit_a_tour_request_butonuna_tiklanir() {

    }
    @When("TourRequest created successfully yazisi ile bir ilan için randevu oluşturuldugu dogrulanir")
    public void tour_request_created_successfully_yazisi_ile_bir_ilan_için_randevu_oluşturuldugu_dogrulanir() {

    }
    @When("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }
}
