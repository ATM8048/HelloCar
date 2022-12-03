package org.example;

public class Car {
    private String model;
    private double geschwindigkeit;
    private int jahr;
    private int sitzplaetze;

public Car(String model, double geschwindigkeit, int jahr, int sitzplaetze){
    this.model = model;
    this.geschwindigkeit = geschwindigkeit;
    this.jahr = jahr;
    this.sitzplaetze = sitzplaetze;
}
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public int getSitzplaetze() {
        return sitzplaetze;
    }

    public void setSitzplaetze(int sitzplaetze) {
        this.sitzplaetze = sitzplaetze;
    }

    @Override
    public String toString() {
        return "Car" +
                "model='" + model + '\'' +
                ", geschwindigkeit=" + geschwindigkeit +
                ", jahr=" + jahr +
                ", sitzplaetze=" + sitzplaetze +
                '}';
    }
}