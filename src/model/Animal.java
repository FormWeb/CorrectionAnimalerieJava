package model;

import enums.Sexe;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

public class Animal {
    private String name;
    private int poids;
    private int taille;
    private Sexe sexe;
    private LocalDate dateNaissance;
    private LocalDate dateArrivee;
    private int probaDeces;
    private boolean dead;

    public Animal(String name, int poids, int taille, Sexe sexe, LocalDate dateNaissance) {
        this.name = name;
        this.poids = poids;
        this.taille = taille;
        this.sexe = sexe;
        this.dateNaissance = dateNaissance;
        this.dateArrivee = LocalDate.now();
        this.dead = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoids() {
        return poids;
    }

    public void setPoids(int poids) {
        this.poids = poids;
    }

    public int getTaille() {
        return taille;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    public int getProbaDeces() {
        return probaDeces;
    }

    public void setProbaDeces(int probaDeces) {
        this.probaDeces = probaDeces;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public int getAge() {
        Period period = Period.between(LocalDate.now(), this.dateNaissance);
        return period.getYears();
    }

    public int getAgeHumain() {
        return this.getAge();
    }

    public void crier() {
        System.out.println("?");
    }

    public void passerNuit() {
        Random rand = new Random();
        if (rand.nextInt(1000) < probaDeces) {
            this.setDead(true);
        }
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", \npoids=" + poids +
                ", \ntaille=" + taille +
                ", \nsexe=" + sexe +
                ", \ndateNaissance=" + dateNaissance +
                ", \ndateArrivee=" + dateArrivee;
    }
}
