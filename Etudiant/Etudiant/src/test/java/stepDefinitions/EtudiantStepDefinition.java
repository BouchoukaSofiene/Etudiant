package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import unitTests.TestEtudiant;

public class EtudiantStepDefinition {

    @Given("Un etudiant ayant des notes")
    public void unEtudiantAyantDesNotes() {
    }

    @When("Un etudiant veut calculer sa moyenne")
    public void unEtudiantVeutCalculerSaMoyenne() {

    }

    @Then("Calcule moyenne")
    public void calculeMoyenne() {
        TestEtudiant testEtudiant = new TestEtudiant();
        testEtudiant.CalculeMoyenne();
    }


}
