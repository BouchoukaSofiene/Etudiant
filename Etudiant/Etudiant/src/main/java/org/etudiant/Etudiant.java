package org.etudiant;

public class Etudiant {
    private String nom;
    private double moyenne;
    private Notes notes;

    public Etudiant(String nom, Notes notes) {
        this.nom = nom;
        this.notes = notes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public Notes getNotes() {
        return notes;
    }

    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    public void CalculerMoyenne()
    {
        this.moyenne = Math.round((this.notes.getFinance() + this.notes.getActuariat() + this.notes.getJava()) / 3);
    }
}
