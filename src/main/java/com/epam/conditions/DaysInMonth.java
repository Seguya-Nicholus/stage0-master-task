package com.epam.conditions;

public class DaysInMonth {

  public void printDays(int year, int month) {
    if (year < 0 || month < 0) {
      System.out.println("invalid date");
    } else {
      int number_Of_DaysInMonth = 0;

      switch (month) {
        case 1:
          month = 1;
          number_Of_DaysInMonth = 31;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 2:
          month = 2;
          if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            number_Of_DaysInMonth = 29;
          } else {
            number_Of_DaysInMonth = 28;
          }
          System.out.println(number_Of_DaysInMonth);
          break;
        case 3:
          month = 3;
          number_Of_DaysInMonth = 31;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 4:
          month = 4;
          number_Of_DaysInMonth = 30;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 5:
          month = 5;
          number_Of_DaysInMonth = 31;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 6:
          month = 6;
          number_Of_DaysInMonth = 30;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 7:
          month = 7;
          number_Of_DaysInMonth = 31;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 8:
          month = 8;
          number_Of_DaysInMonth = 31;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 9:
          month = 9;
          number_Of_DaysInMonth = 30;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 10:
          month = 10;
          number_Of_DaysInMonth = 31;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 11:
          month = 11;
          number_Of_DaysInMonth = 30;
          System.out.println(number_Of_DaysInMonth);
          break;
        case 12:
          month = 12;
          number_Of_DaysInMonth = 31;
          System.out.println(number_Of_DaysInMonth);
          break;
        default:
          System.out.println("invalid date");
      }
    }
  }
}
