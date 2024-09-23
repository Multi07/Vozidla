package org.example;

public class Auto extends Vozidlo {
    public int pocetDveri;

    public Auto(String spz, String vyrobce, String model, int rokVyroby, int pocetDveri) {
        super(spz, vyrobce, model, rokVyroby);
        this.pocetDveri = pocetDveri;
    }

    public int getPocetDveri() {
        return pocetDveri;
    }

    public void setPocetDveri(int pocetDveri) {
        this.pocetDveri = pocetDveri;
    }

    @Override
    public String toString() {
        return "Auto:" +super.toString() +
                "pocet Dveri=" + pocetDveri +
                '}';
    }

}
