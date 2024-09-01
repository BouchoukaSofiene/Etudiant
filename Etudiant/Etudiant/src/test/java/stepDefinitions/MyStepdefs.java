package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import unitTests.TestEtudiant;
import unitTests.TestOption;

public class MyStepdefs {

    @Given("Un etudiant ayant une moyenne")
    public void unEtudiantAyantUneMoyenne() {
        TestEtudiant testEtudiant = new TestEtudiant();
        testEtudiant.CalculeMoyenne();
    }

    @When("Un etudiant veut savoir son score pour l'option")
    public void unEtudiantVeutSavoirSonScore() {

    }

    @Then("Le système calcule le score pour l'option finance")
    public void leSystèmeCalculeLeScorePourLOptionFinance() {
        TestOption testOption = new TestOption();
        testOption.CalculerScorePourFinance();
    }

    @Then("Le système calcule le score pour l'option actuariat")
    public void leSystèmeCalculeLeScorePourLOptionActuariat() {
        TestOption testOption = new TestOption();
        testOption.CalculerScorePourActuariat();
    }
    @Then("Le système calcule le score pour l'option java")
    public void leSystèmeCalculeLeScorePourLOptionJava() {
        TestOption testOption = new TestOption();
        testOption.CalculerScorePourJava();
    }
}
