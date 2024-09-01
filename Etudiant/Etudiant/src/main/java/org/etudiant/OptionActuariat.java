package org.etudiant;

public class OptionActuariat implements Option {
    public static final double COEFFICIENT_ACTUARIAT = 1.9f;
    public static final double COEFFICIENT_FINANCE = 1.2f;
    public static final double COEFFICIENT_JAVA = 1.1f;
    @Override
    public double calculerScore(Etudiant etudiant) {
        return Math.round(etudiant.getMoyenne() +
                (etudiant.getNotes().getFinance() * COEFFICIENT_FINANCE) +
                (etudiant.getNotes().getActuariat() * COEFFICIENT_ACTUARIAT) +
                (etudiant.getNotes().getJava() * COEFFICIENT_JAVA));
    }
}
