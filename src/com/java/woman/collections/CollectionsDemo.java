package com.java.woman.collections;

import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {
    // List, Set extends Collection, Map
    //   ArrayList, LinkedList
    Number[] numbersArray = {1, 2, 3, 1};
    //    System.out.println(numbersArray[3]);
    System.out.println(numbersArray.length);

    //  arrayListDemo(numbersArray);
    // linkedListDemo(numbersArray);
      hashSetDemo(numbersArray);

  }

  private static void hashSetDemo(Number[] numbersArray) {
    Set<Number> numbers = new HashSet<>(Arrays.asList(numbersArray));
    print(numbers);
  }

  private static void linkedListDemo(Number[] numbersArray) {
    LinkedList<Number> numbers = new LinkedList<>(Arrays.asList(numbersArray));
    System.out.println(numbers.get(2));
    print(numbers);
  }

  private static void arrayListDemo(Number[] numbersArray) {
    ArrayList<Number> numbers = new ArrayList<>(Arrays.asList(numbersArray));
    System.out.println(numbers.get(2));
    print(numbers);
  }

  private static void print(Collection<Number> numbers) {
    System.out.println(numbers.size());

    System.out.println();
    for (Number number : numbers) {
      System.out.println(number);
    }
    System.out.println();
    numbers.forEach(number -> System.out.println(number));
    System.out.println();
    numbers.forEach(System.out::println);
  }
}
