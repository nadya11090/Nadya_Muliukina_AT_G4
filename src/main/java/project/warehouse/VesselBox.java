package project.warehouse;

import project.vessel.Containable;

import java.util.List;

public class VesselBox {

    private String name = "I am box with <%d> <%d>";

    private int capacity;

    private List<Containable> box;

    private long id;

    public boolean equals(Object o){

        return(true);
    }

    public int hashCode(){
        return(0);
    }

    public VesselBox(String name, List<Containable> box){

    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Containable> getBox() {
        return box;
    }

    public long getId() {
        return id;
    }
}
