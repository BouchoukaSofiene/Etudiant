package org.etudiant;

public class OptionFinance implements Option {
    public static final double COEFFICIENT_FINANCE = 1.5f;
    public static final double COEFFICIENT_ACTUARIAT = 1.1f;
    public static final double COEFFICIENT_JAVA = 1.2f;
    @Override
    public double calculerScore(Etudiant etudiant) {
        return Math.round(etudiant.getMoyenne() +
                (etudiant.getNotes().getFinance() * COEFFICIENT_FINANCE) +
                (etudiant.getNotes().getActuariat() * COEFFICIENT_ACTUARIAT) +
                (etudiant.getNotes().getJava() * COEFFICIENT_JAVA));
    }
}
