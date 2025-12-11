package ua.lviv.iot.algo.part1.lab12.model;

import java.util.Objects;

public class Projector implements Comparable<Projector> {
    private String brand;
    private String model;
    private String resolution;
    private int lampHours;
    private double priceInUsd;

    public Projector(String brand, String model, String resolution, int lampHours, double priceInUsd) {
        this.brand = brand;
        this.model = model;
        this.resolution = resolution;
        this.lampHours = lampHours;
        this.priceInUsd = priceInUsd;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getResolution() {
        return resolution;
    }

    public int getLampHours() {
        return lampHours;
    }

    public double getPriceInUsd() {
        return priceInUsd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Projector projector = (Projector) o;
        return lampHours == projector.lampHours &&
                Double.compare(projector.priceInUsd, priceInUsd) == 0 &&
                Objects.equals(brand, projector.brand) &&
                Objects.equals(model, projector.model) &&
                Objects.equals(resolution, projector.resolution);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, resolution, lampHours, priceInUsd);
    }

    @Override
    public String toString() {
        return "Projector{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", resolution='" + resolution + '\'' +
                ", lampHours=" + lampHours +
                ", priceInUsd=" + priceInUsd +
                '}';
    }

    @Override
    public int compareTo(Projector other) {
        return this.model.compareTo(other.model);
    }
}
