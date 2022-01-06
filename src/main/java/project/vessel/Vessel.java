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

    public Vessel() {

    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Material11 getMaterial() {
        return material;
    }

    public void setMaterial(Material11 material) {
        this.material = material;
    }
}
