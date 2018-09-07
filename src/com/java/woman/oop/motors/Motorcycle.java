package com.java.woman.oop.motors;

public class Motorcycle extends MotorVehicle {

  public Motorcycle() {
    super(new Motor());
  }

  @Override
  public void drive() {
    startMotor(); // цей метод позначений як protected в батьківському класі і тому ми можемо його
    // тут викликати
    System.out.println("drive on Motorcycle");
  }
}
