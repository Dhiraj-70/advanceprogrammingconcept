package dev.dhiraj.advanceprogrammingconcept.lamdas;

public class Client {
    public static void main(String[] args) {
        //way 1
        SampleClass sampleClass = new SampleClass();
        sampleClass.fun1();

        //way 2 - Anonymous Class
        SampleFunctionalInterface sampleFunctionalInterface = new SampleFunctionalInterface() {
            @Override
            public void fun1() {
                System.out.println("Anonymous Class");
            }
        };
        sampleFunctionalInterface.fun1();
    }
}
