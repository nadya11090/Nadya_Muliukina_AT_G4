package tasks.classwork.Day6;

import java.util.Objects;

public class Key {
    private String name;
    private String material;
    private int price;

    public Key(String name, String material, int price) {
        this.name = name;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key key = (Key) o;
        return getPrice() == key.getPrice() && Objects.equals(getName(), key.getName()) && Objects.equals(getMaterial(), key.getMaterial());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMaterial(), getPrice());
    }

    @Override
    public String toString() {       //все в генерейт
        return "Key{" +
                "name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", price=" + price +
                '}';
    }
}
