package tasks.homework.days7_8.package1.objects;

import java.util.Objects;

public class Sand {
    private int weight;
    private String name;

    public Sand(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
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
        if (!(o instanceof Sand)) return false;
        Sand sand = (Sand) o;
        return getWeight() == sand.getWeight() && Objects.equals(getName(), sand.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getName());
    }

    @Override
    public String toString() {
        return "Sand{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
