package model;

import enums.Sexe;

import java.time.LocalDate;

public class Oiseau extends Animal {
    private final String couleur;
    private boolean voliere;

    public Oiseau(String name, int poids, int taille, Sexe sexe, LocalDate dateNaissance, String couleur, boolean voliere) {
        super(name, poids, taille, sexe, dateNaissance);
        this.couleur = couleur;
        this.voliere = voliere;
        super.setProbaDeces(900);
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isVoliere() {
        return voliere;
    }

    public void setVoliere(boolean voliere) {
        this.voliere = voliere;
    }

    @Override
    public void crier() {
        System.out.println("PiouPiou");
    }

    @Override
    public String toString() {
        return super.toString() + "\ncouleur='" + couleur + '\'' +
                ", \nvoliere=" + voliere;
    }
}
