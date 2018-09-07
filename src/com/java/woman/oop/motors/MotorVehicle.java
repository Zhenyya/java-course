package com.java.woman.oop.motors;

import com.java.woman.oop.Vehicle;

public abstract class MotorVehicle extends Vehicle {

  private Motor motor;

  public MotorVehicle(Motor motor) {
    this.motor = motor;
  }

  protected void startMotor() {
    motor.start();
  }

  @Override
  public void drive() {
    startMotor();
  }
}
