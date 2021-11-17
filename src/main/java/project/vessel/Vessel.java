package project.vessel;

import project.material.Material11;

public abstract class Vessel {
    private double volume;
    private double diameter;
    private int weight;
    private Material11 material;

    public Vessel(double volume, double diameter, int weight, Material11 material) {
        this.volume = volume;
        this.diameter = diameter;
        this.weight = weight;
        this.material = material;
    }
}
