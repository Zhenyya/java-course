package com.java.woman.operators;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
  public static void main(String[] args) {
    final BigDecimal bigDecimal = new BigDecimal(2.6123);
    final BigDecimal newValue = bigDecimal.setScale(2, RoundingMode.CEILING);

    System.out.println(bigDecimal);
    System.out.println(newValue);
  }
}
