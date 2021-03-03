package com.orange.topics.scannerPractice.ex2;

import java.util.Objects;

public class Mancare {
    private String nume;
    private Double pret;

    public Mancare(String nume, Double pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mancare mancare = (Mancare) o;
        return Objects.equals(nume, mancare.nume) && Objects.equals(pret, mancare.pret);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, pret);
    }
}
