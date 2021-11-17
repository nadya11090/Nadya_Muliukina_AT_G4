package project.warehouse;

import project.vessel.Containable;

import java.util.List;

public class VesselBox {

    private String name; //"I am box with <25> <Bottles>"

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

}
