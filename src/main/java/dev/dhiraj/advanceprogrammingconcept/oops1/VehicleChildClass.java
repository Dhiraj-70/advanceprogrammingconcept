package dev.dhiraj.advanceprogrammingconcept.oops1;

import dev.dhiraj.advanceprogrammingconcept.oops.Vehicle;

public class VehicleChildClass extends Vehicle {
    public static void main(String[] args) {
        VehicleChildClass vehicle = new VehicleChildClass();
        vehicle.brand = "Maruti";
        vehicle.type = "4WL";
        //To use the protected access modifer it must be the sub class
    }
}
