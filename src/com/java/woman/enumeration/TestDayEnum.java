package com.java.woman.enumeration;

import com.java.woman.Person;

public class TestDayEnum {
  public static void main(String[] args) {
    final Day day = Day.get(5);

    System.out.println(day.name());
    System.out.println(day);
    System.out.println(day.ordinal());
    System.out.println(Day.FRIDAY);

    final Person person = new Person();
    person.setWorkingDay(Day.THURSDAY);
  }
}
