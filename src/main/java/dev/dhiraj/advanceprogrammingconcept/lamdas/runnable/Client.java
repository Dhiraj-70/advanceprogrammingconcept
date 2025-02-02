package dev.dhiraj.advanceprogrammingconcept.lamdas.runnable;

public class Client {
    public static void main(String[] args) {
        System.out.println("Hello World Printed by "+Thread.currentThread().getName());
        Runnable runnable = () -> {
            System.out.println("Hello World Printed by "+Thread.currentThread().getName());
        };
        Thread thread = new Thread(runnable);
        thread.start();

        Runnable runnable1 = () -> System.out.println("Hello World Printed by "+Thread.currentThread().getName());
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        new Thread(() -> System.out.println("Hello World Printed by "+Thread.currentThread().getName())).start();
    }
}
