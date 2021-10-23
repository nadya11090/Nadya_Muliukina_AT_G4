package project.boxing;

import project.material.Material;

public class Bottle extends Vessel{
    private double volume;
    private String SparklingWater;

    public void open() {
       // this.water.setOpened(true);

        System.out.printf("Change of state to: open").println();

    }

    public void warm(int temperature){

        System.out.printf("Warming water to: %s", temperature).println();

    }
    public project.liquid.SparklingWater getWater() {
        System.out.printf("Returning an object: water").println();
        return getWater();
    }

    //public SparklingWater setWater(SparklingWater water) {
        //System.out.printf("Adding a new object: water").println();
       // return new SparklingWater(blue);

  //  }

        public Bottle(double volume, double diameter, int weight, Material material) {
            super(volume, diameter, weight, material);

        }

}
