package com.java.woman;

import com.java.woman.oop.Bike;
import com.java.woman.oop.Vehicle;
import com.java.woman.oop.motors.Car;
import com.java.woman.oop.motors.Motor;
import com.java.woman.oop.motors.Motorcycle;

public class Main {

  public static void main(String[] args) {
    Person person = new Person();

    person.drive(new Bike());

    // person.drive(new Vehicle()); //якщо забрати коментар, то це й код не скомпілюється, бо клас
    // Vehicle абстракний

    Motor motor = new Motor();
    Car car = new Car(motor);
    person.drive(car);

    person.drive(new Motorcycle());
  }
}
