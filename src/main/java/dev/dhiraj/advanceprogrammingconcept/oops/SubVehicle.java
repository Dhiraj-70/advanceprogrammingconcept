package dev.dhiraj.advanceprogrammingconcept.oops;

public class SubVehicle extends Vehicle {
    public static void main(String[] args) {
        SubVehicle subVehicle = new SubVehicle();
        subVehicle.brand ="Hero";
        subVehicle.power = "20HP";
        subVehicle.type = "2WL";
//        subVehicle.price --> not access able due to private access modifier
    }
}
