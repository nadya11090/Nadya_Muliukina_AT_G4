package project.stuff;

public abstract class Water implements Transformable {
    private String color = "no";
    private String transparency = "transparent";
    private String smell = "no";
    private int temperature = 0;

    public Water(String color, String transparency, String smell, int temperature) {

    }

    public String getColor() {

        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public String getTransparency() {
        return transparency;
    }

    public void setTransparency(String transparency) {

        this.transparency = transparency;
    }

    public String getSmell() {

        return smell;
    }

    public void setSmell(String smell) {

        this.smell = smell;
    }

    public int getTemperature() {

        return temperature;
    }

    @Override
    public void setOpened() {

    }

    public void setTemperature(int temperature) {

        this.temperature = temperature;
    }



}
