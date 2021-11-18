package project.vessel;

import project.stuff.Transformable;

public interface Containable {

    public void addStuff(Transformable stuff);

    Transformable removeStuff();

    boolean isEmpty();

    void open();

    public void warm(int temperature);


}
