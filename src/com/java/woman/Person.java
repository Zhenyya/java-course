package com.java.woman;

import com.java.woman.enumeration.Day;
import com.java.woman.oop.Vehicle;
import com.java.woman.oop.motors.MotorVehicle;

public class Person {

  private Day workingDay;

  public void setWorkingDay(Day workingDay) {
    this.workingDay = workingDay;
  }

  public void drive(Vehicle vehicle) {
    vehicle.drive();
  }

  public void drive(MotorVehicle motorVehicle) {
    motorVehicle.drive();
  }
}
