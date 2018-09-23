package com.java.woman;

import com.java.woman.oop.motors.Car;
import com.java.woman.oop.motors.Motor;
import com.java.woman.oop.motors.MotorVehicle;

public class TestName {
  public static void main(String[] args) {
    final MotorVehicle motorVehicle = new MotorVehicle(new Motor());
    final Car car = new Car(new Motor());
    final MotorVehicle motorCar = new Car(new Motor());

    System.out.println(motorVehicle.getName());
    System.out.println(car.getName());
    System.out.println(motorCar.getName());
  }
}
