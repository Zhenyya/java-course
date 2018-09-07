package com.java.woman;

import com.java.woman.oop.Vehicle;
import com.java.woman.oop.motors.MotorVehicle;

public class Person {

  public void drive(Vehicle vehicle) {
    vehicle.drive();
  }

  public void drive(MotorVehicle motorVehicle) {
    motorVehicle.drive();
  }
}
