package tasks.homework.basetask;

public class Obstacle {
    private String description;
    private String severity;
    public void printMouseDetails() {
        System.out.println("Возникло " + this.severity + "препятствие " + this.description);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Obstacle(String description, String severity) {
        this.description = description;
        this.severity = severity;
    }
}
