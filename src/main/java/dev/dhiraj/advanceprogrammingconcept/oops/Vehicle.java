package dev.dhiraj.advanceprogrammingconcept.oops;

public class Vehicle {
    public String brand;
    protected String type;
    String power;
    private int price;

    public void driveVehicle(){
        brand = "Hundai";
        type = "4V";
        power = "456789MP";
        price = 50;
        //private access modifier is only accesable on same class.
        //Default access modifier is only accesable on same class and same package.
        //public access modifier is accessable globally.
        //protected access modifier is on same package and only via sub-class in diff package
    }
}
