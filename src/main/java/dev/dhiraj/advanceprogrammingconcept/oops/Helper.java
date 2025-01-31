package dev.dhiraj.advanceprogrammingconcept.oops;

public class Helper {
    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();

        A a = new C();
        a.age = 10;
        a.name = "Alex";
        ((C)a).company = "Google";
    }

}
