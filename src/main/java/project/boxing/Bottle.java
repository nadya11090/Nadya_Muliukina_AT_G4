package project.boxing;

public class Bottle {
    private double volume;
    private String SparklingWater;

    public void open() {
       // this.water.setOpened(true);

        System.out.printf("Change of state to: open").println();

    }

    public void warm(int temperature){

        System.out.printf("Warming water to: %s", temperature).println();

    }
    public SparklingWater getWater() {
        System.out.printf("Returning an object: water").println();
        return getWater();
    }

    public SparklingWater setWater(SparklingWater water) {
        System.out.printf("Adding a new object: water").println();
        return new SparklingWater(false);

    }

        public Bottle(double volume) {
        this.volume = volume;
    }

}
