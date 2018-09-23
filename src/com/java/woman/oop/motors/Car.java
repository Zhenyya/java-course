package com.java.woman.oop.motors;

public class Car extends MotorVehicle {

  String name;

  public Car(Motor motor) {
    // Нащадок мусить викликати конструктор батькувського класу, щоб ініціліазувати
    // зміну, яка у батьківському класу
    super(motor);
    this.name = "Car";
  }

  @Override
  public void drive() {
    super.drive();
    System.out.println("drive car");
  }

  @Override
  public String getName() {
    return name;
  }
}
