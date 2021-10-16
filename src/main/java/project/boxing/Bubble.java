package project.boxing;

public class Bubble {
    private double volume = 03;
    private String gas;

    public Bubble(String gas) {
        this.gas = gas;
    }

    public void cramp() {
       System.out.println("Cramp!");
    }

    public double getVolume() {
        System.out.printf("Returning the volume of the bubble").println();
        return volume;
    }

}
