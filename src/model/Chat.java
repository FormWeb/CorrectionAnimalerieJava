package model;

import enums.Caractere;
import enums.Sexe;

import java.time.LocalDate;

public class Chat extends Animal{
    private boolean poilLong;
    private Caractere caractere;
    private boolean griffeCoupee;

    public Chat(String name, int poids, int taille, Sexe sexe, LocalDate dateNaissance, boolean poilLong, Caractere caractere, boolean griffeCoupee) {
        super(name, poids, taille, sexe, dateNaissance);
        this.poilLong = poilLong;
        this.caractere = caractere;
        this.griffeCoupee = griffeCoupee;
        super.setProbaDeces(5);
    }

    public boolean isPoilLong() {
        return poilLong;
    }

    public void setPoilLong(boolean poilLong) {
        this.poilLong = poilLong;
    }

    public Caractere getCaractere() {
        return caractere;
    }

    public void setCaractere(Caractere caractere) {
        this.caractere = caractere;
    }

    public boolean isGriffeCoupee() {
        return griffeCoupee;
    }

    public void setGriffeCoupee(boolean griffeCoupee) {
        this.griffeCoupee = griffeCoupee;
    }

    @Override
    public void crier() {
        System.out.println("Miaou");
    }

    @Override
    public String toString() {
        return super.toString() + "\npoilLong=" + poilLong +
                ", \ncaractere=" + caractere +
                ", \ngriffeCoupee=" + griffeCoupee;
    }
}
