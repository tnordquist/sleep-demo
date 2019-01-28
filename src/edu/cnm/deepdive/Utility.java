package edu.cnm.deepdive;

import java.util.Scanner;

public class Utility {

  static void processInput() {
    Scanner scanner = new Scanner(System.in);
    while (true) { // Repeat input forever.
      String input = scanner.nextLine().trim(); // trim() removes white space from
                                                // beginning and end of line only.
      if (!input.isEmpty()) {
        System.out.println(input.toUpperCase());

      }
    }

  }

  static void takeNap(long duration) {
    try {
      System.out.printf("Going to sleep for %.2f seconds\u2026", duration/1000.0);
      // a "\" introduces
      // an escape for embedding a unicode char
      // in a string.
      Thread.sleep(duration);
    } catch (InterruptedException e) {
      // DO NOTHING!
    } finally { // finally must always be the last clause of a try
      System.out.println("\u2026waking up now!");

    }
  }
}
