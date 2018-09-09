package com.java.woman.enumeration;

public enum Day {

  MONDAY(1),
  TUESDAY(2),
  WEDNESDAY(3),
  THURSDAY(4),
  FRIDAY(5),
  SATURDAY(6),
  SUNDAY(7);

  private final int number;

  Day(int number) {
    System.out.println("const");
    this.number = number;
  }

  public static Day get(int number) {
    final Day[] values = values();
    for (Day day : values) {
      if (day.number == number) {
        return day;
      }
    }
    return null;
  }

}
