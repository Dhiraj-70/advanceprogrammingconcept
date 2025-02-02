package dev.dhiraj.advanceprogrammingconcept.collections;

public class Car implements Comparable<Car>{
    @Override
    public int compareTo(Car other) {
//        return this.speed - other.speed; //if this.speed is less than other.speed then it will return -ve
        // so, this obj should come before other object and vice-versa
        return other.speed - this.speed;
    }

    String name;
    int price;
    int speed;

    public Car(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
