package unitTests;

import org.etudiant.Etudiant;
import org.etudiant.Notes;
import org.junit.Assert;
import org.junit.Test;

public class TestEtudiant {

    @Test
    public void CalculeMoyenne()
    {
        Notes notesEtudiant = new Notes(15.4,10,8);
        Etudiant etudiant = new Etudiant("Sofiene",notesEtudiant);
        etudiant.CalculerMoyenne();
        Assert.assertEquals(11.0,etudiant.getMoyenne(),0);
    }
}
