package tasks.homework.days7_8.package1.objects;

import java.util.Objects;

public class Water {

    private String color;
    private String smell;

    public Water(String color, String smell) {
        this.color = color;
        this.smell = smell;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Water)) return false;
        Water water = (Water) o;
        return Objects.equals(getColor(), water.getColor()) && Objects.equals(getSmell(), water.getSmell());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getSmell());
    }

    @Override
    public String toString() {
        return "Water{" +
                "color='" + color + '\'' +
                ", smell='" + smell + '\'' +
                '}';
    }
}
