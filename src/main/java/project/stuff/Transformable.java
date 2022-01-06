package project.stuff;

public interface Transformable {

    void addStuff (Transformable stuff);
    Transformable removeStuff();
    boolean isEmpty();
    int getFreeSpace();
    void open();
    void close();
    void warm(int temperature);

}
