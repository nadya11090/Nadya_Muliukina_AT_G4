package project.material;

public class Material {
    private double thermalConductivity;
    private String color;
    private double density;

    public Material(double thermalConductivity, String color, double density) {
        this.thermalConductivity = thermalConductivity;
        this.color = color;
        this.density = density;
    }
}
