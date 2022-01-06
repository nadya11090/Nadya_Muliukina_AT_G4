package project.vessel;

import project.material.Material11;

public class Bottle extends Vessel {
    private double volume;
    private String SparklingWater;

    public Bottle(double volume) {
        super();
    }

    public void open() {
        // this.water.setOpened(true);

        System.out.printf("Change of state to: open").println();

    }

    public void warm(int temperature) {

        System.out.printf("Warming water to: %s", temperature).println();

    }

    public project.stuff.SparklingWater getWater() {
        System.out.printf("Returning an object: water").println();
        return getWater();
    }

    public Bottle(double volume, double diameter, int weight, Material11 material) {
        super(volume, 2.0, weight, material);

    }

}
