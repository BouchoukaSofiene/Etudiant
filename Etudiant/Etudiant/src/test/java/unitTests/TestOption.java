package unitTests;

import org.etudiant.*;
import org.junit.Assert;
import org.junit.Test;

public class TestOption {

    @Test
    public void CalculerScorePourFinance() {
        Notes notesEtudiant = new Notes(15.4,10,8);
        Etudiant etudiant = new Etudiant("Sofiene",notesEtudiant);
        etudiant.CalculerMoyenne();
        Option option = new OptionFinance();
        double score = option.calculerScore(etudiant);
        Assert.assertEquals(55.0,score,0);
    }

    @Test
    public void CalculerScorePourActuariat() {
        Notes notesEtudiant = new Notes(15.4,10,8);
        Etudiant etudiant = new Etudiant("Sofiene",notesEtudiant);
        etudiant.CalculerMoyenne();
        Option option = new OptionActuariat();
        double score = option.calculerScore(etudiant);
        Assert.assertEquals(57.0,score,0);
    }

    @Test
    public void CalculerScorePourJava() {
        Notes notesEtudiant = new Notes(15.4,10,8);
        Etudiant etudiant = new Etudiant("Sofiene",notesEtudiant);
        etudiant.CalculerMoyenne();
        Option option = new OptionJava();
        double score = option.calculerScore(etudiant);
        Assert.assertEquals(56.0,score,0);
    }
}
