package com.java.woman.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class TestExceptions {
  public static void main(String[] args) throws IOException {

    testTryCatchFinally();
  }

  private static void testTryCatchFinally() {
    try {
      System.out.println("try");
      work();
      System.out.println("try");
    } catch (Exception e) {
      //        System.exit(0);
      System.out.println("catch");
      throw new SundayException(e);
      // System.out.println("catch");
    } finally {
      System.out.println("finally");
    }

    System.out.println("after finally");
  }

  private static void work() throws Exception {
    final LocalDateTime now = LocalDateTime.now();
    if (now.getDayOfWeek() == DayOfWeek.SATURDAY) {
      throw new Exception("It is SUNDAY. I am not working.");
    }
  }
}
