package com.java.woman;

import com.java.woman.Person;
import com.java.woman.enumeration.Day;

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
