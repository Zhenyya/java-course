package com.java.woman.oop.motors;

import com.java.woman.oop.Vehicle;

public class MotorVehicle extends Vehicle {

  private Motor motor;

  String name;

  public MotorVehicle(Motor motor) {
    this.motor = motor;
    this.name = "MotorVehicle";
  }

  protected void startMotor() {
    motor.start();
  }

  @Override
  public void drive() {
    startMotor();
  }

  public String getName() {
    return name;
  }
}
