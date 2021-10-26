package tasks.homework.days7_8.package1;

import java.util.Objects;

public class Bubble {

    private int volume;
   private String name;

    public Bubble(int volume, String name) {
        this.volume = volume;
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bubble)) return false;
        Bubble bubble = (Bubble) o;
        return getVolume() == bubble.getVolume() && Objects.equals(getName(), bubble.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVolume(), getName());
    }

    @Override
    public String toString() {
        return "Bubble{" +
                "volume=" + volume +
                ", name='" + name + '\'' +
                '}';
    }
}
