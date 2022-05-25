package model;

import enums.Sexe;

import java.time.LocalDate;

public class Chien extends Animal{
    private String couleurCollier;
    private final String race;
    private boolean estDresse;

    public Chien(String name, int poids, int taille, Sexe sexe, LocalDate dateNaissance, String couleurCollier, String race, boolean estDresse) {
        super(name, poids, taille, sexe, dateNaissance);
        this.couleurCollier = couleurCollier;
        this.race = race;
        this.estDresse = estDresse;
        super.setProbaDeces(10);
    }

    public String getCouleurCollier() {
        return couleurCollier;
    }

    public void setCouleurCollier(String couleurCollier) {
        this.couleurCollier = couleurCollier;
    }

    public String getRace() {
        return race;
    }

    public boolean isEstDresse() {
        return estDresse;
    }

    public void setEstDresse(boolean estDresse) {
        this.estDresse = estDresse;
    }

    @Override
    public void crier() {
        System.out.println("Ouaf");
    }

    @Override
    public String toString() {
        String s = super.toString();
        return s + "\ncouleurCollier='" + couleurCollier + '\'' +
                ", \nrace='" + race + '\'' +
                ", \nestDresse=" + estDresse;
    }
}
