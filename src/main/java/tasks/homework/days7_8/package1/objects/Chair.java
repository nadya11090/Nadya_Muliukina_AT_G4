package tasks.homework.days7_8.package1.objects;

import java.util.Objects;

public class Chair {
    int height;
    int widht;

    public Chair(int height, int widht) {
        this.height = height;
        this.widht = widht;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidht() {
        return widht;
    }

    public void setWidht(int widht) {
        this.widht = widht;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Chair)) return false;
        Chair chair = (Chair) o;
        return getHeight() == chair.getHeight() && getWidht() == chair.getWidht();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getHeight(), getWidht());
    }

    @Override
    public String toString() {
        return "Chair{" +
                "height=" + height +
                ", widht=" + widht +
                '}';
    }
}
