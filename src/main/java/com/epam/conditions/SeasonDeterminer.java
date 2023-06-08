package com.epam.conditions;

public class SeasonDeterminer {

  public void tellTheSeason(int monthNumber) {
    if (monthNumber == 0) {
      System.out.println("Wrong month number");
    }

    for (int i = 1; i < 3; i++) {
      if (i == monthNumber || monthNumber == 12) {
        System.out.println("Winter");
      }
    }

    for (int i = 3; i < 6; i++) {
      if (i == monthNumber) {
        System.out.println("Spring");
      }
    }

    for (int i = 6; i < 9; i++) {
      if (i == monthNumber) {
        System.out.println("Summer");
      }
    }

    for (int i = 6; i < 9; i++) {
      if (i == monthNumber) {
        System.out.println("Summer");
      }
    }

    for (int i = 9; i < 12; i++) {
      if (i == monthNumber) {
        System.out.println("Autumn");
      }
    }
  }
}
