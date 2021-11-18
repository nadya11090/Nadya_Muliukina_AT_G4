package project.warehouse;

import project.material.Material;
import project.stuff.Transformable;
import project.vessel.Containable;

public class Factory {

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    private Warehouse warehouse;

    public void createVesselBox(int capacity, double volume, Material material, Transformable stuff, Class<?> clazz){

    }

    private Containable createVessel(double volume, Material material, Transformable stuff, Class<?> clazz){
        return (null);
    }
}
