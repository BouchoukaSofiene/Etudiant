package org.etudiant;

public class Notes {
    private double finance;
    private double actuariat;
    private double java;

    public Notes(double finance, double actuariat, double java) {
        this.finance = finance;
        this.actuariat = actuariat;
        this.java = java;
    }

    public double getFinance() {
        return finance;
    }

    public void setFinance(double finance) {
        this.finance = finance;
    }

    public double getActuariat() {
        return actuariat;
    }

    public void setActuariat(double actuariat) {
        this.actuariat = actuariat;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }
}
