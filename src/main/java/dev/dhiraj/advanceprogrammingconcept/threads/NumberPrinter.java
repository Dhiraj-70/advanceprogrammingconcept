package dev.dhiraj.advanceprogrammingconcept.threads;

public class NumberPrinter implements Runnable{
    int numberToPrint;
    public NumberPrinter(int numberToPrint) {
        this.numberToPrint = numberToPrint;
    }
    @Override
    public void run() {
        System.out.println(numberToPrint +" - Printed by Thread "+Thread.currentThread().getName());
    }
}
