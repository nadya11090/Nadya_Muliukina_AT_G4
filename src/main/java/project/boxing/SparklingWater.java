package project.boxing;

public class SparklingWater extends Water {
    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(boolean isOpened) {
        this.isOpened = isOpened;
    }

    public void pump(Bubble[] bubbles) {
        System.out.printf("Saturation of water with gas").println();
    }

    public void setOpened(boolean isOpened) {
        System.out.printf("Change of state of water to open").println();
    }

    private void isOpened() {

        System.out.printf("Checking water for openness").println();
    }

    // private degas() {
    //     System.out.printf("Saturation of water with gas").println();
    //     return;
    //}

    public boolean isSparkle() {
        System.out.printf("Test for gas content in water").println();

    }
}
